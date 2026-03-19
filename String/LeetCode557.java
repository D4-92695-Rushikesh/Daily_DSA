/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"


Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 */
/*
    Time Complexity : O(n)
    Space Complexity : O(n)
 */
package String;

import java.util.Scanner;

public class LeetCode557 {
    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start =0;
        for(int end = 0;end<=arr.length;end++){
            if(end == arr.length || arr[end] == ' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        return new String(arr);
    }
    public  static void reverse(char[] arr,int start,int end){
        while(start<=end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();

        System.out.println("String Before reverse \n"+str);
        System.out.println("String after reverse");
        System.out.println(reverseWords(str));
    }
}
