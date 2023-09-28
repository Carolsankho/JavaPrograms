/** A Java program to print an American flag */
public class AmericanFlag {
    public static void main(String[] args) {
        boolean odd = true;
        for (int i = 1; i < 10; i++) {
            if (odd) {
                System.out.print("* * * * * * ");
                System.out.println(String.format("%34s", " ").replace(' ', '='));
                odd = !odd;
            } else {
                System.out.print(" * * * * *  ");
                System.out.println(String.format("%34s", " ").replace(' ', '='));
                odd = !odd;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%46s", " ").replace(' ', '='));            
        }
    }    
}