
import java.util.*;
import java.lang.*;

public class MergeTwoStrings
{

    /**
     *
     * @param word1
     * @param word2
     * @return
     */
    public static String mergeAlternately(String word1, String word2)
    {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length())
        {
            if (i < word1.length())
            {
                result.append(word1.charAt(i));
            }
            if (i < word2.length())
            {
                result.append(word2.charAt(i));
            }
        }
        String resultt = result.toString();
        return resultt;
    }
    public static void main(String[] args)
    {
        String a = "penis";
        String b = "vaginas";
        String c = mergeAlternately(a,b);
        System.out.println(c);
    }
    
}
