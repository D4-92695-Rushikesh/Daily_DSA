/*
* Bubble Sort :
• In this algorithm, in every iteration, elements which are at two consecutive positions gets
compared. If they are already in order then no need of swapping them, but if they are not in order
i.e. if previous position element is greater than its next position element then swapping takes
place.
• By this logic in first iteration largest element gets settled at last position, in second iteration second
largest element gets settled at second last position and so on, in max (n-1) no. of iterations all
elements gets arranged in a sorted manner.
Time Complexity :
Best Case – if array elements are already arranged in a sorted manner : Ω(n)
Worst Case : O(n2)
Average Case : θ(n2)
*
* */
package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
        System.out.println("Print elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
        System.out.println("Bubble Sort");
       bubbleSort(arr);
    }
}
