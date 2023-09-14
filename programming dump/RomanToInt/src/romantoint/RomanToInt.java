import java.util.*;
import java.io.*;
import java.lang.Math;

class Roman
{ 
  int value(char r) // returns char r input as int value, aka conversion
  { 
    if (r == 'I') 
      return 1; 
    if (r == 'V') 
      return 5; 
    if (r == 'X') 
      return 10; 
    if (r == 'L') 
      return 50; 
    if (r == 'C') 
      return 100; 
    if (r == 'D') 
      return 500; 
    if (r == 'M') 
      return 1000; 
    return -1; //if invalid numeral is input returns -1
  } 

  int romanToInt(String s) //method that adds numerals
  { 
    int total = 0; //intializes total 
    for (int i=0; i<s.length(); i++) //for loop depending on length of s
    { 
      int s1 = value(s.charAt(i)); //charAt method to grab parts of string
      if (i+1 <s.length()) 
      { 
        int s2 = value(s.charAt(i+1)); //s2 grabs value of char after s1
        if (s1 >= s2) //checks for exceptions like IV or CM, subtracts value of I or C if s2 is bigger than s1
        { 
          total = total + s1; 
        } 
        else
        { 
          total = total - s1; 
        } 
      } 
      else //accumulates value of final numeral in string
      { 
        total = total + s1; 
      } 
    } 
    return total; 
  } 

  // Main that calls method
  public static void main(String args[]) 
  { 
    Roman ob = new Roman(); // Constructs ob in class Roman
    Scanner in = new Scanner(System.in); // Input
    String val = in.nextLine();
    System.out.println(ob.romanToInt(val)); //calls method
  } 
} 