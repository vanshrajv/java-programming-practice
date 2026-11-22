import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.addFirst("Chennai");
        System.out.println("Cities: " + cities);

        cities.remove("Mumbai");
        System.out.println("After deleting Mumbai: " + cities);
    }
}
