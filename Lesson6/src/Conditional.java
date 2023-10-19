import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 49 ) {
            System.out.println("You qualify for our senior discount!");
        } else {
            System.out.println("Sorry, you do not qualify for a senior discount.");
        }



    }
}
