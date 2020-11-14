package ProblemSolve.pattern;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line number: ");
        num = input.nextInt();  // Suppose user given number is (5).
        for(int row=num;row>=1;row--) // For row
        {
            for(int col=1;col<=row;col++) // For column
            { 
                System.out.print("* ");// 1 2 3 4 5
            }
        System.out.println();       
        }
        input.close();
}
}
/** Output **
 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
