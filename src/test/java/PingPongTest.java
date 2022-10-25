import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PingPongTest {

    @Test
    @DisplayName("If value is divisible by 3, replace value with Ping. " +
            "If value is divisible by 5, replace with Pong. " +
            "If divisible by 15, replace with Ping Pong")
    void changeNums() {

        ArrayList<Object> objectOutput_Div_3 = new ArrayList<>();
        objectOutput_Div_3.add(1);
        objectOutput_Div_3.add(2);
        objectOutput_Div_3.add("Ping");
        assertEquals(objectOutput_Div_3, PingPong.changeNums(3));
//    }
//
//    @Test
//    @DisplayName("If value is divisible by 5, replace the value with Pong")
//    void change_Nums_Divisible_By_Five(){
        ArrayList<Object> objectOutput = new ArrayList<Object>();

        objectOutput.add(1);
        objectOutput.add(2);
        objectOutput.add("Ping");
        objectOutput.add(4);
        objectOutput.add("Pong");
        objectOutput.add("Ping");
        objectOutput.add(7);
        objectOutput.add(8);
        objectOutput.add("Ping");
        objectOutput.add("Pong");
        objectOutput.add(11);
        objectOutput.add("Ping");
        objectOutput.add(13);
        objectOutput.add(14);
        objectOutput.add("Ping Pong");
        assertAll(
                () -> assertEquals(objectOutput_Div_3, PingPong.changeNums(3)),
                () -> assertEquals(objectOutput, PingPong.changeNums(15))
        );
    }
}