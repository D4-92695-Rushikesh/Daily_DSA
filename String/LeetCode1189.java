/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.



Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0


Constraints:

1 <= text.length <= 104
text consists of lower case English letters only.
 */
package String;

import java.util.Scanner;

public class LeetCode1189 {

    public static int maxNumberOfBalloons(String str){
        int[] count=new int[26];
        for(char c:str.toCharArray()){
            count[c-'a']++;
        }

        int result = Integer.MAX_VALUE;
        result=Math.min(result,count['b'-'a']);
        result=Math.min(result,count['a'-'a']);
        result=Math.min(result,count['l'-'a']/2);
        result=Math.min(result,count['o'-'a']/2);
        result=Math.min(result,count['n'-'a']);


        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();

        System.out.println("maximum Number Of Balloons "+maxNumberOfBalloons(str));
    }
}
