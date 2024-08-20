import cv2
import numpy as np

video = cv2.VideoCapture(0)

while video.isOpened():
    ret, frame = video.read()

    if ret:
        hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

        lower_blue = np.array([110, 100, 100])
        upper_blue = np.array([150, 255, 255])
        lower_green = np.array([50, 100, 100])
        upper_green = np.array([90, 255, 255])
        lower_red = np.array([-10, 100, 100])
        upper_red = np.array([30, 255, 255])

        mask_blue = cv2.inRange(hsv, lower_blue, upper_blue)
        mask_green = cv2.inRange(hsv, lower_green, upper_green)
        mask_red = cv2.inRange(hsv, lower_red, upper_red)

        res1 = cv2.bitwise_and(frame, frame, mask=mask_blue)
        res2 = cv2.bitwise_and(frame, frame, mask=mask_green)
        res3 = cv2.bitwise_and(frame, frame, mask=mask_red)

        cv2.imshow('Original', frame)
        cv2.imshow('Blue', res1)
        cv2.imshow('Green', res2)
        cv2.imshow('Red', res3)

        if cv2.waitKey(25) == ord('q'):
            break

    else:
        print('Video 종료')
        break

video.release()
cv2.destroyAllWindows()