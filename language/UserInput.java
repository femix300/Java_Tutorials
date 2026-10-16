/*
    How to collect and make use of User Input in Java
*/
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String programmingLanguage;
        int age;
        double gpa;
        boolean isstudent;

    


        System.out.print("What is your name? ");
        name = scanner.nextLine();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        System.out.print("What is your GPA? ");
        gpa = scanner.nextDouble();

        // this is a simple hack to the scanner buffer problem
        scanner.nextLine();

        System.out.print("What is your favourite Programming Language? ");
        programmingLanguage = scanner.nextLine();

        System.out.print("Are you a student? Enter (true/false) ");
        isstudent = scanner.nextBoolean();

        System.out.println("Your name is " + name +
        ", you are " + age + " years old and your favourite programming language is " 
        + programmingLanguage + ".");
        System.out.println("You currently have a " + gpa + " GPA");

        if (isstudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}