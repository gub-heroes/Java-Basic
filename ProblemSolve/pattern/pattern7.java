package ProblemSolve.pattern;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args){
        int num;
        int alphabet=64;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line number: ");
        num = input.nextInt();  // Suppose user given number is (5).
        for(int row=1;row<=num-1;row++) // For row
        {
            for(int col=1;col<=row;col++) // For column
            { 
                char c = ((char) (alphabet + col));
                System.out.print(c+" ");
            }
        System.out.println();       
        } 
        for(int row=num;row>=1;row--) // For row
        {
            for(int col=1;col<=row;col++) // For column
            { 
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
A B C D
A B C
A B
A
 */