package com.leetcode.easy;

/**
 * 1360
 * Given a string s. You should re-order the string using the following algorithm:
 * <p>
 * Pick the smallest character from s and append it to the result.
 * Pick the smallest character from s which is greater than the last appended character to the result and append it.
 * Repeat step 2 until you cannot pick more characters.
 * Pick the largest character from s and append it to the result.
 * Pick the largest character from s which is smaller than the last appended character to the result and append it.
 * Repeat step 5 until you cannot pick more characters.
 * Repeat the steps from 1 to 6 until you pick all characters from s.
 * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.
 * <p>
 * Return the result string after sorting s with this algorithm.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aaaabbbbcccc"
 * Output: "abccbaabccba"
 * Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
 * After steps 4, 5 and 6 of the first iteration, result = "abccba"
 * First iteration is done. Now s = "aabbcc" and we go back to step 1
 * After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
 * After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
 */
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        increasingDecreasingString("aaaabbbbcccc");
    }

    private static void increasingDecreasingString(String s) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
//        char[] charArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result;
        int previousVal = 0;
        int currentVal = -1;
        for (char c : s.toCharArray()) {
            currentVal = alphabets.indexOf(c);
            if (previousVal < currentVal) {

            } else {

            }
        }


    }
}
