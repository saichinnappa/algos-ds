package com.practice.leetcode.easy.misc;

import java.util.*;

public class Miscelleneous {


    public static void main(String[] args) {
        int[][] matrix = {{7, 8}, {1, 2}};

//        int[][] matrix = {
//                {
//                        1, 10, 4, 2
//                }, {
//                9, 3, 8, 7
//        }, {
//                15, 16, 17, 12
//        }
//        };
//        int[][] matrix = {{56216}, {63251}, {75772}, {1945}, {27014}};
//        System.out.println(Arrays.toString(luckyNumbers(matrix).toArray()));

        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
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
}
