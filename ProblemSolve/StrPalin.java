package ProblemSolve;

import java.util.Scanner;

public class StrPalin {
    public static void main(String[] args) {
        String revstr ="";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.nextLine();
        for (int i = str.length()-1; i > 0; --i) {
            revstr += str.charAt(i);
        }
        System.out.println(revstr);
        if (str.equals(revstr)) {
            System.out.println("The String is Palindrome");
        }
        else {
            System.out.println("The String is not Palindrome");

        }
        input.close();
    }
}
