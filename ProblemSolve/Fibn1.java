package ProblemSolve;

import java.util.Scanner;
/**
 * Fibonacci series using we can find the nth element from this code.
 */
public class Fibn1 {
    public static void main(String[] args){
        int f1= 0,f2= 1,f3=0, n, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Decalare th:");
        n = input.nextInt();
        for(i=0;i<n-1;i++){
            f3 = f1 + f2;
            f1 =f2;
            f2 =f3;
            input.close();
        }
        System.out.println("Value is :"+f3);
       
    }
}
