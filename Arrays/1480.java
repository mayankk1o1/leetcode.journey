class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] nums2 = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            nums2[i] = sum;
        }
        return nums2;
    }
}

/*
 * LeetCode 1480 - Running Sum of 1d Array
 * Technique: Prefix Sum
 * Approach: Keep a running sum while traversing the array and store
 * the sum at each index in a new array.
 * Time: O(n) | Space: O(n)
 */