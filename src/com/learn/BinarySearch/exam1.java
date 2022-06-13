package com.learn.BinarySearch;

/**
 * Given an array of integers nums which is sorted in ascending order, 
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 */

class exam1 {
    public static void main(String[] args) {
        int[] nums;
        int target;
        Solution solution;

        nums = new int[] {-1,0,3,5,9,12,15,19};
        target = 15;
        solution = new Solution(nums, target);

        solution.search();
        System.out.println(solution.getValue());
    }
}

class Solution {
    int[] nums;
    int target;
    int index;

    Solution(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }

    void search() {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) {
                index = i;
                break;
            }
            else index = -1;
        }
    }

    int getValue() {
        return index;
    }

}
