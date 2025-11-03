import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

    @Test
    void testFindLongestCWordWhenAllCs() {
        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("capybara");
        words.add("caribou");
        words.add("cicada");

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("capybara", actual);
        }

    @Test
    void testFindLongestCWordWhenUpperAndLowerCase() {
        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("Capybara");
        words.add("caribou");
        words.add("Cicada");

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("Capybara", actual);
        }        

    @Test
    void testFindLongestCWordWhenNoCs() {
        ArrayList<String> words = new ArrayList<>();
        words.add("dog");
        words.add("zebra");
        words.add("leopard");
        words.add("dolphin");
        words.add("donkey");
        words.add("octopus");
        words.add("whale");

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("", actual);
        }

    @Test
    void testFindLongestCWordWhenMixOfLetters() {
        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("capybara");
        words.add("caribou");
        words.add("cicada");
        words.add("donkey");
        words.add("crocodile");
        words.add("ocrocodile");

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("crocodile", actual);
        }        

    @Test
    void testfindLongestCWordWhenStringIsEmpty() {
        ArrayList<String> words = new ArrayList<>();
        words.add("");

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("", actual);       
    
    }
}




