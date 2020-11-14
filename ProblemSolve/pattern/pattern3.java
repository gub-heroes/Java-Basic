package ProblemSolve.pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line number: ");
        num = input.nextInt(); // Suppose user given number is (5).
        for (int row = 1; row <= num; row++) // For row
        {
            for (int col = 1; col <= row; col++) // For column
            {
                int result= col%2;
                System.out.print(" " +result);
            }
            System.out.println();
        }
        input.close();
    }
}
/** Output **
 1
 1 0
 1 0 1
 1 0 1 0
 1 0 1 0 1
 */