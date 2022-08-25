package Cyclic_Sort;
// Q:268 Missing Number
//https://leetcode.com/problems/missing-number/
//Amazon Question 
/* Given an array nums containing n distinct numbers in the range [0, n]
 * By reading the above statement it should instantly click in our brains to use "Cyclic Sort"
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));

	}
	public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
