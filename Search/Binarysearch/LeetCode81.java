/*
* There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.



Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false


Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104

*
* Time Complexity :O(log n)
* Space Complexity : O(1)
*
*
* */
package Binarysearch;

import java.util.Scanner;

public class LeetCode81 {
    public static boolean search(int[] arr,int target){

        int left =0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return true;

            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            } else if(arr[left]<=arr[mid]) {
                if (arr[left] < target && target < arr[mid]) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
            else {
                    if(arr[mid] < target && target <= arr[right]){
                        left = mid + 1;
                    }else{
                        right = mid - 1;
                    }
                }

        }


        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }

        System.out.println("Enter the target value");
        int target = sc.nextInt();

        System.out.println(search(arr,target));
    }
}
