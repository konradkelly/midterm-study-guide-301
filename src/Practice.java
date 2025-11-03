import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
        public static int maxDiff(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
                if (nums[i] < min) {
                    min = nums[i];
                }
            }

            return max - min;
        }     
    
    
        public static String findLongestCWord(ArrayList<String> words) {
            if (words.isEmpty()) {
                return "";
            }
            String longest = "";
            for (String word : words) {
                if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == 'c') {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }
            return longest;
        }        
            
        public static int inBetweenNandM(HashSet<String> words, int n, int m) {
                if (words.isEmpty()) {
                    return 0;
                }
                int count = 0;
                for (String word : words) {
                    if (n < word.length() && word.length() < m) {
                        count++;
                }
            }
                return count;
        }
    
    
        public static int evenOddDiff(HashMap<Integer, Integer> map) {
            int evenCount = 0;
            int oddCount = 0;

            for (Integer key : map.keySet()) {
                if (key % 2 == 0) {
                    evenCount++;
                } else if (key % 2 != 0) {
                    oddCount++;
                }
            }
            return evenCount - oddCount;
        }

        public static int findSecondLargest(HashMap<Integer, Integer> map) {
            if (map.isEmpty()) {
                return 0;
            }
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (Integer value : map.values()) {
                if (value > largest) {
                    secondLargest = largest;
                    largest = value;
                } else if (value > secondLargest && value < largest) {
                    secondLargest = value;
                }
            }
            return secondLargest; 
        }                        
    }
    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

