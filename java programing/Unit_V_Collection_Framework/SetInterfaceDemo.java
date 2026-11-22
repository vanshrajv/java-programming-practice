import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println("Set without duplicates: " + fruits);
    }
}
