package Basic_Maths;

public class basicMaths {

	public static void main(String[] args) {
		
		//Q1) Count Digits 
		//https://practice.geeksforgeeks.org/problems/count-digits5716/1
		CountDigits(12345);
		
		//Q2)Reverse a Number
		//https://leetcode.com/problems/reverse-integer/
		System.out.println(reverseint(123));
		
		//Q3)Check Palindrome
		//https://leetcode.com/problems/palindrome-number/
		boolean check = isPalindrome(121);
		System.out.println(check);
		
		//Q4)GCD or HCF
		//https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
		//System.out.println(lcmAndGcd(5,10));
		
		//Q5)Armstrong Number
		//https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
		System.out.println(armstrong(153));
		
		//Q6) Prime Number
		System.out.println(isPrime(23));

	}
	public static boolean armstrong(int n) {
		int dummy=n;
		int sum=0;
		while(n>0) {
        int temp = n % 10;
        sum = sum + temp*temp*temp;
        n /= 10;
	}
		return sum==dummy;
}
	public static int reverseint(int x) {
	    int result = 0;
	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result){ 
	        //If overflow exists, the new result will not equal previous one.
	        	return 0; 
	        }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
		
	}
	public static void CountDigits(int n) {
		int digits=(int)Math.floor(Math.log10(n+1));
		System.out.println(digits);
	}
	
    public static boolean isPalindrome(int x) {
        int sum = 0,target = x;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            sum = sum * 10 + temp;
        }
        return sum == target;
    }

    static Long[] lcmAndGcd(int i , int j) {
        // code here
        long a1=gcd(i,j);
        long a2=lcm(i,j);
        return new Long[]{a2,a1};
    }
        static long gcd(long a, long b){
        if(b==0)return a;
         return gcd(b,a%b);
    }
        static long lcm(long a, long b){
          return (a/gcd(a, b)) * b;
        
    }
    public static boolean isPrime(int n) {
    	if(n==1) return false;
    	if(n==2||n==3) return true;
    	
    	if(n%2==0 || n%3==0) return false;
    	
    	for(int i=5;i*i<=n;i=i+6) {
    		if(n%i==0||n%(i+2)==0)
    			return false;
    	}
    	return true;
    }
	

}
