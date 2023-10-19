import javax.swing.JOptionPane;

public class PartC {
    public static void main(String[] args) throws Exception {
         String name = JOptionPane.showInputDialog("Enter your first name:");

        System.out.println("Your name is " + name);

        String reply = JOptionPane.showInputDialog("Enter your age:");
        int age = Integer.parseInt(reply);
        
        System.out.println("Your age is " + age);

        String secondreply = JOptionPane.showInputDialog("Enter a whole number:");
        int number = Integer.parseInt(secondreply);

        System.out.println("Your age multiplied by the number you entered is " + age * number);

    }
}
