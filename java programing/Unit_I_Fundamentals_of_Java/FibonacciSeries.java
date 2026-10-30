import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many terms? ");
            int terms = input.nextInt();

            if (terms < 0 || terms > 47) {
                System.out.println("Enter a number of terms from 0 to 47.");
                return;
            }

            int first = 0;
            int second = 1;
            for (int i = 1; i <= terms; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
    }
}
