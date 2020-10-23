package ProblemSolve;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println("Press 1 to Check Fibonacci Series\nPress 2 to Check Factorial Series");
        System.out.print("Enter your value = ");
        int choiceOption;
        Scanner inp = new Scanner(System.in);
        choiceOption = inp.nextInt();
        switch (choiceOption) {
            case 1:
                System.out.println("This is Fibonacci seris with loop");
                int f1 = 0, f2 = 1, f3 = 0, n, i;
                Scanner input = new Scanner(System.in);

                System.out.print("Decalare th:");
                n = input.nextInt();
                for (i = 0; i < n - 2; i++) {
                    f3 = f1 + f2;
                    f1 = f2;
                    f2 = f3;
                    input.close();
                }
                System.out.println(n + "th no.Fibonacci is :" + f3);
                break;
            case 2:
                System.out.println("This is Factorial seris with loop");
                int num, j = 1;
                long fact = 1;
                Scanner inpu = new Scanner(System.in);
                System.out.print("Enter any integer number: ");
                num = inpu.nextInt();
                while (j <= num) {
                    fact *= j;
                    j++;
                }
                System.out.printf(num + "th no. Factorial is = " + fact);

                inpu.close();
                break;
            default:
                System.out.println("Sorry you press wrong.\n");
                break;
        }
        inp.close();
    }
}
