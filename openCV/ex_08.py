import sys
import cv2
import numpy as np

cap1 = cv2.VideoCapture('videos/weather_presenter.mp4')

if not cap1.isOpened():
    print('video open failed!')
    sys.exit()
    

# 배경 동영상 불러오기
cap2 = cv2.VideoCapture('videos/dog.mp4')

if not cap2.isOpened():
    print('video open failed!')
    sys.exit
    

# 두 동영상의 크기, FPS는 같다고 가정
w = round(cap1.get(cv2.CAP_PROP_FRAME_WIDTH))
h = round(cap1.get(cv2.CAP_PROP_FRAME_HEIGHT))
frame_cnt1 = round(cap1.get(cv2.CAP_PROP_FRAME_COUNT))
frame_cnt2 = round(cap2.get(cv2.CAP_PROP_FRAME_COUNT))
fps = round(cap1.get(cv2.CAP_PROP_FPS))


# 프레임 간 시간 간격 설정 
delay = int(1000 / fps)


# 전체 동영상 재생
while True: # 무한 루프
    ret1, frame1 = cap1.read() # 녹색 배경 영상 읽어오기
    
    if not ret1: # 영상1 프레임이 끝나면 종료
        break


    ret2, frame2 = cap2.read()
    chromakey = frame1[:10, :10, :] # (0,0)~(10,10)까지의 정사각형 좌표
    hsv_chroma = cv2.cvtColor(chromakey, cv2.COLOR_BGR2HSV)
    hsv_img = cv2.cvtColor(frame1, cv2.COLOR_BGR2HSV)

    height1, width1 = frame2.shape[:2]
    height2, width2 = frame2.shape[:2]
    x = (width2 - width1) // 2
    y = height2 - height1
    w = x + width1
    h = y + height1
    
    if not ret2: #영상 2 프레임이 끝나면 종료
        break
        
    chroma_h = hsv_chroma[:, :, 0] # 크로마키의 H 값 (초록색 또는 파란색)
    lower = np.array([chroma_h.min()-20, 100, 100]) # 크로마키의 최소 범위
    upper = np.array([chroma_h.max()+20, 255, 255]) # 크로마키의 최대 범위

    # HSV 색 공간에서 녹색 영역을 검출하여 합성
    mask = cv2.inRange(hsv_img, lower, upper) # 영상, 최솟값, 최댓값
    mask_inv = cv2.bitwise_not(mask)
    roi = frame2[y:h, x:w] 

    fg = cv2.bitwise_and(frame1, frame1, mask=mask_inv) # 사람만 떼내기
    bg = cv2.bitwise_and(roi, roi, mask=mask)       # 배경만 떼내기
    frame2[y:h, x:w] = fg + bg     
    # cv2.copyTo(frame2, mask, frame1)
        
    cv2.imshow('frame', frame2)
    key = cv2.waitKey(delay)
    
    if key == ord('q'): # q 누르면 영상 종료
        break
        
cap1.release() # 사용자 자원 해제
cap2.release()
cv2.destroyAllWindows()