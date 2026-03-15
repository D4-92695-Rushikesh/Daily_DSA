/*
  PROBLEM: 522. Longest Uncommon Subsequence II
  Given an array of strings strs, return the length of the longest uncommon subsequence between them. If the longest uncommon subsequence does not exist, return -1.

An uncommon subsequence between an array of strings is a string that is a subsequence of one string but not the others.

A subsequence of a string s is a string that can be obtained after deleting any number of characters from s.

For example, "abc" is a subsequence of "aebdc" because you can delete the underlined characters in "aebdc" to get "abc". Other subsequences of "aebdc" include "aebdc", "aeb", and "" (empty string).
 

Example 1:

Input: strs = ["aba","cdc","eae"]
Output: 3
Example 2:

Input: strs = ["aaa","aaa","aa"]
Output: -1
 

Constraints:

2 <= strs.length <= 50
1 <= strs[i].length <= 10
strs[i] consists of lowercase English letters.

*/

/*

 Time Complexity: O(n^2 * m) -- where n is the number of strings in the input array and m is the maximum length of the strings. The outer loop runs n times, and for each string, we check if it is a subsequence of every other string, which takes O(m) time.
 Space Complexity: O(1) -- We are using a constant amount of space to store variables
*/

package String;
import java.util.Arrays;
import java.util.Scanner;
public class LeetCode522 {
    
  public static int findLUSlength(String[] strs) {
      
      Arrays.sort(strs,(a,b)-> Integer.compare(b.length(), a.length()));

      for(int i=0;i<strs.length;i++){
        boolean unCommon = true;
        for(int j=0;j<strs.length;j++){
            if(i==j) continue;
            if(isSubSequence(strs[i],strs[j])){
               unCommon = false;
               break;
            }
            
        }
        if(unCommon){
            return strs[i].length();
        }
                
      }
   
    return -1;
  }

  public static boolean isSubSequence(String a, String b){
    int i=0,j=0;

    while (i<a.length()&&j<b.length()) {
        if(a.charAt(i)==b.charAt(j)){
            i++;
        }
        j++;
    }
    return i==a.length();
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size String Array ");
        int n = sc.nextInt();
        String [] strs=new String[n];
        System.out.println("Enter String Array ");
        for(int i=0;i<n;i++){
            strs[i]=sc.next();
        }   

        System.out.println("UnCommon Length: "+findLUSlength(strs));
        sc.close();
    }
}
