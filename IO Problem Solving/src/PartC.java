import java.util.Scanner;

public class PartC {
    
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length, in centimeters, of a box:");
        int length = in.nextInt();

        System.out.println("Enter the width, in centimeters, of a box:");
        int width = in.nextInt();

        System.out.println("Enter the height, in centimeters, of a box:");
        int height = in.nextInt();

        double surfacearea;
        double volume;

        surfacearea = (length * width * 2) + (length * height * 2) + (height * width * 2);
        volume = length * width * height;

        System.out.println("Length (cm) = " + length);
        System.out.println("Width (cm) = " + width);
        System.out.println("Height (cm) = " + height);
        System.out.printf("Surface area (cm2) = %.02f%n", surfacearea);
        System.out.printf("Volume (cm3) = %.02f%n", volume);

    }
}
