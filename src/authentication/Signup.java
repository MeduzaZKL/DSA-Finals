package authentication;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Signup extends JFrame {
    public Signup() {

        setSize(500, 500);
        setTitle("Signup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        getContentPane().setBackground(new Color(255, 255, 240));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Signup().setVisible(true));
    }
}
