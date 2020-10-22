package ProblemSolve;

import java.util.Scanner;

public class Fibn2 {
   
    public static void main(String[] args) {
           int num;
           long fibonacci;
           Scanner input = new Scanner(System.in);
           System.out.print("Enter any integer number: ");
           num = input.nextInt();
           fibonacci = fib(num);
           System.out.print( num +"th Fibonacci term is = " + fibonacci );
           input.close();
    }
    public static int fib(int n) {
        if ((n == 0) || (n == 1))
           return n;
        else
           return fib(n - 1) + fib(n - 2);    
    }  
 }