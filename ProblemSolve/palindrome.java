package ProblemSolve;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) 
    {
        System.out.print("Enter any string : ");
        Scanner input = new Scanner(System.in);
        String oS = input.nextLine();
        String rS = "";
        char[] chara = oS.toCharArray();
        for( int i = chara.length - 1 ; i >= 0 ; i-- ) {
            rS += chara[i];
        }
        System.out.println("Reverse String is: "+ rS);
        if (oS.equals(rS)) {
            System.out.println("String is a palindrome.");
        } 
        else {
            System.out.println("String is not a palindrome.");
        }
        input.close();
    }
}

