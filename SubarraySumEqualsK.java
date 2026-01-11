import java.util.*;

public class SubarraySumEqualsK {

    /*
     * PROBLEM:
     * Given an array of integers nums and an integer k, return the total number
     * of subarrays whose sum equals to k.
     * A subarray is a contiguous non-empty sequence of elements within an array.
     *
     * EXAMPLES:
     * Input: nums = [1,1,1], k = 2 -> Output: 2
     * Input: nums = [1,2,3], k = 3 -> Output: 2
     */

    public int subarraySum(int[] nums, int k) {
        // TODO: Implement Prefix Sum + HashMap solution
        return 0; // Placeholder return
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solver = new SubarraySumEqualsK();

        // Test Case 1
        int result1 = solver.subarraySum(new int[] { 1, 1, 1 }, 2);
        System.out.println("Test 1 ([1,1,1], 2): " + result1 + (result1 == 2 ? " [PASS]" : " [FAIL expected 2]"));

        // Test Case 2
        int result2 = solver.subarraySum(new int[] { 1, 2, 3 }, 3);
        System.out.println("Test 2 ([1,2,3], 3): " + result2 + (result2 == 2 ? " [PASS]" : " [FAIL expected 2]"));
    }
}
