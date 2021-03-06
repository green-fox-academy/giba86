import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void rainbowDrawer(Graphics graphics, int size, Color colour){
        graphics.setColor(colour);
        graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
    }
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        Random rand = new Random();
        int size = 320;
        for (int i = 0; i < 32; i++) {
            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            Color colour = new Color(red, green, blue);
            rainbowDrawer(graphics, size, colour);
            size -=  10;
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}