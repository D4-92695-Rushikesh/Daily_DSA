/*
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.

*/
/*
  Time Complexity: O(log n) due to binary search.
Space Complexity: O(1) as we are using only a constant amount of extra space.
*/

import java.util.Scanner;

public class LeetCode162 {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak is in the right half
                left = mid + 1;
            } else {
                // Peak is in the left half (including mid)
                right = mid;
            }
        }

        return left; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter Size of Array ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter Array ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element found at index: " + peakIndex);

    }
}