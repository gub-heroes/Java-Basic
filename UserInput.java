import java.util.Scanner;   // Import the java scanner class which is a package

public class UserInput {

        public static void main(String[] args){

            Scanner name = new Scanner(System.in);
            String oName;
            Scanner age = new Scanner(System.in);
            int oAge;
            System.out.print("Enter User name : ");
            oName = name.nextLine();

            System.out.print("Enter your age : ");
            oAge = age.nextInt();

            System.out.println("Your user name is : "+oName);
            System.out.print("Your age is : "+oAge);

    }
}
