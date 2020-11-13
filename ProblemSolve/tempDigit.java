package ProblemSolve;

import java.util.Scanner;

public class tempDigit {
    public static void main(String[] args) {
        int num, temp, r, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some integer number: ");
        num = input.nextInt(); // Suppose 123 is user given number.
        temp = num; // Then we set this number to another variable.
        while (temp != 0) {
            r = temp % 10; // r = 123 % 10 => 3          // r = 12 % 10 => 2   // r = 1 % 10 => 1
            sum = sum + r; // 0 = 0 + 3(r) => 3         // 3 = 3 + 2(r) = 5   // 5 = 5 + 1(r) => 6
            temp = temp / 10; // temp = 123 / 10 => 12 // temp = 12/ 10 => 1 // temp = 1 / 10 => 0 
        }
        System.out.println("Sum : "+sum);
        input.close();

    }
}
