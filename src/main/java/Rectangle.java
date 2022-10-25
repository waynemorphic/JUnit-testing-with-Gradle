import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* - create an application that prompts a user to enter length and width measurements
* - create a method to show whether it is a square or a rectangle
* */
public class Rectangle {
    private int width;
    private int length;

    public static void main(String[] args) {
        try{
            System.out.println("Enter Width");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String userWidth = bufferedReader.readLine();
            int parseWidth = Integer.parseInt(userWidth);

            System.out.println("Enter Length");
            String userLength = bufferedReader.readLine();
            int parseLength = Integer.parseInt(userLength);

            Rectangle rectangleInstance = new Rectangle(parseWidth, parseLength);
            System.out.println(rectangleInstance.isBoolean());

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    /*
     - getter and setter methods of the private class properties
     - getter method returns the instance variable
     - getter method returns the value of the attribute
     - setter method takes a parameter and assigns it to the attribute
     - setter method sets or updates the value of the instance variable
     - once the setter and the getter have been defined, they are used in the main
     */

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public String isBoolean(){
        if (this.length == this.width){
            return "This is a square";
        }
        return "This is a rectangle";

    }

}
