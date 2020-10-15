package ProblemSolve;

import java.util.Scanner;

public class sumavgmaxmin {
    public static void main(String[] args) {
        int size, sum = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        size = input.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = input.nextInt();
            sum += arr[i];
            average = sum / arr.length;

        }

        System.out.println("Here is the sum " + sum);
        System.out.println("Here is the Average " + average);
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);
        input.close();
        // input.close();
    }

}
