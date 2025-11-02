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

    @Test
    void testFindLongestCWordWhenAllCs() {
        String[] words = {"cat", "capybara", "caribou", "cicada"};

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("capybara", actual);
        }

    @Test
    void testFindLongestCWordWhenUpperAndLowerCase() {
        String[] words = {"cat", "Capybara", "caribou", "Cicada"};

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("Capybara", actual);
        }        

    @Test
    void testFindLongestCWordWhenNoCs() {
        String[] words = {"dog", "zebra", "leopard", "dolphin", "donkey", "octopus", "whale"};

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("", actual);
        }

    @Test
    void testFindLongestCWordWhenMixOfLetters() {
        String[] words = {"cat", "dog", "capybara", "caribou", "cicada", "donkey", "crocodile", "ocrocodile"};

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("crocodile", actual);
        }        

    @Test
    void testfindLongestCWordWhenStringIsEmpty() {
        String[] words = {""};

        String actual = Practice.findLongestCWord(words);
        
        assertEquals("", actual);       
    
    }
    
    @Test
    void testInBetweenValidAndNonValidCases() {
        String[] words = {"key", "house", "truck", "chimney", "lock", "fireplace", "TV"};
        int actual = Practice.inBetweenNandM(words, 3, 8);
        
        assertEquals(4, actual); 
    }

    @Test
    void testInBetweenWhenNEqualsM() {
        String[] words = {"key", "house", "truck", "chimney", "lock", "fireplace", "TV"};
        int actual = Practice.inBetweenNandM(words, 3, 3);
        
        assertEquals(0, actual); 
    }    

    @Test
    void testInBetweenWhenAllTheSameWord() {
        String[] words = {"chimney", "chimney", "chimney", "chimney", "chimney"};
        int actual = Practice.inBetweenNandM(words, 3, 8);
        
        assertEquals(5, actual); 
    }

    @Test
    void testInBetweenWhenOnlyOneWordPresent() {
        String[] words = {"chimney"};
        int actual = Practice.inBetweenNandM(words, 3, 8);
        
        assertEquals(1, actual); 
    }                 
}        




