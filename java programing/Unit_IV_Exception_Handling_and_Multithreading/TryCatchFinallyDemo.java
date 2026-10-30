public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int zero = 0;
            int answer = 10 / zero;
            System.out.println(answer);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Finally block runs.");
        }
    }
}
