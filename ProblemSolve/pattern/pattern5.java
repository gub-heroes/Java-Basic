package ProblemSolve.pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line number: ");
        num = input.nextInt(); // Suppose user given number is (5).
        for (int row = 1; row <= num; row++) // For row
        {
            for (int col = 1; col <= row; col++) // For column
            {
                int alphabet=64;
                char c = ((char) (alphabet + col));
                System.out.print(c+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
/** Output **
A
A B
A B C
A B C D
A B C D E
 */