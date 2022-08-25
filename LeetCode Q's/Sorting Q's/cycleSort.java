package Cyclic_Sort;
import java.util.*;
public class cycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

	}
	public static void sort(int []arr) {
		int i=0;
		while(i < arr.length) {
			int correct=arr[i]-1; //This will check if the Value at Correct Index is corresponding to the value at arr[i].
			if(arr[i]!=arr[correct])
				swap(arr,i,correct);
			else
				i++;
		}
	}
	public static void swap(int[] arr, int i, int correct) {
		// TODO Auto-generated method stub
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
		
	}

}
