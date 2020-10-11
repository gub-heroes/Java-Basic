package Basic;

import java.util.Scanner; // Import the java scanner class which is a package

public class UserInput {

    public static void main(String[] args) {

        /*
         * Create Scanner object
         */
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        /*
         * Read user input
         */
        System.out.print("Enter User name : ");
        String oName = input.nextLine();// Variable declare and collect input.

        System.out.print("Enter your age : ");
        int oAge = input.nextInt();// Variable declare and collect input.

        System.out.print("Enter your Cgpa : ");
        double cgpa = input.nextDouble();// Variable declare and collect input.

        System.out.print("Enter your Email : ");
        String oMail = input1.nextLine();// Variable declare and collect input.

        /**
         * Show user given input
         */
        System.out.println("\n<<<< Here is your basic information >>>>\n");
        System.out.println("Your user name is : " + oName);
        System.out.println("Your age is : " + oAge);
        System.out.println("Your Cgpa is : " + cgpa);
        System.out.println("Your Email is : " + oMail);

        input.close();
        input1.close();

    }
}
