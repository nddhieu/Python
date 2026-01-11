package pending;
import java.util.*;

public class ValidParentheses {

    /*
     * PROBLEM:
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and
     * ']',
     * determine if the input string is valid.
     *
     * An input string is valid if:
     * 1. Open brackets must be closed by the same type of brackets.
     * 2. Open brackets must be closed in the correct order.
     * 3. Every close bracket has a corresponding open bracket of the same type.
     *
     * EXAMPLES:
     * Input: "()" -> Output: true
     * Input: "()[]{}" -> Output: true
     * Input: "(]" -> Output: false
     */

    public boolean isValid(String s) {
        // TODO: Implement Stack solution
        return false;
    }

    public static void main(String[] args) {
        ValidParentheses solver = new ValidParentheses();

        System.out.println(
                "Test 1 '()': " + solver.isValid("()") + (solver.isValid("()") == true ? " [PASS]" : " [FAIL]"));
        System.out.println("Test 2 '()[]{}': " + solver.isValid("()[]{}")
                + (solver.isValid("()[]{}") == true ? " [PASS]" : " [FAIL]"));
        System.out.println(
                "Test 3 '(]': " + solver.isValid("(]") + (solver.isValid("(]") == false ? " [PASS]" : " [FAIL]"));
    }
}
