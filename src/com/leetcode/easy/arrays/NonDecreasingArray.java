package com.leetcode.easy.arrays;

/**
 * TODO
 * LC: 665 Non decreasing array
 * Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * <p>
 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,2,3]
 * Output: true
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * <p>
 * Input: nums = [4,2,1]
 * Output: false
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 */
public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 3};
        System.out.println(checkPossibility(nums));

    }

    /**
     * boolean isInvalid = false;
     * if (nums.length == 1)
     * return true;
     * for (int i = 0; i < nums.length - 1; i++) {
     * if (nums[i] <= nums[i + 1]) {
     * continue;
     * } else {
     * System.out.println(i);
     * if (i + 1 < nums.length - 1)
     * nums[i] = Math.min(nums[i], nums[i + 1]);
     * else
     * nums[i] = Math.max(nums[i], nums[i + 1]);
     * count++;
     * if (i > 0 && nums[i] < nums[i - 1]) {
     * isInvalid = true;
     * break;
     * }
     * }
     * }
     * return (count == 0 && !isInvalid) || (count == 1 && !isInvalid);
     */

    static boolean checkPossibility(int[] nums) {
        int count = 0;
        boolean inOrder = false;
        if (nums[0] > nums[1]) {
            nums[0] = nums[1];
            count++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (count <= 1) {
                if (nums[i] <= nums[i + 1]) {
                    inOrder = true;
                } else if (nums[i + 1] < nums[i - 1]) {
                    nums[i] = nums[i - 1];
                    count++;
                }
            } else {
                break;
            }
        }
        return (count == 1) || (inOrder && count == 0);
    }
}
