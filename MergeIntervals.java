import java.util.*;

public class MergeIntervals {

    /*
     * PROBLEM:
     * Given an array of intervals where intervals[i] = [starti, endi],
     * merge all overlapping intervals, and return an array of the non-overlapping
     * intervals that cover all the intervals in the input.
     *
     * EXAMPLES:
     * Input: [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
     */

    public int[][] merge(int[][] intervals) {
        // TODO: Implement sorting + merging logic
        return new int[0][];
    }

    public static void main(String[] args) {
        MergeIntervals solver = new MergeIntervals();

        int[][] input1 = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] res1 = solver.merge(input1);
        System.out.println("Test 1: " + Arrays.deepToString(res1));
        // Simple manual check for this example's output
    }
}
