package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetCode3{
   /*public static int LengthOfLongestSubstring(String s) {
    int max=0;
    for(int i=0;i<s.length();i++){
       Set<Character> set = new HashSet<>();
       for(int j=i;j<s.length();j++){
        if(set.contains((s.charAt(j))))
            break;
    
        set.add(s.charAt(j));
        max = Math.max(j-i+1,max);
       }
    }
    return max;
   }
   
   Time  : O(n²)  -- Two nested loops, where n is the length of the input string s.
   Space : O(n)  -- The HashSet can potentially store all characters of the input
   */
  /*public static int LengthOfLongestSubstring(String s){
    HashSet<Character> set = new HashSet<>();
    int left = 0;
    int max = 0;

    for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
             set.remove(s.charAt(left));
             left++;
        }
        
        set.add(s.charAt(right));
       max = Math.max(max,right-left+1);
    }

    return max;
  }
   Time : O(n) -- The right pointer traverses the string once, and the left pointer also traverses the string at most once, resulting in a linear time complexity.
    Space : O(n) -- In the worst case, the HashSet can store all characters of the input string, leading to a linear space complexity.
    
  */
 public static int LengthOfLongestSubstring(String s){
    HashMap<Character,Integer> map = new HashMap<>();
    int left = 0;
    int max = 0;
    for(int right = 0; right < s.length(); right++){
        char c = s.charAt(right);
        if(map.containsKey(c)){
            left = Math.max(left,map.get(c)+1);
        }
        map.put(c,right);
        max= Math.max(max,right-left+1);
    }
    return max;
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s=sc.next();
        System.out.println(LengthOfLongestSubstring(s));
        sc.close();
    }
}