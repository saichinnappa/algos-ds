package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        char[] charArray = s.toCharArray();
        int val = 0;
        System.out.println(charArray.length);
        for(int i=0; i<charArray.length; i++){
            System.out.println("i:"+i);
            if(i+1 < charArray.length){
                if(charArray[i] == 'I' && (charArray[i+1] == 'V' || charArray[i+1] == 'X')){
                    val += romanMap.get(charArray[i+1]) - romanMap.get(charArray[i]);
                    i +=1;
                }
                else if(charArray[i] == 'X' && (charArray[i+1] == 'L' || charArray[i+1] == 'C')){
                    val += romanMap.get(charArray[i+1]) - romanMap.get(charArray[i]);
                    i +=1;
                }
                else if(charArray[i] == 'C' && (charArray[i+1] == 'M' || charArray[i+1] == 'D')){
                    val += romanMap.get(charArray[i+1]) - romanMap.get(charArray[i]);
                    i +=1;
                }else if(i+1 == charArray.length-1){
                    val += romanMap.get(charArray[i]) + romanMap.get(charArray[i+1]);
                    i +=1;
                }
                else{
                    val += romanMap.get(charArray[i]);
                }
            }
        }
        return val;
    }
}
