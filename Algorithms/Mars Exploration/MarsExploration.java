import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        int mistakes = 0;
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        char[] yo = S.toCharArray();

        for (int i = 0; i < yo.length; i++){
            if ( (i % 3) == 1){
                if ( yo[i] != 'O'){
                    mistakes++;
                }
            }else{
                if (yo[i] != 'S'){
                    mistakes++;
                }
            }
        }
        System.out.println(mistakes);
    }
}
