package ProblemSolve;

import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        int num;
        long factorial;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        num = input.nextInt();
        factorial = fact(num);
        System.out.print(num + "th Factorial term is = " + factorial);
        input.close();
    }
    public static long fact(long n) {
        if (n >= 1)
        return n * fact(n - 1);
    else
        return 1;
    }
    
}
