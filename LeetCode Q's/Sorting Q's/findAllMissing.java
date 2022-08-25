package Cyclic_Sort;
//LeetCode Q)448 : Find All the Missing Numbers
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Asked in Google

/* Given an array nums containing n distinct numbers in the range [0, n]
 * By reading the above statement it should instantly click in our brains to use "Cyclic Sort"
 */

import java.util.*;
public class findAllMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        int i = 0;
	        while (i < nums.length) {
	            int correct = nums[i] - 1;
	            if (nums[i] != nums[correct]) {
	                swap(nums, i , correct);
	            } else {
	                i++;
	            }
	        }

	        // just find missing numbers
	        List<Integer> ans = new ArrayList<>();
	        for (int index = 0; index < nums.length; index++) {
	            if (nums[index] != index+1) {
	                ans.add(index + 1);
	            }
	        }

	        return ans;
	    }

	    static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }

}
