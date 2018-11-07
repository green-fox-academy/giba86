import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, WIDTH);

        int size = 2;
        Random rand = new Random();

        for (int i = 0; i < 150; i++) {
            int blue = rand.nextInt(255);           //same color code for the 3 value generates a shade between white and black
            Color colour = new Color(blue, blue, blue);
            graphics.setColor(colour);
            int x = rand.nextInt(310) + 10;
            int y = rand.nextInt(310) + 10;
            graphics.fillRect(x, y, size, size);
        }
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
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