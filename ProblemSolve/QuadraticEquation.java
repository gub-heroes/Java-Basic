package ProblemSolve;
import java.util.Scanner;
/**
 * Quadratic Equation solve by taking value from user. 
 * Example:
 * Enter a: (Enter any value and press ENTER)
 * Enter b: (Enter any value and press ENTER)
 * Enter c: (Enter any value and press ENTER)
 * 
 * Your result will show.
 */

public class QuadraticEquation {

    public static void main(String[] args) {

        double a, b, c, r1, r2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        a = input.nextDouble();
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();

        double det = b * b - 4 * a * c;
        System.out.println("Det: " + det);

        if (det == 0) {
            r1 = -b / (2 * a);
            r2 = -b / (2 * a);
            System.out.printf("root1 = %.1f;", r1);
            System.out.printf("root2 = %.1f;", r2);
        } else if (det > 0) {
            r1 = (-b + Math.sqrt(det)) / (2 * a);
            r2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.printf("root1 = %.1f;", r1);
            System.out.printf("root2 = %.1f;", r2);
        } else {
            System.out.println("Roots are imaginary.");
        }
        input.close();
    }
}