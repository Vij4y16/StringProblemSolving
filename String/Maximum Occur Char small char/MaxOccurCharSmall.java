//Given a string str. The task is to find the maximum occurring character in the string str.
// If more than one character occurs the maximum number of time then print the lexicographically smaller character.
//
//        Example 1:
//        Input:
//        str = testsample
//        Output: e
//        Explanation: e is the character which
//        is having the highest frequency.
//        Example 2:
//        Input:
//        str = output
//        Output: t
//        Explanation:  t and u are the characters
//        with the same frequency, but t is
//        lexicographically smaller.
//        Your Task:
//        The task is to complete the function getMaxOccuringChar() which returns the character which is most occurring.
//
//        Expected Time Complexity: O(N).
//        Expected Auxiliary Space: O(Number of distinct characters).
//        Note: N = |s|
//
//        Constraints:
//        1 ≤ |s| ≤ 100



import java.util.Arrays;

public class MaxOccurCharSmall {
    public static void main(String[] args) {
    String line = "output";
        System.out.println(getMaxOccuringChar(line));
    }
    public static char getMaxOccuringChar(String line) {
        int max = 0;
        char result = ' ';
        char[] tempArray = line.toCharArray();

        Arrays.sort(tempArray);

// Enhanced for loop
        for (char c : tempArray) {
            int count = 0;

            for (char value : tempArray) {
                if (c == value) {
                    count++;
                }
                if (max < count) {
                    result = c;
                    max = count;
                }
            }
        }
        return result;
    }
}
