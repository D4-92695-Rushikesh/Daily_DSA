/*
Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.

Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.



Example 1:

Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.


Constraints:

1 <= n <= 1000
 */

/*
Time Complexity : O(n)
space Complexity : O(1)
 */
package Math;

import java.util.Scanner;

public class LeetCode1716 {

    public static int moneySave(int n){
        int weeks = n/7;
        int days=n%7;
        int total=0;

        for(int i=0;i<weeks;i++){
            total+=28+(7*i);
        }

        int start=weeks+1;
        for(int i=0;i<days;i++){
            total+=start+i;
        }
        return total;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        System.out.println("Total money save in LeetCode Bank is "+moneySave(day));
    }
}
