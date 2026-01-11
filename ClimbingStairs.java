import java.util.*;

public class ClimbingStairs {

    /*
     * PROBLEM:
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can
     * you climb to the top?
     *
     * EXAMPLES:
     * Input: n = 2 -> Output: 2 (1+1, 2)
     * Input: n = 3 -> Output: 3 (1+1+1, 1+2, 2+1)
     */

    public int climbStairs(int n) {
        // TODO: Implement DP solution
        return 0; // Placeholder return
    }

    public static void main(String[] args) {
        ClimbingStairs solver = new ClimbingStairs();

        // Test Case 1
        int result1 = solver.climbStairs(2);
        System.out.println("Test 1 (n=2): " + result1 + (result1 == 2 ? " [PASS]" : " [FAIL expected 2]"));

        // Test Case 2
        int result2 = solver.climbStairs(3);
        System.out.println("Test 2 (n=3): " + result2 + (result2 == 3 ? " [PASS]" : " [FAIL expected 3]"));

        // Test Case 3
        int result3 = solver.climbStairs(5);
        System.out.println("Test 3 (n=5): " + result3 + (result3 == 8 ? " [PASS]" : " [FAIL expected 8]"));
    }
}
