import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Asha");
        students.put(102, "Ravi");
        students.put(103, "Neha");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Roll number: " + student.getKey()
                    + ", Name: " + student.getValue());
        }
    }
}
