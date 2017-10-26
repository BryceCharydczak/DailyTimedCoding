import java.io.*;
import java.util.*;
// Team Yeet
// Writer: Bryce Charydczak

public class EasterBunny {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Map<String, String> firstNames = new HashMap<String, String>();
        Map<String, String> lastNames = new HashMap<String, String>();
        int n = 26;

        for (int i = 0 ; i < n; i++ ){
            String[] temp = scan.nextLine().split("\\s+");
            firstNames.put(temp[0],temp[1]);
        }
        for (int i = 0 ; i < n; i++ ){
            String[] temp = scan.nextLine().split(" ", 2);
            lastNames.put(temp[0],temp[1]);
        }
        int k = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < k; i++){
            String [] temp2 = scan.nextLine().split("\\s+");
            char[] tempFirst = temp2[0].toCharArray();
            char[] tempLast = temp2[1].toCharArray();
            String firstModded = firstNames.get(String.valueOf(tempFirst[0]));
            String lastModded = lastNames.get(String.valueOf(tempLast[0]));

            System.out.print(temp2[0] + " ");
            System.out.print(temp2[1]);
            System.out.print(" = ");
            System.out.print(firstModded + " ");
            System.out.print(lastModded);
            System.out.println("");

        }
        scan.close();


    }
}
