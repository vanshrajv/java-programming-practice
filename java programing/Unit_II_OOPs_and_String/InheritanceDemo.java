class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class CollegeStudent extends Person {
    CollegeStudent(String name) {
        super(name);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("Asha");
        student.displayName();
    }
}
