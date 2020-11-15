package ProblemSolve;

import java.util.Scanner;

public class matrixdemo {
    public static void main(String[] args) {
        // Variable declaration.
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];
        // For (A) matrix input collect.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of (A):");
        System.out.println("=======================");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf(" ", row, col);
                A[row][col] = input.nextInt();
            }
            System.out.println("");
        }

        // For (B) matrix input collect.
        System.out.println("Enter the value of (B)");
        System.out.println("================");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf(" ", row, col);
                B[row][col] = input.nextInt();
            }
            System.out.println("");
        }
        // (A) Matrix Printing
        System.out.println("Your (A) Matrix is : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println("");
        }

        System.out.println("");
        // (B) Matrix Printing
        System.out.println("Your (B) Matrix is : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + B[row][col]);
            }
            System.out.println("");
        }
        // Addition of (A) and (B) Matrix.
        System.out.println("\nYour (A + B) Matrix is :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = (A[row][col] + B[row][col]);
                System.out.print("\t" + C[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");

        input.close();
    }
}
