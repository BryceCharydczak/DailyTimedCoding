import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int hurdleRace(int k, int[] height) {
        // Complete this function
        int max = height[0];
        for (int i = 1; i < height.length; i++){
            if (height[i] > max){
                max = height[i];
            }
        }
        int answer = max - k;
        if (answer < 0){
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}

