/*
Selection Sort :
• In this algorithm, in first iteration, first position gets selected and element which is at selected position gets
compared with all the elements after that. If selected position element found greater than any other position
element then swapping takes place. At the end of first iteration smallest element gets settled at first position.
• In the second iteration, second position gets selected and element which is at selected position gets
compared with all elements after that. If selected position element found greater than any other position
element then swapping takes place. At the end of second iteration second smallest element gets settled at
second position, and so on in maximum (n-1) no. of iterations all array elements gets arranged in a sorted
manner.
• Time complexity :
• Best Case : Ω(n2)
• Worst Case : O(n2)
• Average Case : θ(n2)

 */
/*
Important Points:


 */

package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for(int sel_pos =0;sel_pos<arr.length;sel_pos++){

            for (int pos=sel_pos+1;pos<arr.length;pos++){
                if(arr[sel_pos]>arr[pos]){
                    int temp = arr[pos];
                    arr[pos]=arr[sel_pos];
                    arr[sel_pos]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of the array before sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Elements of the array after Selection sort");
        selectionSort(arr);
    }
}
