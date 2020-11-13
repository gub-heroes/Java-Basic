package ProblemSolve;

import java.util.*;

public class TokenDemo {

    public static void main(String[] args) {
        int size, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integers with gap: ");
        String st2 = input.nextLine();
        StringTokenizer st1 = new StringTokenizer(st2, " ");
        while (st1.hasMoreTokens()) {
            String temp = st1.nextToken();
            size = Integer.parseInt(temp);
            System.out.println(size);
            sum += size;
        }
        System.out.println("Integer Sum is: " + sum);
        input.close();
    }
}
