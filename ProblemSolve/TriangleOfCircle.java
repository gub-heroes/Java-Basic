package ProblemSolve;

import java.util.Scanner; // Import the java scanner class which is a package

public class TriangleOfCircle {

    public static void main(String[] args) {

        double base, hieght, area; // Variables declare.

        Scanner gskill = new Scanner(System.in); // Create Scanner Keyword.

        System.out.print("Enter base : "); // Read user Input.
        base = gskill.nextDouble();

        System.out.print("Enter height : "); // Read user Input.
        hieght = gskill.nextDouble();

        area = 0.5 * base * hieght; // Area of Triangle formula.

        System.out.println("Area : " + area); // Show the Result.

        gskill.close();
    }
}
