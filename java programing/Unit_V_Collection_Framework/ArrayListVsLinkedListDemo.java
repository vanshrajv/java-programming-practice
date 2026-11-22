import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList first element: " + arrayList.get(0));
        arrayList.remove("Python");
        System.out.println("ArrayList after removal: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("LinkedList first element: " + linkedList.get(0));
        linkedList.remove("Python");
        System.out.println("LinkedList after removal: " + linkedList);
    }
}
