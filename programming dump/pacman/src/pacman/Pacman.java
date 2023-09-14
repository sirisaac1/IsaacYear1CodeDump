/* this is a very basic version of the game that just displays
pac man on the screen and makes his mouth open and close. The Pac
man is a yellow circle with a mouth that opens and closes. the
paint() method draws the pac-man on the screen, and the
update() method updates the angle of the mouth opening.
the main() method creates a frame and adds object PacMan to it.
while loop updates pac-man and repaints the screen every 10 milliseconds.
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PacMan extends JPanel {
    private int pacManX = 10;
    private int pacManY = 10;
    private int pacManRadius = 20;
    private int pacManMouthAngle = 30;
    private int pacManMouthOpeningSpeed = 2;
    private int pacManDirection = 1;
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillArc(pacManX, pacManY, pacManRadius, pacManRadius, pacManMouthAngle, 360 - 2 * pacManMouthAngle);
    }

    public void update() {
        pacManMouthAngle += pacManMouthOpeningSpeed * pacManDirection;
        if (pacManMouthAngle >= 45 || pacManMouthAngle <= 0) {
            pacManDirection *= -1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Pac-Man");
        PacMan pacMan = new PacMan();
        frame.add(pacMan);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            pacMan.update();
            pacMan.repaint();
            Thread.sleep(10);
        }
    }
}
