class Student {
    String name;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Asha";
        student.rollNumber = 101;
        student.display();
    }
}
