package Sorting;

import java.util.PriorityQueue;
import java.util.Scanner;

/*PROBLEM STATEMENT
215. Kth Largest Element in an Array
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104

*/

public class LeetCode215{
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array");  
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value of k");
        int k = sc.nextInt();
        System.out.println("Kth largest element is: " + findKthLargest(nums, k));
        
    }
}