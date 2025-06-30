import java.util.Scanner;
import java.lang.Math;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, this is a BMI calculator!");

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in m): ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        String category;

        if (bmi < 16) {
            category = "Severe Thinness";
        } else if (bmi < 17) {
            category = "Moderate Thinness";
        } else if (bmi <= 18.5) {
            category = "Mild Thinness";
        } else if (bmi <= 25) {
            category = "Normal";
        } else if (bmi <= 30) {
            category = "Overweight";
        } else if (bmi <= 35) {
            category = "Obese Class I";
        } else if (bmi <= 40) {
            category = "Obese Class II";
        } else {
            category = "Obese Class III";
        }

        System.out.println("Category: " + category);
        scanner.close();
    }
}