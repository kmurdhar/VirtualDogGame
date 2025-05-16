import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DogPet extends JFrame {

    private JLabel petLabel;

    public DogPet() {
        initializeUI();
    }

    private void initializeUI() {
        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);
        setAlwaysOnTop(true);
        setSizeAndPosition();

        // Create and configure the pet label
        createPetLabel();

        // Make the frame transparent
        setTransparentBackground();

        // Add mouse listener for movement
        addMouseListenerForMovement();

        // Ensure the frame stays on top when gaining/losing focus
        addWindowFocusListener();

        // Ensure the frame stays in the normal state
        addWindowStateListener();

        setVisible(true);
    }

    private void setSizeAndPosition() {
        int targetHeight = 120;
        ImageIcon dogIcon = new ImageIcon("dog.gif");
        int targetWidth = (int) ((double) dogIcon.getIconWidth() / dogIcon.getIconHeight() * targetHeight);
        setSize(targetWidth, targetHeight);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getWidth() / 2, (int) dim.getHeight() - getHeight());
    }

    private void createPetLabel() {
        ImageIcon dogIcon = new ImageIcon("dog.gif");
        int targetHeight = 120;
        int targetWidth = (int) ((double) dogIcon.getIconWidth() / dogIcon.getIconHeight() * targetHeight);
        petLabel = new JLabel(new ImageIcon(dogIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT)));
        petLabel.setBounds(0, 0, targetWidth, targetHeight);
        petLabel.setToolTipText("Developed by Harsh Mordharia");
        add(petLabel);
    }

    private void setTransparentBackground() {
        setBackground(new Color(0, 0, 0, 0));
        setOpacity(1.0f);
    }

    private void addMouseListenerForMovement() {
        petLabel.addMouseMotionListener(new MouseAdapter() {
            int initialX, initialY;

            @Override
            public void mousePressed(MouseEvent e) {
                initialX = e.getX();
                initialY = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - initialX;
                int y = e.getYOnScreen() - initialY;
                setLocation(x, y);
            }
        });
    }

    private void addWindowFocusListener() {
        addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                setAlwaysOnTop(true);
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                setAlwaysOnTop(true);
            }
        });
    }

    private void addWindowStateListener() {
        addWindowStateListener(new WindowAdapter() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                setExtendedState(JFrame.NORMAL);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DogPet::new);
    }
}
