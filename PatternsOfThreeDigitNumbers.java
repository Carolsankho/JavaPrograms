/** A Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.*/
public class PatternsOfThreeDigitNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && k != i) {
                        int number = i * 100 + j * 10 + k;
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total number of three-digit numbers is: " + count);
    }
}
