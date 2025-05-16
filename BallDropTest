import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallDropTest extends JFrame {

    public BallDropTest() {
        setTitle("Click to Drop Ball");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dropBall(e.getX(), e.getY());
            }
        });

        setVisible(true);
    }

    private void dropBall(int x, int y) {
        // Replace with correct path to your ball image
        ImageIcon ballIcon = new ImageIcon("/home/kamlesh/Documents/ball.png");

        if (ballIcon.getIconWidth() <= 0 || ballIcon.getIconHeight() <= 0) {
            System.out.println("⚠️ Ball image failed to load.");
            return;
        }

        JLabel ballLabel = new JLabel(ballIcon);
        ballLabel.setBounds(x, y, ballIcon.getIconWidth(), ballIcon.getIconHeight());
        add(ballLabel);
        repaint(); // Ensure it's rendered
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BallDropTest::new);
    }
}
