package Binarysearch;
import java.util.Scanner;
public class LastOccurence {

     public static int LastOccurence(int[] arr,int target){
        int left =0;
        int right = arr.length-1;
        int ans = -1;

       while(left<=right){
        int mid = left + (right - left) /2 ;
        if(arr[mid]==target){
            ans = mid;
            left = mid+1; // Move right to check for later occurrence
        }
        else if(arr[mid]<target){
            left = mid + 1;

       }    else{
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
        int ans = LastOccurence(arr,target);
         if(ans != -1){
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found in the array.");      
        }

        sc.close();
    }
    
}
