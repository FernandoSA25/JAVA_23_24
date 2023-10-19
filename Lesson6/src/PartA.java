//Fernando Sandoval

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int pie = 10;
        System.out.print("How many pies would you like to buy? ");
        int NumberOfPies = input.nextInt();

         double discount = 0.9; 
        
        int price = pie * NumberOfPies;
        double discountprice = pie * NumberOfPies * discount;

        if (NumberOfPies > 3) {
            System.out.println("You qualify for our 10% discount!");
            System.out.println("Your total cost is: $" + discountprice);
        } else {
            System.out.println("Sorry, you are not buying enough pies to qualify for our 10% discount.");
            System.out.println("Your total cost is: $" + price);
        }
        
       

       
        


    
    }

}
