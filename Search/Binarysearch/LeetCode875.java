import java.sql.Time;
import java.util.Scanner;

public class LeetCode875{

    /*  
   public static int minEatingSpeed(int[] piles, int h) {
        
    int maxPile=0;
    for(int pile : piles){
        maxPile = Math.max(maxPile, pile);
    }
    int ans = maxPile;
    for(int i=1;i<maxPile;i++){
      int hoursNeeded = 0;
        for(int pile : piles){
            hoursNeeded += Math.ceil(pile/(double) i); // Equivalent to Math.ceil(pile / (double) i)
        }
        if(hoursNeeded <= h){
          //  ans = Math.min(ans, i);
            return ans; 
        }
    }
    return ans;
}
  
Time Complexity: O(n * log(maxPile)) where n is the number of piles and maxPile is the maximum number of bananas in any pile. This is because we are iterating through possible eating speeds from 1 to maxPile, and for each speed, we calculate the hours needed by iterating through all piles.  
Space Complexity: O(1) as we are using only a constant amount of extra space.
*/

public static int minEatingSpeed(int[] piles,int h){
     int left =1;
     int right = 0;
     for(int pile : piles){
        right = Math.max(right, pile);
     }

     while (left < right) {
        int mid = left + (right - left) / 2;
        int hoursNeeded = 0;

        for (int pile : piles) {
            hoursNeeded += Math.ceil(pile / (double) mid);
        }

        if (hoursNeeded <= h) {
            right = mid; // Try to find a smaller eating speed
        } else {
            left = mid + 1; // Need a larger eating speed
        }
     }

    return left;
}


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int n = sc.nextInt();

       int[] piles = new int[n];

       System.out.println("Enter Array ");
       for(int i=0;i<n;i++){
        piles[i] = sc.nextInt();    
       }

        System.out.println("Enter Hours");

        int h = sc.nextInt();

        System.out.println(minEatingSpeed(piles,h));
       
        sc.close();
    }
}