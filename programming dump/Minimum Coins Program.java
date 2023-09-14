
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        //output
        System.out.println("Please Enter Amount of Change (1-99) or ZERO to EXIT");
        System.out.println("");
        //initialization
        int changeAmount = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        //input, using scanner class, always use following line
        Scanner scan = new Scanner(System.in);
        //for string use String text = scan.nextLine();
        //for int use int num = scan.nextInt();
        changeAmount = scan.nextInt();
        //now do work in a while loop
        while (changeAmount > 0) {
            while (changeAmount >= 25) {
                changeAmount = changeAmount - 25;
                quarters = quarters + 1;
            }
            while (changeAmount >= 10) {
                changeAmount = changeAmount - 10;
                dimes = dimes + 1;
            }
            if (changeAmount >= 5) {
                changeAmount = changeAmount - 5;
                nickels = nickels + 1;
            }
            String A = "Quarters: " + quarters;
            String B = "Dimes: " + dimes;
            String C = "Nickels: " + nickels;
            String D = "Pennies: " + changeAmount;
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
            System.out.println(D);
            changeAmount = 0;
            quarters = 0;
            dimes = 0;
            nickels = 0;
            System.out.println("Please Enter Amount of Change (1-99) or ZERO to EXIT");
            System.out.println("");
            changeAmount = scan.nextInt();
        }
        System.exit(0);
    }
}
