package ProblemSolve;

import java.util.Scanner;

public class TriangleOfCircle {

    public static void main(String[] args){
        double base,hieght,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base : ");
        base = input.nextDouble();
        System.out.print("Enter height : ");
        hieght = input.nextDouble();
        area = 0.5 * base * hieght;
        System.out.println("Area : " + area);

    }
    
    
}
