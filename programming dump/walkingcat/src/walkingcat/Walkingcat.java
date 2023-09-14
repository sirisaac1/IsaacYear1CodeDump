/* this program creats a JFrame with a JPanel that shows
a walking cat. the x and y variables control the postion
of the cat, and the xSpeed and ySpeed variables control its
speed. The catWidth and catHeight variables control the size
of the cat. The paintComponent() method draws the cat on the
screen, and the run() method updates the position of the cat
and repaints the screen.
*/
/*
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WalkingCat extends JPanel implements Runnable {
    private int x = 0;
    private int y = 0;
    private int xSpeed = 2;
    private int ySpeed = 0;
    private int catWidth = 50;
    private int catHeight = 50;
    private Thread thread;

    public WalkingCat() {
        thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.gray);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.orange);
        g.fillRect(x, y, catWidth, catHeight);
    }

    public void run() {
        while (true) {
            x += xSpeed;
            y += ySpeed;

            if (x + catWidth >= getWidth() || x <= 0) {
                xSpeed *= -1;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Walking Cat");
        WalkingCat cat = new WalkingCat();
        frame.add(cat);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
*/

