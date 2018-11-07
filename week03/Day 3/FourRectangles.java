import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Color[] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray,
                Color.green, Color.lightGray, Color.magenta, Color.magenta,
                Color.orange, Color.pink, Color.red, Color.white, Color.yellow};
        Random rand = new Random();

        int size = 20;
        for (int i = 0; i < 4; i++) {
            int randColor = rand.nextInt(12);
            graphics.setColor(colors[randColor]);
            int x = rand.nextInt(300)+15;
            int y = rand.nextInt(300)+15;
            graphics.fillRect(x, y, size, size);
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