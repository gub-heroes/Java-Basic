package ProblemSolve;

import java.util.Arrays;

public class sortedArray {
    public static void main(String[] args){
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        int size = A.length + B.length;
        int[] c = new int[size];
        System.arraycopy(A, 0,c,0, A.length);
        System.arraycopy(B, 0,c,A.length, B.length);
        Arrays.sort(c);
        for(int i=0; i<A.length;i++){
            A[i] = c[i];
        }
        for(int i =0; i<B.length;i++){
            B[i] = c[ A.length + i ];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
