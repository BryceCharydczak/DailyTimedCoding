import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            String temp = scan.next();
            array[i] = temp;
            
        }
        int nAgain = scan.nextInt();
        String temp;
        int answer;
        for (int i = 0; i < nAgain; i++){
            temp = scan.next();
            process(array, temp, n);
        }
       
    }
    public static void process(String[] array, String test, int n){
        int count = 0;
        for (int i = 0; i < n ; i++){
            if(array[i].compareTo(test) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
