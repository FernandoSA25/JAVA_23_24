import javax.swing.JOptionPane;

public class PartA {
    public static void main(String[] args) throws Exception {
        String firstname = JOptionPane.showInputDialog("Enter your first name: ");
        String middlename = JOptionPane.showInputDialog("Enter your middle name: ");
        String lastname = JOptionPane.showInputDialog("Enter your last name: ");

        String monogram = String.valueOf(firstname.charAt(0)) + String.valueOf(middlename.charAt(0)) + String.valueOf(lastname.charAt(0));


        System.out.println(monogram);
        
    }
}
