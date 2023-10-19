/*Fernando Sandoval
 * 10-09-23
 */

//original code did not work because the computer doesn't round the number unless you tell it to, so it wasn't actually 3.6 and it was a long rounded number

public class PartC {
    public static void main(String[] args) throws Exception {
    double a = 1.2; 
    double b = 3.0;
    double c = a * b; 
    
    if(Math.abs(c - 3.6) < 0.0001){
        System.out.println("c is 3.6");
    } else {
        System.out.println("c is not 3.6");
}

}
}