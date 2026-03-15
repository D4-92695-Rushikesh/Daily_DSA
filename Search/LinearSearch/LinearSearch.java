/*
  Linear Search is a simple search algorithm that checks each element
   in a list sequentially until the desired element is found or the list ends.
    It is not the most efficient search algorithm for large datasets,
     but it is easy to implement and works well for small lists or unsorted data.
    
    Time Complexity: O(n) -- where n is the number of elements in the input array.
    Space Complexity: O(1) -- We are using a constant amount of space to store variables
    

     */

package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found in the array
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
        int result = linearSearch(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
