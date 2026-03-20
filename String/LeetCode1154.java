package String;/*
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.



Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41


Constraints:

date.length == 10
date[4] == date[7] == '-', and all other date[i]'s are digits
date represents a calendar date between Jan 1st, 1900 and Dec 31st, 2019.
 */
/*
   Time Complexity : O(1)
   Space Complexity : O(1)
 */

import java.util.Scanner;

public class LeetCode1154 {
    public static int dayOfYear(String date) {
        String[] Dates = date.split("-");
        int year = Integer.parseInt(Dates[0]);
        int month = Integer.parseInt(Dates[1]);
        int day = Integer.parseInt(Dates[2]);
        int totalDays=0;
        int[] daysOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear(year)&&month>2){
            daysOfMonth[1]=29;
            for(int i=0;i<month-1;i++){
                totalDays+=daysOfMonth[i];
            }
            totalDays+=day;
        }else {
            for(int i=0;i<month-1;i++){
                totalDays+=daysOfMonth[i];
            }
            totalDays+=day;
        }

        return totalDays;
    }

    public static boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date");
        String date = sc.nextLine();

        System.out.println("No.of days Are "+dayOfYear(date));
    }
}
