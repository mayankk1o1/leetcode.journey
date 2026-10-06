class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
/*
 * LeetCode 1920 - Build Array from Permutation
 * Technique: Array Indexing
 * Approach: For each index i, use nums[i] as an index into nums
 * and store the value nums[nums[i]] in the result array.
 * Time: O(n) | Space: O(n)
 */