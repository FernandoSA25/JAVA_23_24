import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your first account ID: ");
        int firstid = in.nextInt();
        String firstresult = String.format("%06d", firstid);
        
        System.out.print("Please enter your first account's balance: ");
        double firstbalance = in.nextDouble();
        
        System.out.print("Please enter your second account ID: ");
        int secondid = in.nextInt();
        String secondresult = String.format("%06d", secondid);
        
        System.out.print("Please enter your second account's balance: ");
        double secondbalance = in.nextDouble();
        
        System.out.print("Please enter your third account ID: ");
        int thirdid = in.nextInt();
        String thirdresult = String.format("%06d", thirdid);
        
        System.out.print("Please enter your third account's balance: ");
        double thirdbalance = in.nextDouble();

        

        System.out.printf("Account #" + firstresult + " has a balance of = $%.02f%n", firstbalance);
        System.out.printf("Account #" + secondresult + " has a balance of = $%.02f%n", secondbalance);
        System.out.printf("Account #" + thirdresult + " has a balance of = $%.02f%n", thirdbalance);
        
        





    }
}
