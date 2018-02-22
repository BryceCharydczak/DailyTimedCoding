import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
        char[] arr = new char[n];
        for (int i = 0; i < n; i++){
            arr[i] = ' ';
        }
        for (int i = 0; i < n; i++){
            arr[n-(i+1)] = '#';
            String temp = "";
            for (int j = 0; j < n; j++){
                temp += arr[j];
            }
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}

