package ProblemSolve.pattern;

import java.util.Scanner;

public class pattern1 {
    
    public static void main(String[] args){
    int num;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the line number: ");
    num = input.nextInt();  // Suppose user given number is (5).
    for(int row=1;row<=num;row++) // For row
    {
        for(int col=1;col<=row;col++) // For column
        { 
            System.out.print(" "+col);// 1 2 3 4 5
        }
    System.out.println();       
    }
    input.close();
}
}

/** Output **
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */