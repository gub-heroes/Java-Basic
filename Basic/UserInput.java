package Basic;
import java.util.Scanner; // Import the java scanner class which is a package

public class UserInput {

    public static void main(String[] args) {
        /*
         * Variable declare
         */
        String oName, oMail;
        int oAge;

        /*
         * Create Scanner object
         */
        Scanner input = new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
        /*
         * Read user input
         */
        System.out.print("Enter User name : ");
        oName = input.nextLine();

        System.out.print("Enter your age : ");
        oAge = input.nextInt();

        System.out.print("Enter your Email : ");
        oMail = input1.nextLine();

        /**
         * Show user given input
         */
        System.out.println("Your user name is : " + oName);
        System.out.println("Your age is : " + oAge);
        System.out.println("Your Email is : " + oMail);

    }
}
