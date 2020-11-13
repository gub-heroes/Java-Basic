package ProblemSolve;
import java.util.Scanner;
public class AscendingOrder 
{
    public static void main(String[] args) 
    {
        int c, temp;
        //User inputs the array size
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        c = input.nextInt();

        int num[] = new int[c];
        for (int i = 0; i < c; i++) 
        {
            System.out.print("Enter the elements: ");
            num[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < c; i++) 
        {
            for (int j = i + 1; j < c; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Elements in Ascending Order: ");
        for (int i = 0; i < c - 1; i++) 
        {
            System.out.print(num[i] + "< ");
        }
        System.out.print(num[c - 1]);
    }
}