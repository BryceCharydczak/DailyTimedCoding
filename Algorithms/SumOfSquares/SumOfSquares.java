import java.util.*;
import java.io.*;


/*
TEST OUTPUT:
200 should equal 2, as well as 3
 */

public class SumOfSquares {

    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (scan.hasNextLine()) {
            array.clear();
            int current = scan.nextInt();
            // System.out.println(current);
            boolean ended = false;
            double guess = Math.sqrt((double) (current));
            for (int i = (int) Math.floor(guess); i > 0; i--) {

                int square = i * i;
                if ((current - square) == 0) {
                    array.add(i);
                    current -= square;
                } else if ((current - square) > 0) {
                    array.add(i);
                    current -= square;
                }

                //System.out.println(i);
                if (i == 1 && current != 0) {
                    ended = true;
                }
            }
            if (ended == true) {
                System.out.println(0);
            } else {
                boolean decide = true;
                for (int i = 0; i < array.size() - 1; i++) {

                    if ((((int) array.get(i)) - (int) array.get(i + 1)) == 1) {
                        decide = false;
                    }
                }
                if (decide == true) {
                    System.out.println(array.size());
                } else {
                    System.out.println(0);
                }
            }
        }
        scan.close();

    }
}
