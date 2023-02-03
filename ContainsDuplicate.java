//this problem require O(n)
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++){
            if (ans.contains(nums[i])){
                return true;
            }
            ans.add(nums[i]);
        }
        return false;
    }
}
