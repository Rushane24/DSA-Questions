package POTD;
// 26th August, 2022.
// https://practice.geeksforgeeks.org/problems/count-palindromic-subsequences/1
// Topics - String Manipulation, Dynamic Programming

// Example 1 :-
/* Input: 
   Str = "abcd
 * Output: 
	4
	Explanation:
	palindromic subsequence are : "a" ,"b", "c" ,"d"
 */
 /*Given a string str of length N, you have to find number of palindromic subsequence
  *(need not necessarily be distinct) which could be formed from the string str.
   Note: You have to return the answer module 109+7; 
  */
import java.io.*;

import java.util.*;

public class countPalindromicSubsequences {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    System.out.println(countPS(str));

	}
	
    static long countPS(String str)
    {
        // Your code here
        long[][] dp = new long[str.length()][str.length()];
        for (int g = 0; g < dp.length; g++) {
          for (int i = 0, j = g; j < dp[0].length; i++, j++) {
            if (g == 0) {
              dp[i][j] = 1;
            } else if (g == 1) {
              dp[i][j] = str.charAt(i) == str.charAt(j) ? 3 : 2;
            } else {
              if (str.charAt(i) == str.charAt(j)) {
                dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1;
              } else {
                dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
              }
            }
          }
        }

        return (dp[0][dp[0].length - 1]);
    }

}
