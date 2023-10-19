import java.util.Scanner;

public class CA {
    public static void main(String[] args){
        final double g = -9.81;
        Scanner in = new Scanner(System.in);

    System.out.print("Enter an initial height (m): ");
    int hi = in.nextInt();

    System.out.print("Enter an initial velocity (m/s): ");
    int vi = in.nextInt();

    System.out.print("Enter time (s): ");
    int t = in.nextInt();


    double hf = hi + vi * t + 0.5 * g * t * t;
    System.out.println("The height of the object at " + t + " seconds was " + hf + " meters.");

    



}

}