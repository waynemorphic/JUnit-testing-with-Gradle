import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Addition of two integers") // --> annotation specifies the name of our test
    void addition() {
        /*
        * - the assertAll method takes a series 0f assertions in form of Lambda
        * - it ensures that are the methods are checked
        * - more convenient than having multiple, single assertions
        * - Ctrl + Shift + T command to navigate between test and code being tested
        *
        * - intelliJ hides passed tests by default. To view them,  make sure the
        *   Show Passed option is enabled in the run tool window
        * */

        assertAll(
                () -> assertEquals(6, App.addition(4,2)),
                () -> assertEquals(9, App.addition(18, -9))
        );
    }

}