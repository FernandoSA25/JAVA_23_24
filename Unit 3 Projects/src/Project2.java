//Fernando Sandoval
//10-18-23
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("How much money do you make per year? $");
        double wage = input.nextDouble();

        double total = 0;
        double amount = 0;
        double leftover = 0;

        if (wage >= 50000) {
            amount = 50000;
            leftover = wage - 50000;
        } else { 
            amount = wage;
            leftover = 0;
        }
        total = amount * 0.01;
        System.out.println("Money needed to pay 1% income taxes: $" + total);
        System.out.println("Money leftover: $" + leftover);
        System.out.println();

         if (leftover > 25000) {
            amount = 25000;
            leftover = leftover - 25000;
        } else {
            amount = leftover;
            leftover = 0;
        }
        total = total + 0.02 * amount;
        System.out.println("Money needed to pay 2% income taxes: $" + total);
        System.out.println("Money leftover: $" + leftover);
        System.out.println();

        if (leftover > 25000) {
            amount = 25000;
            leftover = leftover - 25000;
        } else {
            amount = leftover;
            leftover = 0;
        }
        total = total + 0.03 * amount;
        System.out.println("Money needed to pay 3% income taxes: $" + total);
        System.out.println("Money leftover: $" + leftover);
        System.out.println();

        if (leftover > 150000) {
            amount = 150000;
            leftover = leftover - 150000;
        } else {
            amount = leftover;
            leftover = 0;
        }
        total = total + 0.04 * amount;
        System.out.println("Money needed to pay 4% income taxes: $" + total);
        System.out.println("Money leftover: $" + leftover);
        System.out.println();

        if (leftover > 250000) {
            amount = 250000;
            leftover = leftover - 250000;
        } else {
            amount = leftover;
            leftover = 0;
        }
        total = total + 0.05 * amount;
        System.out.println("Money needed to pay 5% income taxes: $" + total);
        System.out.println("Money leftover: $" + leftover);
        System.out.println();

        if (leftover > 500000) {
            amount = 500000;
            leftover = leftover - 500000;
        } else {
            amount = leftover;
            leftover = 0;
        }
        total = total + 0.06 * amount;
        System.out.println("Money needed to pay 6% income taxes: $" + total);
        System.out.println("Money leftover: $" + leftover);
        System.out.println();
     }
 }      

