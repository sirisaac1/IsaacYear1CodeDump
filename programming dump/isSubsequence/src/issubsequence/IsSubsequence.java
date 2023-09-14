package issubsequence;
import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
    int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(m<1)
        return true;
        //if s is shorter than 1, it IS subsequence of t
    while(i<n){ //traverses array t
        if(tt[i]==ss[j]){ //if char in t array is the same as char in s array, starts at 0
            j++; //j up by one if true
        }
        i++;//next char in t array
        
    if(j==m) //if array has been traversed and length as been reached
        return true;
    }//end of while

        return false;//if it never returns true then it returns false
    }

    public static void main(String args[]) {
    Solution sol = new Solution();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first string to check if its a subsequence of next string");
    String s = in.nextLine();
    System.out.println("Enter next string");
    String t = in.nextLine();
    System.out.println(sol.isSubsequence(s, t));
    }
}