import java.io.*;
import java.util.*;

/*
* A very simple console executable made just because a girl told me I was a slow texter,
* I then wanted to make a quick app to calculate who on average was slower by inputting
* the difference in time between texts and average it out.  It turned out that at the
* time I on average took 18 min to respond whereas the girl was 28.375 min.
* */

public class DisprovingHolly {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double HollyTally = 0.0;
        double BryceTally = 0.0;
        double counter = 0.0;

        while(scan.nextInt() != -1){
            counter++;
            System.out.println("Please enter how long Holly took to respond");
            HollyTally += Double.parseDouble(scan.next());
            System.out.println("Please enter how long Bryce took to respond");
            BryceTally += Double.parseDouble(scan.next());

        }

        System.out.println("Bryce took " + (BryceTally/counter) + " minutes to respond on average");
        System.out.println("Holly took " + (HollyTally/counter) + " minutes to respond on average");

    }
}
