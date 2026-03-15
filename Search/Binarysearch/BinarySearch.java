/*
   Binary Search works only on Sorted Array.
   It repeatedly divides the search interval in half. 
   If the value of search key is less than the item in the 
   middle of the interval, narrow the interval to the lower half.
   Otherwise narrow it to the upper half. 
   Repeatedly check until the value is found or the interval is empty.  
   
   Time Complexity: O(log n) -- where n is the number of elements in the input array.
    Space Complexity: O(1) -- We are using a constant amount of space to store variables


*/

package Binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left =0,right = arr.length-1;
        
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]==target){
                return mid; // Return the index of the target element
            }else if(arr[mid]<target){
                left = mid +1; // Search in the right half .    
            }else{
                right = mid-1; // Search in the left half.
            }
        }
        return -1;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter Array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target Element ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}