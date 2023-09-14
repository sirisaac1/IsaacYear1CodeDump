//Isaac Frederick

package calculateatipisaacfrederick;

import java.util.*;
import javax.swing.*;

/*Write a program that inputs the total amount of a
restaurant bill such as 37.50 and a gratuity rate
(as a whole number such as 18 to represent 18% gratuity)
Compute and output the amount of the gratuity and the total
*/

public class CalculateATipIsaacFrederick
{
    public static void main(String[] args)
    {
        //Variable dclaration
        double bill;
        int gratuityRate;
        double finalBill;
        double gratuity;
        //Instantiate Scanner for input
        Scanner in;
        in = new Scanner(System.in);
        //Prompt user to enter bill and gratuity rate
        System.out.println("Please enter your bill and press ENTER.");
        bill = in.nextDouble();
        System.out.println("Please enter your gratuity rate as a whole number and press ENTER.");
        gratuityRate = in.nextInt();
        //Calculation work
        gratuity = (bill * gratuityRate) / 100.0;
        finalBill = bill + gratuity;
        //Special formatting to get two decimal points of precision
        System.out.printf("Total Bill: $%.2f%n",finalBill);
        System.out.printf("Gratuity: $%.2f%n",gratuity);
        JOptionPane.showMessageDialog(null, "hello nerd");
        in.close();//No resource leaks
    }
}
