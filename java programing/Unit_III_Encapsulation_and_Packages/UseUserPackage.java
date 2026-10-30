import mypackage.Greeter;

public class UseUserPackage {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("Java learner"));
    }
}
