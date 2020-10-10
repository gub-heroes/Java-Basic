import java.util.Scanner;   // Import the java scanner class which is a package

public class UserInput {

        public static void main(String[] args){
            /*
            * Variable declare
             */
            String oName, oMail;
            int oAge;

            /*
             * Create Scanner object 
             */
            Scanner name = new Scanner(System.in);
            Scanner age = new Scanner(System.in);
            Scanner mail = new Scanner(System.in);

            /*
            * Read user input
             */
            System.out.print("Enter User name : ");
            oName = name.nextLine();

            System.out.print("Enter your age : ");
            oAge = age.nextInt();

            System.out.print("Enter your Email : ");
            oMail = mail.nextLine();

            /**
             * Show user given input  
             */
            System.out.println("Your user name is : "+oName);
            System.out.println("Your age is : "+oAge);
            System.out.println("Your Email is : "+oMail);

    }
}
