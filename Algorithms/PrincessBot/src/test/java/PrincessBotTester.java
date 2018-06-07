import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincessBotTester {
    public static void main(String[] args) {



    }
/*
Deprecated test that auto ran to test whether the application was sending and receiving data properly.

    @Test
    void testMove(){
        PrincessBot pbot = new PrincessBot();
        int n = 3;
        String[][] arr = {{"-","-","-"},{"m","-","-"},{"p","-","-"}};
        String answer = pbot.move(arr, n);
        Assertions.assertEquals(answer,"---m--p--");

    }
    */

    @Test
    void testMoveFinal(){
        PrincessBot pbot = new PrincessBot();
        int n = 3;
        String[][] arr = {{"-","-","-"},{"m","-","-"},{"-","p","-"}};
        String answer = pbot.move(arr, n);
        Assertions.assertEquals("RIGHTDOWN",answer);

    }

    @Test
    void testMoveFinal2(){
        PrincessBot pbot2 = new PrincessBot();
        int n = 3;
        String[][] arr = {{"-","-","m"},{"-","-","-"},{"-","p","-"}};
        String answer = pbot2.move(arr, n);
        Assertions.assertEquals("LEFTDOWNDOWN",answer);

    }

    @Test
    void testMoveFinal3(){
        PrincessBot pbot3 = new PrincessBot();
        int n = 5;
        String[][] arr = {{"-","-","-","-","p"},
                {"-","-","-","-","-"},
                {"-","-","-","-","-"},
                {"-","-","m","-","-"},
                {"-","-","-","-","-"}
    };
        String answer = pbot3.move(arr, n);
        Assertions.assertEquals("RIGHTRIGHTUPUPUP",answer);

    }
}
