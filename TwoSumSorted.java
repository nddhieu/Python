import java.util.*;

public class TwoSumSorted {

    /*
     * PROBLEM:
     * Given a 1-indexed array of integers numbers that is already sorted in
     * non-decreasing order,
     * find two numbers such that they add up to a specific target number.
     * Return the indices of the two numbers, added by one as an integer array
     * [index1, index2] of length 2.
     *
     * EXAMPLES:
     * Input: numbers = [2,7,11,15], target = 9 -> Output: [1,2]
     * Input: numbers = [2,3,4], target = 6 -> Output: [1,3]
     * Input: numbers = [-1,0], target = -1 -> Output: [1,2]
     */

    public int[] twoSum(int[] numbers, int target) {
        // TODO: Implement Two Pointers solution
        return new int[] { -1, -1 }; // Placeholder return
    }

    public static void main(String[] args) {
        TwoSumSorted solver = new TwoSumSorted();

        // Test Case 1
        int[] result1 = solver.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        boolean pass1 = result1[0] == 1 && result1[1] == 2;
        System.out.println("Test 1 ([2,7,11,15], 9): " + Arrays.toString(result1)
                + (pass1 ? " [PASS]" : " [FAIL expected [1, 2]]"));

        // Test Case 2
        int[] result2 = solver.twoSum(new int[] { 2, 3, 4 }, 6);
        boolean pass2 = result2[0] == 1 && result2[1] == 3;
        System.out.println(
                "Test 2 ([2,3,4], 6): " + Arrays.toString(result2) + (pass2 ? " [PASS]" : " [FAIL expected [1, 3]]"));

        // Test Case 3
        int[] result3 = solver.twoSum(new int[] { -1, 0 }, -1);
        boolean pass3 = result3[0] == 1 && result3[1] == 2;
        System.out.println(
                "Test 3 ([-1,0], -1): " + Arrays.toString(result3) + (pass3 ? " [PASS]" : " [FAIL expected [1, 2]]"));
    }
}
