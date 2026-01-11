package pending;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
     * PROBLEM:
     * Given a string s, return the length of the longest substring
     * without repeating characters.
     *
     * EXAMPLES:
     * Input: "abcabcbb" -> Output: 3 (The answer is "abc", with the length of 3.)
     * Input: "bbbbb" -> Output: 1 (The answer is "b", with the length of 1.)
     * Input: "pwwkew" -> Output: 3 (The answer is "wke", with the length of 3.)
     */

    public int lengthOfLongestSubstring(String s) {
        // TODO: Implement Sliding Window solution
        return 0; // Placeholder return
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();

        // Test Case 1
        int result1 = solver.lengthOfLongestSubstring("abcabcbb");
        System.out.println("Test 1 (abcabcbb): " + result1 + (result1 == 3 ? " [PASS]" : " [FAIL expected 3]"));

        // Test Case 2
        int result2 = solver.lengthOfLongestSubstring("bbbbb");
        System.out.println("Test 2 (bbbbb): " + result2 + (result2 == 1 ? " [PASS]" : " [FAIL expected 1]"));

        // Test Case 3
        int result3 = solver.lengthOfLongestSubstring("pwwkew");
        System.out.println("Test 3 (pwwkew): " + result3 + (result3 == 3 ? " [PASS]" : " [FAIL expected 3]"));
    }
}
