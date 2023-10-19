/*Fernando Sandoval
 * 10-09-23
 */

import java.util.Scanner;
 
public class PartD {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double cookie = 0.99;

        System.out.print("How many cookies would you like to buy? ");
        int NumberOfCookies = input.nextInt();

        double sixdiscount = 0.975;
        double twelvediscount = 0.95;
        double twentyfourdiscount = 0.85;

        double price = cookie * NumberOfCookies;
        double sixdiscountprice = cookie * NumberOfCookies * sixdiscount;
        double twelvediscountprice = cookie * NumberOfCookies * twelvediscount;
        double twentyfourdiscountprice = cookie * NumberOfCookies * twentyfourdiscount;

        if (NumberOfCookies > 24) {
            System.out.println("You qualify for our 15% discount!");
            System.out.printf("Your total cost is: $%.2f\n", twentyfourdiscountprice);
        } 
        else if (NumberOfCookies > 12) {
            System.out.println("You qualify for our 5% discount!");
            System.out.printf("Your total cost is: $%.2f\n", twelvediscountprice);
        }
        else if (NumberOfCookies > 6) {
            System.out.println("You qualify for our 2.5% discount!");
            System.out.printf("Your total cost is: $%.2f\n", sixdiscountprice);
        }
        else {
            System.out.println("Sorry, you are not buying enough cookies to qualify for a discount.");
            System.out.printf("Your total cost is: $%.2f\n", price);
        }

}
}