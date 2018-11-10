import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int scennerke = 20; // resolution value
        int lines = 10; // if scennerke <=10, lines <= 16
        int canvasG = HEIGHT / scennerke;
        int gap = canvasG / lines;

        int[][] greenCoordinates = {{0, 0}, {gap, canvasG}};
        int[][] magentaCoordinates = {{0, 0}, {canvasG, gap}};

        for (int rows = 0; rows < scennerke; rows++) {
            for (int cols = 0; cols < scennerke; cols++) {
                greenAndMagnetaLines(graphics, greenCoordinates, magentaCoordinates, lines, gap);

                greenCoordinates[1][1] += canvasG;
                greenCoordinates[1][0] -= canvasG;
                magentaCoordinates [0][0] -= canvasG;
                magentaCoordinates [0][1] += canvasG;
            }
            greenCoordinates[0][0] += canvasG;
            greenCoordinates[0][1] = 0;
            greenCoordinates[1][0] += canvasG;
            greenCoordinates[1][1] = canvasG;
            magentaCoordinates[0][0] += canvasG;
            magentaCoordinates[0][1] = 0;
            magentaCoordinates[1][0] += canvasG;
            magentaCoordinates[1][1] = gap;
        }
    }
    public static void greenAndMagnetaLines(Graphics graphics, int[][] green, int[][] magenta, int size, int gaps){
        for (int i = 0; i < size; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(green[0][0], green[0][1], green[1][0], green[1][1]);
            green[0][1] += gaps;
            green[1][0] += gaps;

            graphics.setColor(Color.magenta);
            graphics.drawLine(magenta[0][0], magenta[0][1], magenta[1][0], magenta[1][1]);
            magenta[0][0] += gaps;
            magenta[1][1] += gaps;
        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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