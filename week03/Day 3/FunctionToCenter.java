import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void functToCent(Graphics graphics, int a, int b){
        Random rand = new Random();
        int red = rand.nextInt(255);
        int green = rand.nextInt(255);
        int blue = rand.nextInt(255);
        Color colour = new Color(red, green, blue);
        graphics.setColor(colour);

        graphics.drawLine(a, b, WIDTH / 2, HEIGHT / 2);
    }
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;
        int gap = 20;
        int stepsV = WIDTH / gap;
        int stepsH = HEIGHT / gap;

        for (int i = 0; i <= stepsV; i++) {
            y = 0;
            functToCent(graphics, x, y);
            x += gap;
        }
        for (int i = 0; i <= stepsH; i++) {
            x = WIDTH;
            functToCent(graphics, x, y);
            y += gap;
        }
        for (int i = 0; i <= stepsV; i++) {
            y = HEIGHT;
            functToCent(graphics, x, y);
            x -= gap;
        }
        for (int i = 0; i <= stepsH; i++) {
            x = 0;
            functToCent(graphics, x, y);
            y -= gap;
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