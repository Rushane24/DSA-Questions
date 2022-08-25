package POTD;
/*
 * Given two unsorted arrays arr1[] and arr2[]. 
 * They may contain duplicates. For each element in arr1[] count
 *  elements less than or equal to it in array arr2[].
 *  Example 1:
 *  Input:
	m = 6, n = 6
	arr1[] = {1,2,3,4,7,9}
	arr2[] = {0,1,2,1,1,4}
	Output: 4 5 5 6 6 6
	Explanation: Number of elements less than
	or equal to 1, 2, 3, 4, 7, and 9 in the
	second array are respectively 4,5,5,6,6,6
	
	https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1
 */
import java.util.*;
public class Count {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int m = 6;
		int n = 6;
		int arr1[]={1,2,3,4,7,9};
		int arr2[]={0,1,2,1,1,4};
		
//		//Input of Array 1
//		for(int i=0;i<m;i++)
//			arr1[i]=sc.nextInt();
//		//Input of Array 2
//		for(int i=0;i<m;i++)
//			arr1[i]=sc.nextInt();
		
		ArrayList<Integer> res = countEleLessThanOrEqual(arr1,arr2,m,n);
		for(int i=0; i<res.size();i++)
			System.out.print(res.get(i)+" ");
		
	}
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
      Arrays.sort(arr2);
      ArrayList<Integer> res=new ArrayList<>();
      for(int i=0;i<m;i++){
          int count=0;
          for(int j=0;j<n;j++){
              if(arr2[j]<=arr1[i]){
                  count++;
              }
              else{
                  break;
              }
          }
          res.add(count);
      }
      return res;
    }
	
}
