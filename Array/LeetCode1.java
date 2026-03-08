/*
   PROBLEM STATEMENT:

   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
package Array;

import java.util.*;
public class LeetCode1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array");  
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value of target element");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(TwoSum(nums, target)));
        
    }

  /*  public static int[] TwoSum(int[] nums, int k){
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int [] ans = new int[2];
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
             ans[0]=left;
             ans[1]=right;
             break;
            }
            else if(sum>k){
                right--;
            }else {
                left++;
            }
        }
        return ans;
    }*/

        /*
        | Approach              | Time Complexity |
   | --------------------- | --------------- |
   | Brute Force           | O(n²)           |
   | Sorting + Two Pointer | O(n log n)      |
   | HashMap               | O(n) ✅      |

        
        
        */

       
    public static int[] TwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int rem = target - nums[i];

            if (map.containsKey(rem)) {
                ans[0] = map.get(rem);
                ans[1] = i;
                return ans;
            }

            map.put(nums[i], i);
        }

        return ans;
    }

}