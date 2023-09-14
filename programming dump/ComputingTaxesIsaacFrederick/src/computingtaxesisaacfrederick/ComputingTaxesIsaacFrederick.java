//Isaac Frederick

package computingtaxesisaacfrederick;
import java.util.*;
      
public class ComputingTaxesIsaacFrederick
{

    public static void main(String[] args)
    {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s)
    {
        System.out.println(s);
        char[] arr = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (Character.isLetterOrDigit(arr[i]))
            {
                list.add(Character.toLowerCase(arr[i]));
            }
        }
        ArrayList<Character> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        if (list.equals(reversed))
        {
            return true;
        }
        System.out.println(list);
        System.out.println(reversed);
        return false;
    }
    
}
