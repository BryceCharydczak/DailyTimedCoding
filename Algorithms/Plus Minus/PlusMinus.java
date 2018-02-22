import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        int n = arr.length;
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] < 0){
                minus++;
            } else if (arr[i] > 0){
                plus++;
            } else {
                zero++;
            }
        }
        System.out.println((float)plus/(float)n);
        System.out.println((float)minus/(float)n);
        System.out.println((float)zero/(float)n);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}

