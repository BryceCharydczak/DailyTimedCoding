import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        String lowerString = inputString.toLowerCase();
        boolean test = true;
        for (int i = 0; i < alphabet.length; i++){
            if (lowerString.contains(Character.toString(alphabet[i]))){
                continue;
            } else {
                test = false;
            }
        }
        if (test == true){
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }


    }
}
