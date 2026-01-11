/*
    PROBLEM:
    Given a string s, return the length of the longest substring 
    without repeating characters.

    EXAMPLES:
    Input: "abcabcbb" → Output: 3 ("abc")
    Input: "bbbbb"    → Output: 1 ("b")
    Input: "pwwkew"   → Output: 3 ("wke")
*/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeat {

    public static int lengthOfLongestSubstring(String s) {
        // TODO: implement sliding window solution
        Set<Character> window = new HashSet<>();
        int left = 0;
		int max = 0;
		for (int right =0; right < s.length(); right++ ) {
			char c = s.charAt(right);
			while (window.contains(c)){
				window.remove(s.charAt(left)); 
				left++;
			}
			window.add(c);
			max = Math.max(max, right - left +1);
		}
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // expect 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // expect 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // expect 3
        System.out.println(lengthOfLongestSubstring(""));         // expect 0
    }
}