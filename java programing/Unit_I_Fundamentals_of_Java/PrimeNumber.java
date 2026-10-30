import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            boolean prime = number > 1;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }
}
