import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = input.nextInt();
            if (size < 0) {
                System.out.println("Array size cannot be negative.");
                return;
            }
            int[] numbers = new int[size];

            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = input.nextInt();
            }

            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }

            System.out.println("Sorted array:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
