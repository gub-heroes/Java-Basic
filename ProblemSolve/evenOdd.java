package ProblemSolve;//Package Name.

import java.util.Scanner; // Import the java scanner class which is a package.

public class evenOdd { // Class name.
    public static void main(String[] args) {
        int number; // Variable declare.
        Scanner input = new Scanner(System.in);// Create Scanner Keyword.

        System.out.print("Enter any Integer number : ");// Read user Input.
        number = input.nextInt();

        // Conditional Statement start here.
        if (number % 2 == 0) {
            System.out.println(number + " number is Even."); // Even number checker and show the output.
        } else {
            System.out.println(number + " number is Odd."); // Odd number checker and show the Output.
        }
        // Conditional Statement end here.

        input.close(); // Close Scanner input.
    }

}
