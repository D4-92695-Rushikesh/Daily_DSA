/*
  Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109


*/

/*

 Time Complexity : O(log n)
 Space Complexity : O(1)
*/

import java.util.Scanner;

public class LeetCode34 {

    public static int[] searchRange(int[] nums, int target){
        int first = findFirst(nums,target);
        int last = findLast(nums,target);

        return new int[]{first,last};
    }

    public static int findFirst(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;

       while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            ans = mid ;
            right = mid - 1;
        }else if(nums[mid] < target){
            left = mid + 1;
         }else{
            right = mid - 1;
        }

       }

        return ans;


    }


    public static int findLast(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;

       while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            ans = mid ;
            left = mid + 1;
        }else if(nums[mid] < target){
            left = mid + 1;
         }else{
            right = mid - 1;
        }

       }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array ");         
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   

        System.out.println("Enter Target Element ");
        int target = sc.nextInt();
        
        int[] ans = searchRange(arr, target);
         if(ans[0] != -1){
            System.out.println("Element found at index: " + ans[0] + " and " + ans[1]);
        } else {
            System.out.println("Element not found in the array.");      
        }       
        sc.close();
    }
}