package Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class setMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,2,2,4};
		System.out.println(findErrorNums(nums));

	}
    public static List<Integer> findErrorNums(int[] arr) {
       // int []ans = {-1,-1};
        int i=0;
        while(i<arr.length) {
        	int correct=arr[i]-1;
        	if(arr[i]!=arr[correct])
        		swap(arr,i,correct);
        	else
        		i++;
        }
        List<Integer> ans = new ArrayList<>();
        int res=0;
        for(int index=0;index<arr.length-1;index++) {
        	if(arr[index]==arr[index+1])
        		ans.add(arr[index]);
        		res=index;
//        		ans.add(index+1);
        }
        ans.add(res+1);
        return ans;
    }
    public static void swap(int []arr,int first,int second) {
    	int temp=arr[first];
    	arr[first]=arr[second];
    	arr[second]=temp;
    }

}
