import cv2
import numpy as np

img = cv2.imread('images/01_lenna.png')
mask = cv2.imread('images/02_bingbong.jpeg')

rows, cols, channels = mask.shape

roi = img[140:140+rows, 200:200+cols]

mask2gray = cv2.cvtColor(mask, cv2.COLOR_BGR2GRAY)
ret, mask_b = cv2.threshold(mask2gray, 200,255,cv2.THRESH_BINARY)

mask_b_inv = cv2.bitwise_not(mask_b)

img_bg = cv2.bitwise_and(roi,roi,mask=mask_b)
img_fg = cv2.bitwise_and(mask,mask,mask=mask_b_inv)

bg_fg = cv2.add(img_bg, img_fg)
img[140:140+rows, 200:200+cols] = bg_fg

cv2.imshow('img', img)
cv2.waitKey(0)
cv2.destroyAllWindows()