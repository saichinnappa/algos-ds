package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
    }

    private static boolean isValid(String s) {
        Map<Character, Integer> paranthesisMap = new HashMap<>();
        paranthesisMap.put('(', 0);
        paranthesisMap.put(')', 1);
        paranthesisMap.put('[', 2);
        paranthesisMap.put(']', 3);
        paranthesisMap.put('{', 4);
        paranthesisMap.put('}', 5);

        if (s.length() == 1) return false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (i == 0 && paranthesisMap.get(s.charAt(i)) / 2 != 0) {
                return false;
            }
            if (i + 1 <= s.length() && i % 2 == 0) {
                int val = paranthesisMap.get(s.charAt(i));
                int nextVal = paranthesisMap.get(s.charAt(i + 1));
                if (nextVal - val != 1) return false;
                else i++;
            }
        }
        return true;
    }
}
