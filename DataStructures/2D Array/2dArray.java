import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // forming 2d array
        Scanner scan = new Scanner(System.in);
        int n = 6;
        int[][] twoD = new int[n][n];
        for (int i = 0; i < n; i++){
           // System.out.println();
            for (int j = 0; j < n; j++){
                twoD[i][j] = scan.nextInt();
                //System.out.print(twoD[i][j]);
            }
        }

        int newN = 5;
        ArrayList finalArray = new ArrayList();
        int answer = 0;
        for (int i = 1; i < newN; i++){
            for (int j = 1; j < newN; j ++){
                
            answer = makeInt(twoD, i, j);
            finalArray.add(answer);
            }
        }

        int finalSize = finalArray.size();
        Collections.sort(finalArray);
        Collections.reverse(finalArray);
        System.out.println(finalArray.get(0));

    }
    public static int makeInt(int[][] twoD, int i, int j){
        int answer = 0;
        int middle = twoD[i][j];
            answer += middle;
        
            for (int k = 0; k < 3; k++){
                if (k != 2){
                    answer += twoD[i-1][j+k];
                    answer += twoD[i+1][j+k];
                } else {
                    answer += twoD[i-1][j-1];
                    answer += twoD[i+1][j-1];
                }
            
            } 
        return answer;
    }

}
