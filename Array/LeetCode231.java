/*
   Problem Statement:
     Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1


*/


package Array;

import java.util.Scanner;

public class LeetCode231{
/* 
    public static boolean isPowerOfTwo(int n) {
       if(n<=0)
        return false;
     
         int ans=0;

       while(Math.pow(2, ans)<=n){
        if(Math.pow(2, ans)==n)
            return true;
        ans++;
       }
       return false;
    }
       Time Complexity: O(log n) -- The while loop runs until 2^ans exceeds n, which takes logarithmic time in relation to n.
       Space Complexity: O(1) -- We are using a constant amount of space to store the variable ans and perform calculations.

    */

       public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        
          while (n%2==0) {
            n=n/2;
          }
          return n==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element ");
        int n = sc.nextInt();
        
        System.out.println(isPowerOfTwo(n));
        sc.close();
    }
}