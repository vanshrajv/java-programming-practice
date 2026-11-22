import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");

        Iterable<String> iterableAnimals = animals;
        Iterator<String> iterator = iterableAnimals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
