import javax.swing.JOptionPane;

public class NameConfirmation {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What's your name?");

            if (name.trim().isEmpty()) {
               JOptionPane.showMessageDialog(null, "Please enter a valid name.");
               continue;
            }

            int confirmation = JOptionPane.showConfirmDialog(
                null, 
                "Do you want to display your name: " + name + "?", 
                "Confirm", 
                JOptionPane.YES_NO_OPTION
            );

            if (confirmation == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                break;
            }
        }
    }
}