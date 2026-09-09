from PIL import Image
from pathlib import Path

def convert(color):
    if color == "R": return (237, 28, 36)
    elif color == "B": return (0, 0, 0)
    elif color == "Y": return (255, 242, 0)
    else: return color

folder = Path(__file__).parent
input_text_file = open(folder / "input.txt", "r")
lines = input_text_file.readlines()
width, height = len(lines[0].split()), len(lines)
output_image_file = Image.new("RGB", (width, height))

for y in range(height):
    line = lines[y]
    pixels = line.split()
    for x in range(width):
        pixel = convert(pixels[x])
        output_image_file.putpixel((x,y), pixel)

output_image_file.save(folder / "output.png")

input_text_file.close()
output_image_file.close()