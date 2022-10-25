/*
* - develop a method that prints from 1 to a number entered by a user
* - number should only be positive
* - if number entered by user is negative, return 1
*
* */

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String resNum = bufferedReader.readLine();
            int parseRes = Integer.parseInt(resNum);

            System.out.println(App.replaceNums(parseRes));
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println(addition(2, 3));
    }

    public static int addition(int numX, int numY) {
        return (numX + numY);
    }


    static ArrayList<Object> replaceNums(int nums) {
        ArrayList<Object> arrayList = new ArrayList<Object>();

        int n = 1;
        if (nums < n){
            arrayList.add(1);
        }

        for (int i = 1; i <= nums; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
}

