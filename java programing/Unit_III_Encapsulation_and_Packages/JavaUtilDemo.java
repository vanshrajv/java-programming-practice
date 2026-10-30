import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaUtilDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");

        Collections.sort(languages);
        System.out.println("Sorted languages: " + languages);
    }
}
