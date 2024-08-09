import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Request user name and welcome message
        System.out.print("Hello! Please enter your name to get started: ");
        String userName = scanner.nextLine();
        System.out.println("Welcome, " + userName + ", to the BMI Calculator!");

        // Request height
        System.out.print("Please enter your height in centimeters: ");
        double height = scanner.nextDouble();

        // Request weight
        System.out.print("Please enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / Math.pow(height / 100, 2);

        // Display BMI result
        if (bmi < 18.5) {
            System.out.printf("BMI result: %.1f, (Underweight)", bmi);
        } else if (bmi >= 18.5 || bmi <= 24.9) {
            System.out.printf("BMI result: %.1f, (Normal Weight)", bmi);
        } else if (bmi >= 25 || bmi <= 29.9) {
            System.out.printf("BMI result: %.1f, (Overweight)", bmi);
        } else {
            // BMI >= 30
            System.out.printf("BMI result: %.1f, (Obese)", bmi);
        }

    }
}
