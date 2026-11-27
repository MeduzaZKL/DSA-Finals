import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);

        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "The number is even.");
        } else {
            JOptionPane.showMessageDialog(null, "The number is odd.");
        }

        

    }

}