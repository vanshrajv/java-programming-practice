import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Numbers in ascending order: " + numbers);
    }
}
