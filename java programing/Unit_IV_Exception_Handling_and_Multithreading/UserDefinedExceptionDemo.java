class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
