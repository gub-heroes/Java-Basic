package ProblemSolve; //Package Name.

import java.util.Scanner; // Import the java scanner class which is a package.

public class CircleOfArea { // Class name.
    public static void main(String[] args) {
        double pi, base, area; // Variables declare.
        pi = 3.1416;

        Scanner input = new Scanner(System.in); // Create Scanner Keyword.

        System.out.print("Enter the Radius: "); // Read user Input.
        base = input.nextDouble();

        area = pi * base * base; // Area of Circle formula.

        System.out.println("\n<<<< Here The output >>>>\n"); // Headline of output.
        System.out.printf("Area of Circle is : %.1f", area); // Show the Result.

        input.close(); // Close Scanner input.
    }
}
