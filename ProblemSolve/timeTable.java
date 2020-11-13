package ProblemSolve;

import java.util.Scanner;

public class timeTable {
    public static void main(String[] args) {
    int n, m ,result = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Initial number :");
    m = input.nextInt();
    System.out.print("Enter the Final number :");
    n = input.nextInt();
    for(int i = m; i<=n; i++){
    for (int j = 1; j <= 10; j++) {
        result= i*j;
        System.out.println(i +"X"+ j + "=" + result + " ");
    }
    System.out.println("\n");
}
    System.out.println();
    input.close();
}
}
//আমাদের দেশে হবে সেই ছেলে কবে ক্থায় না বড় হয়ে কাজে বড় হবে ।