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

    @Test
    void testInBetweenValidAndNonValidCases() {
        HashSet<String> words = new HashSet<>();
        words.add("key");
        words.add("house");
        words.add("truck");
        words.add("chimney");
        words.add("lock");
        words.add("fireplace");
        words.add("TV");
        int actual = Practice.inBetweenNandM(words, 3, 8);
        
        assertEquals(4, actual); 
    }

    @Test
    void testInBetweenWhenNEqualsM() {
        HashSet<String> words = new HashSet<>();
        words.add("key");
        words.add("house");
        words.add("truck");
        words.add("chimney");
        words.add("lock");
        words.add("fireplace");
        words.add("TV");
        int actual = Practice.inBetweenNandM(words, 3, 3);
        
        assertEquals(0, actual); 
    }    

    @Test
    void testInBetweenWhenAllTheSameWord() {
        HashSet<String> words = new HashSet<>();
        words.add("chimney");
        words.add("chimney");
        words.add("chimney");
        words.add("chimney");
        words.add("chimney");
        int actual = Practice.inBetweenNandM(words, 3, 8);
        
        assertEquals(1, actual); // Changed from 5 to 1!
    }

    @Test
    void testInBetweenWhenOnlyOneWordPresent() {
        HashSet<String> words = new HashSet<>();
        words.add("chimney");
        int actual = Practice.inBetweenNandM(words, 3, 8);
        
        assertEquals(1, actual); 
    }

    @Test
    void testEvenOddDiffWhenEqualAmountOfOddsAndEvens() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(7, 6);
        map.put(8, 7);
        int actual = Practice.evenOddDiff(map);
        
        assertEquals(0, actual);
    }         

    @Test
    void testEvenOddDiffWhenMoreEvensThanOdds() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(8, 6);
        int actual = Practice.evenOddDiff(map);
        
        assertEquals(1, actual);
    }

    @Test
    void testEvenOddDiffWhenMoreOddsThanEvens() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(7, 6);
        int actual = Practice.evenOddDiff(map);
        
        assertEquals(-1, actual);
    }

    @Test
    void testEvenOddDiffWhenZero() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int actual = Practice.evenOddDiff(map);
        
        assertEquals(1, actual);
    }
    
@Test
void testFindSecondLargestWhenDifferenceIsOne() {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 2);
    map.put(1, 50);
    map.put(2, 98);
    map.put(3, 99);
    int actual = Practice.findSecondLargest(map);
    
    assertEquals(98, actual);
}

@Test
void testFindSecondLargestWhenPositiveAndNegativeNumbers() {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1000);
    map.put(1, 1000);
    int actual = Practice.findSecondLargest(map);
    
    assertEquals(-1000, actual);
}

@Test
void testFindSecondLargestWhenSameNumber() {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    map.put(1, 1);
    int actual = Practice.findSecondLargest(map);
    
    assertEquals(-2147483648, actual);
}

@Test
void testFindSecondLargestWhenMaxAndMinIntegerValues() {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, Integer.MIN_VALUE);
    map.put(1, Integer.MAX_VALUE);
    int actual = Practice.findSecondLargest(map);
    
    assertEquals(-2147483648, actual);
    }     
}



