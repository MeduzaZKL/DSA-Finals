package authentication;

import java.awt.Color;
import javax.swing.JFrame;

public class Signup {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Signup");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(255, 255, 240));
    }
}