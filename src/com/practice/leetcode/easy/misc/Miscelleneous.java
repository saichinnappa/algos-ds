package com.practice.leetcode.easy.misc;

import java.util.*;

public class Miscelleneous {

    public static void main(String[] args) {
//        int[][] matrix = {{7, 8}, {1, 2}};
//        int[] nums = {1, 4, 3, 2};
//        System.out.println(arrayPairSum(nums));
        Miscelleneous miscelleneous = new Miscelleneous();
        System.out.println(miscelleneous.hammingDistance(14, 4));
    }

    public static int[] diStringMatch(String S) {
        int n = S.length();
        int[] ans = new int[n + 1];
        int max = n, min = 0, pos = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'D') ans[pos++] = max--;
            else ans[pos++] = min++;
        }

        ans[pos] = min;
        return ans;
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> elmentSet = new HashSet<>();
        int row = 0;
        int col = 0;
        while (true) {
            System.out.println(row + "|" + col + "|");
            int max = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < matrix[row].length; i++) {
                if (matrix[row][i] < min) {
                    min = matrix[row][i];
                }
            }
            for (int j = 0; j < matrix.length; j++) {
//                System.out.println(matrix[j][col]);
                if (matrix[j][col] > max) {
                    max = matrix[j][col];
                }
            }
            if (min == max || elmentSet.contains(min)) {
                result.add(min);
                break;
            } else if (elmentSet.contains(max)) {
                result.add(max);
                break;
            }
            System.out.println("min->" + min);
            System.out.println("max->" + max);
            elmentSet.add(min);
            elmentSet.add(max);
            if (row < matrix.length - 1) {
                row++;
            }
            if (col < matrix[0].length - 1) {
                col++;
            }
        }
        return result;
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public int hammingDistance(int x, int y) {
        int xor = x ^ y; //get the difference, which has bit difference as well
        int distance = 0;
        while (xor != 0) { // keep iterating until the xor value is 0
            if (xor % 2 == 1) //if last bit is 1, then we found a difference
                distance += 1;
            xor = xor >> 1; //keep doing right shift, so all 1's will be pushed to right most.
        }
        return distance;
    }

}
