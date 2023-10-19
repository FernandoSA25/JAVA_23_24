import java.util.Scanner;

public class PartB {

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        /*System.out.print("Total width is: ");
        int totalwidth = in.nextInt();
        System.out.print("Tile width is: ");
        int tilewidth = in.nextInt();

        int numberofpairs = (totalwidth - tilewidth) / (2 * tilewidth);
        int numberoftiles = 1 + 2 * numberofpairs;
        double gap = (totalwidth - numberoftiles * tilewidth) / 2.0;

        System.out.println("Number of tiles is: " + numberoftiles);
        System.out.println("Gap at each end: " + gap);*/


        int nTiles;
        int nBlackTiles;
        int nWhiteTiles;
        double gap;

        final double TILE_WIDTH = 5.0;
        double WallWidth;
        WallWidth = 17.0;

        nTiles = (int) (WallWidth / TILE_WIDTH);
        if (nTiles % 2 == 0) {
            nTiles = nTiles - 1;
        }
        gap = WallWidth - nTiles * TILE_WIDTH;
        gap = gap / 2.0;

        nWhiteTiles = nTiles / 2;
        nBlackTiles = nWhiteTiles + 1;

        System.out.printf("Wall width = %.02f%n", WallWidth);
        //%n gives you a new line
        System.out.printf("Number of tiles = %d%n", nTiles);
        System.out.printf("Gap on either side = %.02f%n", gap);
        System.out.printf("Number of white tiles = %d%n", nWhiteTiles);
        System.out.printf("Number of black tiles = %d%n", nBlackTiles);


        System.out.println("Number of tiles = " + nTiles);


    }
    
}
