
import java.util.*;

class Student {
    String name;
    int score;

    Student(String name) {
        this.name = name;
        score = 0;
    }
}

class Question {
    String question;
    String[] options;
    int answer;

    Question(String q, String[] op, int ans) {
        question = q;
        options = op;
        answer = ans;
    }

    void display() {
        System.out.println("\n" + question);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}

class QuizManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Question[] quiz = {
                new Question("Which language is platform independent?",
                        new String[] { "C", "Java", "C++", "Python" }, 2),

                new Question("Which keyword creates an object?",
                        new String[] { "class", "new", "static", "void" }, 2),

                new Question("Which method compares Strings?",
                        new String[] { "compare", "equals", "check", "match" }, 2),

                new Question("Which concept hides data?",
                        new String[] { "Inheritance", "Polymorphism",
                                "Encapsulation", "Abstraction" },
                        3),

                new Question("Which keyword is used for inheritance?",
                        new String[] { "implements", "extends", "import", "this" }, 2)
        };

        System.out.println("===== QUIZ MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student Name: ");
        Student s = new Student(sc.nextLine());

        for (Question q : quiz) {

            q.display();

            System.out.print("Enter Answer (1-4): ");
            int choice;
            while (true) {
                String answer = sc.nextLine();
                try {
                    choice = Integer.parseInt(answer);
                    if (choice >= 1 && choice <= 4) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    // Ask again when the input is not a number.
                }
                System.out.print("Enter a number from 1 to 4: ");
            }

            if (choice == q.answer) {
                System.out.println("Correct Answer!");
                s.score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        double percentage = (s.score * 100.0) / quiz.length;

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Student Name: " + s.name);
        System.out.println("Total Questions: " + quiz.length);
        System.out.println("Correct Answers: " + s.score);
        System.out.println("Wrong Answers: " +
                (quiz.length - s.score));
        System.out.println("Score: " + s.score + "/" + quiz.length);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}
