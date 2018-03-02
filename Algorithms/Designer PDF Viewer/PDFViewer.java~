import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {

        // making the word into char array to parse and use ordinal value through casting the char object to map out
        // which values from the given array of ints is being used by this given word.
        
        char[] letters = word.toCharArray();
        int[] values = new int[letters.length];
        for (int i = 0; i < letters.length; i++){
            values[i] = h[letters[i]%97];
        }
        
        // finding the maximum value from the array of used heights from the letters we parsed earlier and will use
        // that max number and multiply it by the length of the char array which is the length of the given word.
        int max = values[0];
        for (int i = 1; i < values.length; i++){
            if (values[i] > max){
                max = values[i];
                //System.out.println(values[i]);
            }
        }
        int answer = max*letters.length;
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}

