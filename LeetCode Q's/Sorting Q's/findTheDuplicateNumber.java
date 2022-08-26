package Cyclic_Sort;
//LeetCode Q)287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/

/*Given an array of integers nums containing n + 1 integers where each integer is 
 * in the range [1, n] inclusive.
  There is only one repeated number in nums, return this repeated number.
 * Note: Please apply Cyclic Sort the question is Screaming Cyclic Sort.
 * Amazon Question, LeetCode Medium
 */
import java.util.*;
public class findTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,4,2,2};
		int result = findDuplicate(nums);
		System.out.println(result);
	}
	public static int findDuplicate(int []arr) {
		int i=0;
		while(i<arr.length) {
	       if (arr[i] != i + 1) {
               int correct = arr[i] - 1;
               if (arr[i] != arr[correct]) 
                   swap(arr, i , correct);
               else 
                   return arr[i];
	       }
            else {
               i++;
            }
      // return -1;
		}
		return -1;	
	}
	public static void swap(int[] arr, int i, int correct) {
		// TODO Auto-generated method stub
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
	}

}
