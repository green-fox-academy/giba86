import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int gap = WIDTH / 16;
        int x1g = 0;
        int y1g = 2 * gap;
        int x2g = gap;
        int y2g = HEIGHT;
        graphics.setColor(Color.green);
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(x1g, y1g, x2g, y2g);
            x2g += gap;
            y1g += gap;
        }
        int x1m = 2 *gap;
        int y1m = 0;
        int x2m = WIDTH;
        int y2m = gap;
        graphics.setColor(Color.magenta);
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(x1m, y1m, x2m, y2m);
            x1m += gap;
            y2m += gap;
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