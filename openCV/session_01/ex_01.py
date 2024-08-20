import cv2

cv2.startWindowThread()
image = cv2.imread('images/01_lenna.png', cv2.IMREAD_COLOR)
cv2.imshow('Lena', image)
cv2.waitKey(0)
cv2.destroyAllWindows()