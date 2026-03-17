package Binarysearch;

import java.util.Scanner;

public class LeetCode153 {
    public  static  int findMin(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int mid = (left+right)/2;
            if(arr[mid]<arr[right]){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("min element from array is :"+findMin(arr));
    }
}

