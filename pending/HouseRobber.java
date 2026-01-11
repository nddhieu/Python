package pending;
import java.util.*;

public class HouseRobber {

    /*
     * PROBLEM:
     * You are a professional robber planning to rob houses along a street.
     * Each house has a certain amount of money stashed.
     * The only constraint stopping you from robbing each of them is that adjacent
     * houses have security systems connected and it will automatically contact
     * the police if two adjacent houses were broken into on the same night.
     *
     * Given an integer array nums representing the amount of money of each house,
     * return the maximum amount of money you can rob tonight without alerting the
     * police.
     *
     * EXAMPLES:
     * Input: [1,2,3,1] -> Output: 4 (Rob house 1 and 3: 1 + 3 = 4)
     * Input: [2,7,9,3,1] -> Output: 12 (Rob house 1, 3, and 5: 2 + 9 + 1 = 12)
     */

    public int rob(int[] nums) {
        // TODO: Implement DP solution
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HouseRobber solver = new HouseRobber();

        // Test Case 1
        int[] nums1 = { 1, 2, 3, 1 };
        int res1 = solver.rob(nums1);
        System.out.println("Test 1 [1,2,3,1]: " + res1 + (res1 == 4 ? " [PASS]" : " [FAIL expected 4]"));

        // Test Case 2
        int[] nums2 = { 2, 7, 9, 3, 1 };
        int res2 = solver.rob(nums2);
        System.out.println("Test 2 [2,7,9,3,1]: " + res2 + (res2 == 12 ? " [PASS]" : " [FAIL expected 12]"));
    }
}
