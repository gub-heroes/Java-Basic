package ProblemSolve;

import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args){
    int num, i = 1;
    long fact = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any integer number: ");
    num = input.nextInt();
    while(i<=num){
        fact *=i;
        i++;
    }
    System.out.printf(num +"th no. Factorial is = " + fact);

    input.close();
    }
}
