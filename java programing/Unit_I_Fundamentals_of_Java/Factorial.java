import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number from 0 to 20: ");
            int number = input.nextInt();

            if (number < 0 || number > 20) {
                System.out.println("Enter a number from 0 to 20.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial = factorial * i;
                }
                System.out.println("Factorial = " + factorial);
            }
        }
    }
}
