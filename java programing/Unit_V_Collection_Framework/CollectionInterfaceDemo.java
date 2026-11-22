import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Collection: " + fruits);
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}
