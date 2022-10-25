import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        System.out.println("hello there");
        System.out.println(addition(4,4));

        App.replaceNums();
    }
    static int addition(int numA, int numB){
        int numSum = numA + numB;
        return numSum;
    }

    /*
    * - create a method that takes a number from a user and returns a range of
    *   numbers from 1 to the chosen number with the following exceptions
    *
    * 1. Numbers divisible by 3 are replaced with the String "ping"
    * 2. Numbers divisible by 5 are replaced with the String "pong"
    * 3. Numbers divisible by 15 are replaced with a String "ping-pong"*/

    static ArrayList<Object> replaceNums() {
        int constNum = 1;
        int nums;
        ArrayList<Object> arrayList = new ArrayList<Object>();

        System.out.println("Enter a number");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String entryNum = bufferedReader.readLine();
            nums = Integer.parseInt(entryNum);

            System.out.println("The range of numbers from 1 to " + " " + nums);


            for (int i = 1; i < nums; i++) {
//                arrayList.add(i);
                System.out.println(arrayList);
////                String resArray = arrayList.toString();
//                return arrayList.toString();

                if (i % 3 == 0) {
                    arrayList.add("Ping");

                } else if (i % 5 == 0) {
                    arrayList.add("Pong");

                } else if (i % 3 == 0 && nums % 5 == 0) {
                    arrayList.add("Ping Pong");
                }
                else{
                    arrayList.add(i);
                }
                System.out.println(arrayList);
                return arrayList;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
