//Isaac Frederick

package compoundinterestisaacfrederick;

import javax.swing.*;

public class CompoundInterestIsaacFrederick
{

    public static void main(String[] args)
    {
        //variables
        int i;
        double monthlySavings;
        double interestRate;
        double finalValue;
        finalValue = 0;//assumed starting value of account is 0
        String monthlySavingsIn;
        String annualInterestRate;
        String finalAccountValue;
        
        //Dialog box 1 for monthly savings input
        
        monthlySavingsIn = JOptionPane.showInputDialog("Enter Your Monthly Savings.");
        monthlySavings = Double.parseDouble(monthlySavingsIn);//convert string to double
        
        //Dialog box 2 for annual interest rate input
        
        annualInterestRate= JOptionPane.showInputDialog("Enter Your Annual Interest Rate.");
        interestRate = Double.parseDouble(annualInterestRate)/100;//convert string to double and divide by 100 to represent percentage
        
        interestRate = interestRate / 12;//turn annual interest into monthly interest
        
        //for loop to repeat interest accumulation for 6 months
        
        for(i = 0; i < 6; i++) 
        {
        finalValue = (finalValue + monthlySavings) * (1 + interestRate);
        }
        
        //convert account value into formatted string with 2 decimal points for output dialog box
        
        finalAccountValue = String.format("%.2f%n",finalValue);
        
        //Dialog box 3 to display final value of account
        
        JOptionPane.showMessageDialog(null, "Your Balance After 6 Months Is: $" + finalAccountValue);
    }
    
}
