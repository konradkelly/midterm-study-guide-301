import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffWhenAllPositive() {
        int[] numbers = {9, 2, 8, 4, 5, 7, 6};
        int actual = Practice.maxDiff(numbers);
        assertEquals(7, actual);
    }

    @Test
    void testMaxDiffWhenAllNegative() {
        int[] numbers = {-7, -8, -3, -2};
        int actual = Practice.maxDiff(numbers);
        assertEquals(6, actual);
    }

    @Test
    void testMaxDiffWhenAllSameNumber() {
        int[] numbers = {8, 8, 8, 8};
        int actual = Practice.maxDiff(numbers);
        assertEquals(0, actual);
    }    
}



