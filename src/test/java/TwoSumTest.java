import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum twoSumInstance = new TwoSum();

    @Test
    @DisplayName("The sum of two elements of an array compute to target")
    void twoSum() {
        assertArrayEquals(new int[] {0,1}, twoSumInstance.elemSum(new int[] {1,2,3,4,5}, 3));
    }

    @Test
    @DisplayName("Using hashMap to find the index 0f elements that compute to target")
    void hashSum(){
        assertArrayEquals(new int[] {0,2}, twoSumInstance.hashSum(new int[] {1,2,3,4,6}, 4) );

    }
}