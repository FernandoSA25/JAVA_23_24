public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    int cansPerPack = 6;
    final double CAN_VOLUME = 0.355;
    
    System.out.println("The total volume of a pack of soda cans is " + cansPerPack * CAN_VOLUME + ".");

    final double BOTTLE_VOLUME  = 2.0;
    final double TotalVolume = cansPerPack * CAN_VOLUME + BOTTLE_VOLUME;
    

    System.out.println("The total volume of a pack of soda and a bottle of soda is " + TotalVolume + "."); 

    }

}
