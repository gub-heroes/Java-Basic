package ProblemSolve;

import java.util.Scanner;   // Import the java scanner class which is a package

public class TriangleOfCircle {

    public static void main(String[] args){

        double base,hieght,area;            // Variables declare.

        Scanner input = new Scanner(System.in);     // Create Scanner Keyword.

        System.out.print("Enter base : ");      // Read user Input.
        base = input.nextDouble();

        System.out.print("Enter height : ");    //Read user Input.
        hieght = input.nextDouble();

        area = 0.5 * base * hieght;     // Area of Triangle formula.

        System.out.println("Area : " + area);     // Show the Result.

    }
}
