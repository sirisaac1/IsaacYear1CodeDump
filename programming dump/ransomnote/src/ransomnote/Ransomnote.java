
import java.util.*;

public class Ransomnote {

    //create method to determine if ransomNote can be made with cut out letters from magazine
    //letters can only be used once
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;//note cant be longer than magazine. length method
        }
        int[] alphabet_counter = new int[200];//initialize array to store all the characters
        for (char c : magazine.toCharArray()) {
            //toCharArray turns string into array of characters
            //for each loop iterates over magazine string, storing each character in char c
            alphabet_counter[c - ' ']++;
            //subtracting variable with ' ' in ASCII creates index for char
            // increment by one for each char found in String magazine
        }
        for (char c : ransomNote.toCharArray()) {
            if (alphabet_counter[c - ' '] == 0) {
                return false;
            }
            //checks if there are no letters remaining from magazine to write ransomNote
            alphabet_counter[c - ' ']--;
            //decrements by one for each character used
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Can your note be made from letters in a magazine?");
        System.out.println("Input a ransom note:");
        Scanner in = new Scanner(System.in);//Scanner for inputting ransom note
        String myNote = in.nextLine();
        System.out.println("Input a magazine:");
        String mag = in.nextLine();
        if (canConstruct(myNote, mag) == true) {
            System.out.println("Yes!");
        } else {
            System.out.println("No idiot");
        }
        //REMEMBER that ASCII values are weird. try not to get an out of bounds thing
    }
}
