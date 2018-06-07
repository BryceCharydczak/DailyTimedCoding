import java.io.*;
import java.util.*;


public class PrincessBot {
    public static void main(String[] args){

    }

    public String move(String[][] array, int x){
        int n = x;
        String answer = "";
        Pair princess = new Pair();
        Pair bot = new Pair();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (array[i][j].equals("m")){
                    bot.setX(j);
                    bot.setY(n-i);
                }
                if (array[i][j].equals("p")){
                    princess.setX(j);
                    princess.setY(n-i);
                }
            }
        }

        //Horizontal Change
        if (princess.getX() - bot.getX() < 0) {
            for (int i = 0; i < Math.abs((princess.getX()-bot.getX())); i++){
                answer += left();
            }
        } else if (princess.getX() - bot.getX() > 0) {
            for (int i = 0; i < Math.abs((princess.getX()-bot.getX())); i++){
                answer += right();
            }
        }



        //Vertical Change
        if (princess.getY() - bot.getY() < 0) {
            for (int i = 0; i < Math.abs((princess.getY()-bot.getY())); i++){
                answer += down();
            }
        } else if (princess.getY() - bot.getY() > 0) {
            for (int i = 0; i < Math.abs((princess.getY()-bot.getY())); i++){
                answer += up();
            }
        }


        return answer;
    }
    public static String left(){
        return ("LEFT");
    }
    public static String right(){
        return ("RIGHT");
    }
    public static String up(){
        return ("UP");
    }
    public static String down(){
        return ("DOWN");
    }

    public class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        Pair(){}
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
    }
}
