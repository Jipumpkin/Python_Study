from PIL import ImageFont, ImageDraw, Image
import numpy as np
import cv2

img = cv2.imread('images/02_bingbong.jpeg')
img = cv2.rectangle(img, (180,35),(350,300),(0,0,255),3)

font = ImageFont.truetype("fonts/gulim.ttc", 30)
img_pil = Image.fromarray(img)
draw = ImageDraw.Draw(img_pil)


draw.text((180,10),'빙봉', font = font, fill = (255,0,0,0))