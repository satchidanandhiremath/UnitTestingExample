package unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxFinderTest {
    
    @Test
    public void testFindMax() {
        MaxFinder maxFinder = new MaxFinder();
        int[] numbers = {1, 3, 4, 2};
        int expectedResult = 4;
        int actualResult = maxFinder.findMax(numbers);
        assertEquals(expectedResult, actualResult);
    }
}