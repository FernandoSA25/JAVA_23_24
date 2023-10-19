import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int cents;

        System.out.print("Enter your total amount in cents: ");
        cents = input.nextInt();
        System.out.println("You started out with this many cents: ");

        final int QuarterValue = 25;
        final int DimeValue = 25;
        final int NickelValue = 25;

        int q;
        int d;
        int n;
        int p;

        q = cents / QuarterValue;
        cents = cents % QuarterValue;

        d = cents / DimeValue;
        cents = cents % DimeValue;

        n = cents / NickelValue;
        cents = cents % NickelValue;

        p = cents / 1;

        System.out.println("You have " + q + " quarters, " + d + " dimes, " + n + "nickels, and " + p + "pennies.");






       
    }
}
