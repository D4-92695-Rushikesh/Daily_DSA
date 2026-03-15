/*
 Find First Occurrence

Used when duplicate elements exist and we want the first index of target.

Example array:

[1,2,4,4,4,5,7]

Find 4

Indexes:

0 1 2 3 4 5 6
1 2 4 4 4 5 7

Correct answer = 2 (first 4)


Idea

When we find target:

Instead of returning immediately, we move left to check if an earlier one exists.

*/


package Binarysearch;
import java.util.Scanner;
public class FirstOcurrence {
  public static int firstOccurrence(int[] arr,int target){
    int left = 0;
    int right = arr.length-1;

    int ans = -1;

    while(left <= right){

        int mid = left + (right - left)/2;

        if(arr[mid] == target){
            ans = mid;
            right = mid - 1; // Move left to check for earlier occurrence
        }else if(arr[mid] < target){
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
        int result = firstOccurrence(arr, target);
        if (result != -1) {
            System.out.println("First occurrence found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}