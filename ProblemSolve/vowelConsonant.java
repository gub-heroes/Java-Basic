package ProblemSolve;//Package Name.

import java.util.Scanner;// Import the java scanner class which is a package.

public class vowelConsonant {// Class name.
    public static void main(String[] args) {
        char charecter;// Variable declare.

        Scanner input = new Scanner(System.in);// Create Scanner Keyword.
        System.out.print("Enter any Charecter : ");
        charecter = input.next().charAt(0);// Read user Input.

        if (charecter == 'a' || charecter == 'e' || charecter == 'i' || charecter == 'o' || charecter == 'u') {
            System.out.println("It is Vowel.");
        } else {
            System.out.println("It is Consonant");
        }

        input.close();// Close Scanner input.
    }

}
