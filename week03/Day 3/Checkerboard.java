import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = 0;
        int y = 0;
        int size = 20;

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        graphics.setColor(Color.green);
                    } else {
                        graphics.setColor(Color.black);
                    }
                }else{
                    if(j % 2 != 0){
                        graphics.setColor(Color.green);
                    } else {
                        graphics.setColor(Color.black);
                    }
                }
                graphics.fillRect(x, y , size, size);
                x += size;
            }
            x = 0;
            y += size;
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