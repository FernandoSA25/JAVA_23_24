//Fernando Sandoval
//10-4-23

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int time;

        System.out.print("Enter an amount of time in seconds: ");
        time = input.nextInt();

        final int hour = 3600;
        final int minute = 60;
        final int second = 1;

        int h;
        int m;
        int s;

        h = time / hour;
        time = time % hour;

        m = time / minute;
        time = time % minute;

        s = time / second;
        time = time % second;

        System.out.println(h + ":" + m + ":" + s);

    }
}
