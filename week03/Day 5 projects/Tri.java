import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tri {
    public static void mainDraw(Graphics graphics) {
        int startingPoint = 0;
        int sideLength = 20;
        int sizeOfTriangles = WIDTH / sideLength;
        int heightOfTriangles = sizeOfTriangles;
        int heightChanger =  (int) (Math.sqrt(3) / 2 * sideLength);
        int[] x = {startingPoint , startingPoint + sideLength,  startingPoint + (sideLength / 2)}; //Vertexes of Triangle =  A, C, B
        int[] y = {HEIGHT - startingPoint , HEIGHT - startingPoint, (int) (HEIGHT - Math.sqrt(3) / 2 * sideLength)};
        int n = 3; // as it is a triangle

        for (int i = 0; i < heightOfTriangles; i++) {
            for (int j = 0; j < sizeOfTriangles; j++) {
                graphics.drawPolygon(x, y, n);
                x[0] += sideLength;
                x[1] += sideLength;
                x[2] += sideLength;
            }
            sizeOfTriangles --;
            x[0] = startingPoint + (sideLength / 2);
            x[1] = startingPoint + sideLength + (sideLength / 2);
            x[2] = startingPoint + 2 * (sideLength / 2);
            y[0] -= heightChanger;
            y[1] -= heightChanger;
            y[2] -= heightChanger;
            startingPoint += (sideLength / 2);
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