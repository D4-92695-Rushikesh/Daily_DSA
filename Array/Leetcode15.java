/*
PROBLEM STATEMENT :

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105


*/

package Array;
import java.util.*;
public class Leetcode15 {

    /*
       Time Complexity : O(n^3) because of 3 nested loops.
       Space Complexity : O(n) because of HashSet.
    
    public static List<List<Integer>> threeSum(int[] nums){
    //   Set<List<Integer>> res = new HashSet<>();


    //     for(int i=0;i<nums.length;i++){     
    //     for(int j=i+1;j<nums.length;j++){
    //     for(int k=j+1;k<nums.length;k++){
    //         if(nums[i]+nums[j]+nums[k]==0){
    //             List<Integer> temp = new ArrayList<>();
    //             temp.add(nums[i]);
    //             temp.add(nums[j]);
    //             temp.add(nums[k]);
    //             Collections.sort(temp);
    //             res.add(temp);
    //         }
    //     }
    //     }
    //     }

    //     return new ArrayList<>(res);
    // } */

 public static List<List<Integer>> threeSum(int[] nums){

/*
 Time Complexity : O(n^2) because of 2 nested loops.
 Space Complexity : O(1) because we are not using any extra space.

*/
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        
        int left = i+1;
        int right = nums.length-1;

        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0)
            {
                res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;

                while(left<right && nums[left]==nums[left-1]) left++;
                while(left<right && nums[right]==nums[right+1]) right--;

            }
            else if(sum < 0) left++;
            else right--;
        }
    }
    return res;
 }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elements of array ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
     }
}