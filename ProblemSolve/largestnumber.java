package ProblemSolve;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args){
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        size = input.nextInt();
        
        int arr[] = new int[size];
        int max =arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = input.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Your element is = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\nMaximum value is : " + max);
        System.out.println("Minimum value is : " + min);
        input.close();

    }
}
