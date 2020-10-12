package ProblemSolve;

import java.util.Scanner;

public class CelsiusToFahrenhiet {

    public static void main(String[] args) {
        double celsius, fahrenhiet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Celsius value: ");
        celsius = input.nextDouble();

        fahrenhiet = (1.8 * celsius) + 32;

        System.out.printf("Fahrenhiet value is: %.1f\n", fahrenhiet);
        input.close();
    }
}
