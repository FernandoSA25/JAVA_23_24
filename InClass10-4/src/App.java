public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "hello";
        String s2 = "hell";
        String s3 = s1.substring(0, 4);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        if (s1 == s1) {
            System.out.println("s1 equals itself");
        }

        if (s2 == s3) {
            System.out.println("s2 equals s3");
        
        }
    }
}
