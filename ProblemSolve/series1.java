package ProblemSolve;

import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {

        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number :");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
            System.out.print(i+"^2 ");
        }
        System.out.println();
        System.out.println("Sum is :" + sum);
        input.close();
    }
}
