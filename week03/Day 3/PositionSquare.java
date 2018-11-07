import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
    public static void drawSquares(Graphics graphics, int x, int y){
        int SquareSize = 50;
        graphics.fillRect(x , y, 50, 50);
    }
    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        Color[] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray,
                Color.green, Color.lightGray, Color.magenta, Color.magenta,
                Color.orange, Color.pink, Color.red, Color.white, Color.yellow};
        Random rand = new Random();

            for (int i = 0; i < 3; i++) {
                int a = rand.nextInt(200) + 5;
                int b = rand.nextInt(200) + 5;
                int randColor = rand.nextInt(12);
                graphics.setColor(colors[randColor]);
                drawSquares(graphics, a, b);
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