import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        //crosshairs:

        graphics.setColor(Color.RED);
        graphics.drawLine(150, 50, 150, 250);
        graphics.setColor(Color.green);
        graphics.drawLine(50, 150, 250, 150);

        //frame - rect around the cross
        //graphics.setColor(Color.blue);
        //graphics.drawRect(50, 50, 200, 200);
        //the moon within a rect
        //graphics.setColor(Color.black);
        //graphics.drawOval(50, 50, 200, 200);
        //black hole in the middle
        //graphics.fillOval(140,140,20,20);

        graphics.setColor(Color.yellow);
        int[] xpoints = {50, 250, 50, 250};
        int[] ypoints = {50, 250, 250, 50};
        int npoints = 4;

        graphics.drawPolygon(xpoints, ypoints, npoints);
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