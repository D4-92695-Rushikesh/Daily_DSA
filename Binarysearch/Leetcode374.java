/*
 PROBLEM STATEMENT : 
 We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

 

Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1
 

Constraints:

1 <= n <= 231 - 1
1 <= pick <= n


TIME COMPLEXITY : O(log n)
SPACE COMPLEXITY : O(1)
Because we use Binary Search.

*/

package Binarysearch;
import java.util.Scanner;
public class Leetcode374 {
    static int pick;

    public static int guess(int num){
        if(num>pick) return -1;
        else if(num < pick) return 1;
        else return 0;
    }

public static int guessNumber(int n) {
    int left = 1, right=n;
    while(left<=right){
        int mid = left + (right-left)/2;
        int res = guess(mid);

        if(res==0) return mid;
        else if(res==-1) right = mid-1;
        else left = mid+1;

        
    }

    return -1;
}

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n");
        int n = sc.nextInt();

        System.out.println("Enter value to pick ");
        pick = sc.nextInt();

        int ans = guessNumber(n);
        System.out.println("The guessed number is: " + ans);
        sc.close();
    }
}
