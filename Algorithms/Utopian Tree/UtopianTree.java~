import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int utopianTree(int n){
        
        // iterate and add or doulble the size of the tree in an alternating fashion by using modulus on the iterator
        
        int answer = 1;
        for (int i = 0; i < n; i++){
            if (i%2 == 0){
                answer *= 2;
            } else {
                answer++;
            }
        }
        return answer;
    }
 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}

