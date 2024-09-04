import java.util.InputMismatchException;
import java.util.Scanner;

import BMI.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            // Request age
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            // Request height
            System.out.print("Please enter your height in centimeters: ");
            int height = scanner.nextInt();
            // Request weight
            System.out.print("Please enter your weight in kilograms: ");
            double weight = scanner.nextDouble();

            Person person = new Person(age, height, weight);
            person.getBMIResult();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }

    }
}
