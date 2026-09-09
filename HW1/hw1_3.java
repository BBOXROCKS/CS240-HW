package CS240.HW1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintWriter;
import javax.imageio.ImageIO;

public class hw1_3 {
    public static void main(String[] args) throws Exception {
        PrintWriter outputFile = new PrintWriter("output.txt");

        BufferedImage imageFile = ImageIO.read(new File("smiley.png"));

        int width = imageFile.getWidth();
        int height = imageFile.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int color = imageFile.getRGB(x, y);

                outputFile.print(convert(color) + " ");
            }
            outputFile.println();
        }

        outputFile.close();
    }

    public static String convert(int color) {
        int red = (color >> 16) & 0xFF;
        int green = (color >> 8) & 0xFF;
        int blue = color & 0xFF;

        if (red == 237 && green == 28 && blue == 36) {
            return "R";
        } else if (red == 0 && green == 0 && blue == 0) {
            return "B";
        } else if (red == 255 && green == 242 && blue == 0) {
            return "Y";
        } else {
            return "(" + red + "," + green + "," + blue + ")";
        }
    }
}