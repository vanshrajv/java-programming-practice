import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Maths");
        subjects.add("Physics");

        System.out.println("Second subject: " + subjects.get(1));
        subjects.set(1, "Computer Science");
        System.out.println("Updated subjects: " + subjects);
    }
}
