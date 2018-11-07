import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        int x1 = 50;
        int x2 = 180;
        int y1 = 180;
        int y2 = 50;
        Color[] colors = {Color.blue, Color.cyan, Color.green, Color.magenta};
        graphics.setColor(colors[1]);
        graphics.drawLine(x1, y2, x2, y2);
        graphics.setColor(colors[2]);
        graphics.drawLine(x2, y2, x2, y1);
        graphics.setColor(colors[3]);
        graphics.drawLine(x2, y1, x1, y1);
        graphics.setColor(colors[0]);
        graphics.drawLine(x1, y1, x1, y2);
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