package authentication;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Login To Your Account");
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 25));

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255, 255, 240));
        frame.add(label);

    }
}