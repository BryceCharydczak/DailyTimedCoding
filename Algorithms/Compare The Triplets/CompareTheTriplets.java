import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int compare(int a, int b){
        int answer = 0;
        if (a < b){
            answer = 1;
        } 
        if (b < a){
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int ATally = 0;
        int BTally = 0;
        
        
        for ( int i = 0; i < 3; i++){
            A[i] = scan.nextInt();
        }
        for ( int i = 0; i < 3; i++){
            B[i] = scan.nextInt();
        }
        
        for ( int i = 0; i < 3; i++){
            int answer = compare(A[i], B[i]);
            if (answer == -1){
                ATally++;
            } else if (answer == 1){
                BTally++;
            } else {
                continue;
            }
        }
        
        System.out.println(ATally + " " + BTally);

    }
}

