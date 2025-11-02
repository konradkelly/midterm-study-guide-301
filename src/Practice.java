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
    
    
        public static String findLongestCWord(String[] words) {
            if (words.length == 0) {
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
            
        public static int inBetweenNandM(String[] words, int n, int m) {
                if (words.length == 0) {
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
    
    
        public static int evenOddDiff(int[] arr) {
            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evenCount++;
                } else if (arr[i] % 2 != 0) {
                    oddCount++;
                    }
                }
                return evenCount - oddCount;
            }
        }
        public static int findSecondLargest(int arr[]) {
                if (arr.length == 0) {
                    return 0;
                }
                int largest = Integer.MIN_VALUE;
                int secondLargest = Integer.MIN_VALUE;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > largest) {
                        secondLargest = largest;
                        largest = arr[i];
                    } else if (arr[i] > secondLargest && arr[i] < largest) {
                        secondLargest = arr[i];
                    }
                }
                return secondLargest; 
            }                          
    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

