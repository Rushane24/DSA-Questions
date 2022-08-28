package Cyclic_Sort;
import java.util.*;

//Q)442 : Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//LeetCode : Medium, Cyclic Sort
public class findAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(nums));

	}
    public static List<Integer> findDuplicates(int[] arr) {
    	  int i = 0;
          while (i < arr.length) {
              int correct = arr[i] - 1;
              if (arr[i] != arr[correct]) {
                  swap(arr, i , correct);
              } else {
                  i++;
              }
          }

          List<Integer> ans = new ArrayList<>();
          for (int index = 0; index < arr.length; index++) {
              if (arr[index] != index+1) {
                  ans.add(arr[index]);
              }
          }

          return ans;
    }
    public static void swap(int []arr,int first,int second) {
    	int temp=arr[first];
    	arr[first]=arr[second];
    	arr[second]=temp;
    }

}
