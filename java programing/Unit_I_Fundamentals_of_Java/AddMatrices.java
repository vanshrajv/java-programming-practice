import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter rows and columns: ");
            int rows = input.nextInt();
            int columns = input.nextInt();
            if (rows <= 0 || columns <= 0) {
                System.out.println("Rows and columns must be greater than zero.");
                return;
            }
            int[][] first = new int[rows][columns];
            int[][] second = new int[rows][columns];
            int[][] sum = new int[rows][columns];

            System.out.println("Enter first matrix values:");
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    first[row][column] = input.nextInt();
                }
            }

            System.out.println("Enter second matrix values:");
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    second[row][column] = input.nextInt();
                    sum[row][column] = first[row][column] + second[row][column];
                }
            }

            System.out.println("Sum of matrices:");
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    System.out.print(sum[row][column] + " ");
                }
                System.out.println();
            }
        }
    }
}
