package BinarySearch;
//Q69) Sqrt(x)
//https://leetcode.com/problems/sqrtx/
//Binary Search Question (Easy)
public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(25));

	}
    public static int mySqrt(int x) {
    	if(x<=1)return x;
        int start = 0;
        int end = x/2;
        while(start<end) {
        	int mid=start+(end-start)/2+1; //+1 so that it does not go into Infinite Loop.
            int div = x/mid;
            if(div == mid) 
            	return mid;
            if(div > mid) 
            	start = mid;
            else
            	end = mid-1;
        }
        return start;
    }
}
