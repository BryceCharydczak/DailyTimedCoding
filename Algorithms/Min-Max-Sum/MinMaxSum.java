import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long original = 0;
        long[] duplicate = new long[arr.length];
        for (int i = 0; i < arr.length; i++){
            original += (long)arr[i];
        }
        
        for (int i = 0; i < arr.length; i++){
            duplicate[i] = original - arr[i];
        }
        long min = duplicate[0];
        long max = duplicate[0];
        for (int i = 1; i < duplicate.length; i++){
            if (duplicate[i] > max){
                max = duplicate[i];
            }
            if (duplicate[i] < min){
                min = duplicate[i];
            }
        }
        System.out.println( min + " " + max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

