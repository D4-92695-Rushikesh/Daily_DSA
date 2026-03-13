package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Leetcode961 {
    // public static int repeatedNTimes(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     for(int num : nums){
    //         if(set.contains(num)){
    //             return num;
    //         }
    //         set.add(num);
    //     }
    //     return -1; 
    // }
    /*
     Time : O(n) -- We traverse the array once, where n is the length of the input array nums.
     Space : O(n) -- In the worst case, the HashSet can store all unique
    
    */
        public static int repeatedNTimes(int[] nums) {
           Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i:nums){
            if(map.get(i)==nums.length / 2){
                return i;
            }
        }
        return -1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");    
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Repeated element: " + repeatedNTimes(nums));
        sc.close();
    }
}
