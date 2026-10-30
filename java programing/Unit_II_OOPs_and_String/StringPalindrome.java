import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equalsIgnoreCase(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }
}
