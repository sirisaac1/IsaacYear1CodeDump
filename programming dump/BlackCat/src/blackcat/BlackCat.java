import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BlackCat extends JPanel {
    private int x = 0;
    private int y = 0;
    private int legLength = 30;
    private int legWidth = 10;
    private int bodyWidth = 70;
    private int bodyHeight = 50;
    private int headWidth = 40;
    private int headHeight = 30;
    private int tailWidth = 20;
    private int tailHeight = 10;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(x, y + bodyHeight, legWidth, legLength);
        g.fillRect(x + bodyWidth - legWidth, y + bodyHeight, legWidth, legLength);
        g.fillRect(x + legWidth, y + bodyHeight - legLength, bodyWidth - 2 * legWidth, legWidth);
        g.fillOval(x + (bodyWidth - headWidth) / 2, y, headWidth, headHeight);
        g.fillRect(x + bodyWidth - tailWidth, y + (bodyHeight - tailHeight) / 2, tailWidth, tailHeight);
        g.fillRect(x + bodyWidth / 2 - legWidth / 2, y + bodyHeight - legLength / 2, legWidth, legLength / 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Black Cat");
        BlackCat cat = new BlackCat();
        frame.add(cat);
        frame.setSize(150, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}