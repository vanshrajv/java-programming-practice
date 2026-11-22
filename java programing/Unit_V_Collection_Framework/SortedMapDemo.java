import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Neha");
        students.put(101, "Asha");
        students.put(102, "Ravi");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Roll number: " + student.getKey()
                    + ", Name: " + student.getValue());
        }
    }
}
