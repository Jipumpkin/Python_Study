import cv2
import numpy as np
img = cv2.imread('images/01_lenna.png')
cv2.imshow('original', img)

hsv = cv2.cvtColor(img,cv2.COLOR_BGR2HSV)

#주황색
lower = np.array([-20,100,100])
upper = np.array([20,255,255])

#노란색
# lower = np.array([20,100,100])
# upper = np.array([50,255,255])
# #초록색
# lower = np.array([50,100,100])
# upper = np.array([80,255,255])

#hsv 안에서 lower~ upper 사이에 값이 아니면 전부다 0으로 채움
mask = cv2.inRange(hsv, lower, upper)
img2 = cv2.bitwise_and(img,img, mask=mask)

cv2.imshow('red', img2)

cv2.waitKey(0)
cv2.destroyAllWindows()