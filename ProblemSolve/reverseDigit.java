package ProblemSolve;

import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args){
        int num ,temp,r, sum =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some integer number: ");
        num = input.nextInt(); 
        temp = num;
        while(temp !=0){
            r = temp % 10;
            sum = (sum *10)+ r;
            temp = temp/10;
        }
        if(num == sum)
        {
            System.out.println("Your Given number is Palindrome.");
        }
        else
        {
            System.out.println("Your Given number is Not Palindrome.");

        }
        System.out.println(num+" Reverse is "+sum);
        input.close();
    }
}
