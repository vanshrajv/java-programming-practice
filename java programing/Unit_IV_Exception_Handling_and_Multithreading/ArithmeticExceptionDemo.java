public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int zero = 0;
            int result = 10 / zero;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
