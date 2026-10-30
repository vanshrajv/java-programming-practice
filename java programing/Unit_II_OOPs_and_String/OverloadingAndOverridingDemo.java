class Calculator {
    int add(int first, int second) {
        return first + second;
    }

    int add(int first, int second, int third) {
        return first + second + third;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class OverloadingAndOverridingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Overloading: " + calculator.add(2, 3));
        System.out.println("Overloading: " + calculator.add(2, 3, 4));
        Animal animal = new Dog();
        animal.sound();
    }
}
