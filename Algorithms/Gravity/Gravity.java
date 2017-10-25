import java.util.*;

/*

ICPC 5: Team YEET
Team: Joe, Zach, Bryce
Written By: Bryce
"YEET, the team you cannot beat"


*/
public class Gravity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstLine = scan.nextLine().split("\\s+");
        int m = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);
        char[][] twoD = new char[m][n];


        //fills the 2D array by throwing each line into a char array
        // and throwing each of the line char's into the 2d matrix
        for (int i = 0; i < m; i++){
            char [] line = scan.nextLine().toCharArray();
            for (int j = 0; j < n; j++){
                twoD[i][j] = line[j];
            }

        }
        scan.close();


        // searches for when apple collides with open, swaps them

        // searches for apple collides with apple and then swaps
        // it later down with next open space.
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n; j++) {
                if (twoD[i][j] == 'o' && twoD[i+1][j] == '.') {
                    twoD[i+1][j] = 'o';
                    twoD[i][j] = '.';
                }
                else if ( twoD[i][j] == 'o' && twoD[i+1][j] == 'o'){
                    int k = 1;
                    while (twoD[i+k][j] == 'o' && (i+k < m-1)){
                        k++;
                    }
                    if (twoD[i+k][j] == '.'){
                        twoD[i+k][j] = 'o';
                        twoD[i][j] = '.';
                    }
                }

            }
        }

        // append to a line, print that line for output
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(twoD[i][j]);
            }
            System.out.println("");
        }

    }

}