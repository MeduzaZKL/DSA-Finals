package dashboard;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainDashboard extends JFrame {
    public MainDashboard() {
        setTitle("Main Dashboard");
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(186, 219, 222));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainDashboard().setVisible(true));
    }
}
