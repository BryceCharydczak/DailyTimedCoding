import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] leftRotation(int[] a, int d) {
    
        int turnAround = d % a.length;
        int[] right = Arrays.copyOfRange(a, 0, turnAround);
        int[] left = Arrays.copyOfRange(a, turnAround, a.length);
        int[] combine = new int[right.length + left.length];
        for (int i = 0; i < left.length; i++){
            combine[i] = left[i];
        }
        for (int i = 0; i < right.length; i++){
            combine[i+left.length] = right[i];
        }
        return combine;
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
