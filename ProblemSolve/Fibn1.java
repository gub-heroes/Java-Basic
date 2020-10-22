package ProblemSolve;

import java.util.Scanner;
/**
 * Fibonacci series using we can find the nth element from this code.
 */
public class Fibn1 {
    public static void main(String[] args){
        int f1= 0,f2= 1,f3 = 0, n, i;
        Scanner input = new Scanner(System.in);
        input.close();
        System.out.print("Decalare th:");
        n = input.nextInt();
        for(i=0;i<n-2;i++){
            f3 = f1 + f2;
            f1 =f2;
            f2 =f3;
        }
        System.out.println("Value is :"+f3);
       
    }
}
