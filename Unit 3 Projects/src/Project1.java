//Fernando Sandoval
//10-18-23
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a first number: ");
        double first = input.nextDouble();

        System.out.print("Please enter a second number: ");
        double second = input.nextDouble();

        System.out.print("Please enter a third number: ");
        double third = input.nextDouble();

        if (first > second && first > third) {
            System.out.println("The largest number is " + first);
        } else if (second > third && second > first) {
            System.out.println("The largest number is " + second);
        } else {
            System.out.println("The largest number is " + third);
        }
    }
}
