package ProblemSolve;

import java.util.Scanner;

public class FahrenhietToCelsius {
    public static void main(String[] args) {
        double celsius, fahrenhiet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit value: ");
        fahrenhiet = input.nextDouble();

        celsius =(( 5 *(fahrenhiet- 32.0)) / 9.0);

        System.out.printf("Celsius value is: %.1f\n", celsius);
        input.close();
    }
}
