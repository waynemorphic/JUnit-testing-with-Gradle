import java.util.ArrayList;

/*
 * - create a method that takes a number from a user and returns a range of
 *   numbers from 1 to the chosen number with the following exceptions
 *
 * 1. Numbers divisible by 3 are replaced with the String "ping"
 * 2. Numbers divisible by 5 are replaced with the String "pong"
 * 3. Numbers divisible by 15 are replaced with a String "ping-pong"*/

public class PingPong {
    public static void main(String[] args){
        System.out.println(PingPong.changeNums(15));
    }
    static ArrayList<Object> changeNums(int nums){
        ArrayList<Object> arrayList = new ArrayList<Object>();

        for ( int i = 1; i <= nums; i++){
            if (i % 3 == 0 && i % 5 == 0){
                arrayList.add("Ping Pong");
            }
            else if (i % 5 == 0){
                arrayList.add("Pong");
            }
            else if(i % 3 == 0){
                arrayList.add("Ping");
            }
            else{
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
