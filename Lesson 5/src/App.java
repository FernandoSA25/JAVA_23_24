import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your first name:");

        System.out.println("Your name is " + name);

        String reply = JOptionPane.showInputDialog("Enter your age:");
        int age = Integer.parseInt(reply);

        System.out.println("Your age is " + age);
    }
}
