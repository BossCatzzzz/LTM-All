
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Ball {

    private JPanel box;
    private static final int XSIZE = 10, YSIZE = 10;
    private int x = 0, y = 0, dx = 2, dy = 2;

    public Ball(JPanel box) {
        this.box = box;
        Random generator = new Random(123123);
        x = generator.nextInt(500) + 1;
        y = generator.nextInt(500) + 1;
    }

    public void draw() {
        Graphics g = box.getGraphics();
        g.fillOval(x, y, XSIZE, YSIZE);
        g.dispose();
    }

    public void move() {
        Graphics g = box.getGraphics();
        g.setXORMode(Color.RED);
        g.fillOval(x, y, XSIZE, YSIZE);
        x += dx;
        y += dy;
        Dimension d = box.getSize();
        if (x < 0) {
            x = 0;
            dx = dy;
        }
        if (x + XSIZE >= d.getWidth()) {
            x = d.width - XSIZE;
            dx = -dx;
        }
        if (y < 0) {
            y = 0;
            dy = -dy;
        }

        if (y + YSIZE >= d.getHeight()) {
            y = d.height - YSIZE;
            dy = -dy;
        }
        g.fillOval(x, y, dx, XSIZE);
        g.dispose();
    }

    public void bounce() {
        draw();
        for (int i = 0; i < 500; i++) {
            move();
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
