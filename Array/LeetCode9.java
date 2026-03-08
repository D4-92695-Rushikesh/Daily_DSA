/*
* PROBLEM STATEMENT :
* Given an integer x, return true if x is a palindrome, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1

*
* */


package Array;
import java.util.*;

public class LeetCode9 {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int left = 0, right = s.length()-1;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
    /*
    * Time: O(n)
      Space: O(n)
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element ");
        int n = sc.nextInt();
        
        System.out.println(isPalindrome(n));

    }
}