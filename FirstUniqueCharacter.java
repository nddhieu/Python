import java.util.*;

public class FirstUniqueCharacter {

    /*
     * PROBLEM:
     * Given a string s, find the first non-repeating character in it
     * and return its index. If it does not exist, return -1.
     *
     * EXAMPLES:
     * Input: "leetcode" -> Output: 0
     * Input: "loveleetcode" -> Output: 2
     * Input: "aabb" -> Output: -1
     */

    public int firstUniqChar(String s) {
        // TODO: Implement HashMap Counting solution
        return -1; // Placeholder return
    }

    public static void main(String[] args) {
        FirstUniqueCharacter solver = new FirstUniqueCharacter();

        // Test Case 1
        int result1 = solver.firstUniqChar("leetcode");
        System.out.println("Test 1 (leetcode): " + result1 + (result1 == 0 ? " [PASS]" : " [FAIL expected 0]"));

        // Test Case 2
        int result2 = solver.firstUniqChar("loveleetcode");
        System.out.println("Test 2 (loveleetcode): " + result2 + (result2 == 2 ? " [PASS]" : " [FAIL expected 2]"));

        // Test Case 3
        int result3 = solver.firstUniqChar("aabb");
        System.out.println("Test 3 (aabb): " + result3 + (result3 == -1 ? " [PASS]" : " [FAIL expected -1]"));
    }
}
