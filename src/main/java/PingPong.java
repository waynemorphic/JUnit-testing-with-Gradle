import java.util.ArrayList;

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
