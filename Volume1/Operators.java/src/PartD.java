import java.util.Scanner;

public class PartD {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

    final int n = 17;
    final int m = 18;

    int a = n / 10 + n % 10;
    System.out.println(a);

    int b = n % 2 + m % 2;
    System.out.println(b);

    int c = (m + n) / 2;
     System.out.println(c);

    double d = (m + n) / 2.0;
     System.out.println(d);

    int e = (int) (0.5 * (m + n));
     System.out.println(e);

    int f = (int) Math.round(0.5 * (m + n));
     System.out.println(f);


    


    }

}
