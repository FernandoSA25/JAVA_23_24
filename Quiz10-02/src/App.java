//Fernando
//10-02

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String name;
        double xnumber;
        double ynumber;
        double znumber;
        
        //Prompts user for name
        System.out.println("Enter your name: ");
        name = input.next();
       
        //Asks user for numbers
        System.out.println("Hello " + name + "! Enter in your first number: ");
        xnumber = input.nextDouble();
        
        System.out.println("Enter in your second number: ");
        ynumber = input.nextDouble();
        
        System.out.println("Enter your third number");
        znumber = input.nextDouble();

        //Formats numbers properly
        System.out.printf("x = %8.3f%n", xnumber);
        System.out.printf("y = %8.3f%n", ynumber);
        System.out.printf("z = %8.3f%n", znumber);   
    }
}
