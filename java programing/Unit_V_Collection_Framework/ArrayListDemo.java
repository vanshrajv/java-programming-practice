import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        li.add(60);
        li.add(70);
        li.add(80);
        li.add(90);
        li.add(100);

        System.out.println(li);
        System.out.println("Size: " + li.size());
        System.out.println("First: " + li.get(0));
        System.out.println("Last: " + li.get(li.size() - 1));

        li.remove(Integer.valueOf(80));
        System.out.println("Remove 80: " + li);

        li.add(110);
        System.out.println("Add 110: " + li);

        li.add(1, 15);
        System.out.println("Insert 15: " + li);
        System.out.println("Size: " + li.size());

        ArrayList<ArrayList<Integer>> lil = new ArrayList<>();
        lil.add(new ArrayList<>());
        lil.add(new ArrayList<>());
        lil.add(new ArrayList<>());

        lil.get(0).add(10);
        lil.get(0).add(20);
        lil.get(0).add(30);
        lil.get(1).add(40);
        lil.get(1).add(50);
        lil.get(1).add(60);
        lil.get(2).add(70);
        lil.get(2).add(80);
        lil.get(2).add(90);

        System.out.println("Matrix: " + lil);

    }
}
