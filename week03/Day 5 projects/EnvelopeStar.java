import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.green);
        graphics.drawLine(0, HEIGHT  / 2, WIDTH , HEIGHT / 2); //horisontal line
        //graphics.drawLine(WIDTH / 2, 5, WIDTH / 2, HEIGHT);  //vertical line

        //right top quarter
        int gap = WIDTH / 16;
        int x1a = WIDTH / 2;
        int y1a = 0;
        int x2a = WIDTH / 2 + gap;
        int y2a = HEIGHT / 2;
        graphics.setColor(Color.green);
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(x1a, y1a, x2a, y2a);
            x2a += gap;
            y1a += gap;
        }

        //right bottom quarter
        int x1b = WIDTH;
        int y1b = HEIGHT / 2;
        int x2b = WIDTH / 2;
        int y2b = HEIGHT / 2 + gap;
        graphics.setColor(Color.green);
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(x1b, y1b, x2b, y2b);
            x1b -= gap;
            y2b += gap;
        }
        //left bottom quarter
        int x1c = WIDTH / 2;
        int y1c = HEIGHT;
        int x2c = WIDTH / 2 - gap;
        int y2c = HEIGHT / 2;
        graphics.setColor(Color.green);
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(x1c, y1c, x2c, y2c);
            y1c -= gap;
            x2c -= gap;
        }
        //left top quarter
        int x1d = 0;
        int y1d = HEIGHT /2;
        int x2d = WIDTH / 2;
        int y2d = HEIGHT / 2 - gap;
        graphics.setColor(Color.green);
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(x1d, y1d, x2d, y2d);
            x1d += gap;
            y2d -= gap;
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