import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @BeforeEach
    @DisplayName("This is a set up method")
    void setUp() {
    }

    @AfterEach
    @DisplayName("This is a tear down method to clear everything after method runs successfully")
    void tearDown() {
    }

    @Test
    @DisplayName("Checking of class is correctly instantiated")
    void correctInstantiation(){
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(true, rectangle instanceof Rectangle);
    }

    @Test
    @DisplayName("Test method to check if value of width entered is saved")
    void getWidth() {
        Rectangle rectangle = new Rectangle(2,4);
        assertEquals(2, rectangle.getWidth());
    }

    @Test
    @DisplayName("Testing if length getter method saves the value given")
    void getLength() {
        Rectangle rectangle = new Rectangle(2,4);
        assertEquals(4, rectangle.getLength());
    }

    @Test
    @DisplayName("If the values entered give a square or a rectangle")
    void isBoolean(){
        Rectangle rectangle = new Rectangle(2,3);
        assertEquals("This is a rectangle", rectangle.isBoolean());

    }

}