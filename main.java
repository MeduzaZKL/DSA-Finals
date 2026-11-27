import java.awt.Color;
import javax.swing.JFrame;

public class main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(1000, 750);
        frame.setTitle("Main");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(186, 219, 222));
    }
}