import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
    int firstNumber = 0;
    int secondNumber = 0;
    int remainder = 9999;
    int highest = 0;
    System.out.println("Enter the First Number");
    Scanner input = new Scanner(System.in);
    firstNumber = input.nextInt();
    while (firstNumber!=0) {
        System.out.println("Enter the Second Number.");
        secondNumber = input.nextInt();
        System.out.println("The GCD is:");
        System.out.println(calcGCD (firstNumber, secondNumber));
        firstNumber = 0;
        secondNumber = 0;
        remainder = 9999;
        highest = 0;
        System.out.println("Enter the First Number.");
        firstNumber = input.nextInt();
    }
    System.exit(0);
    }
    public static int calcGCD (int firstNumber, int secondNumber) {
        int highest;
        int remainder = 9999;
        if (firstNumber<secondNumber) {
            highest = secondNumber;
            secondNumber = firstNumber;
            firstNumber = highest;
        }
        while (remainder>0) {
            while (firstNumber>=secondNumber) {
                firstNumber = firstNumber-secondNumber;
            }
            remainder = firstNumber;
            if (remainder>0) {
                firstNumber = secondNumber;
                secondNumber = remainder;
            }
        }
        return secondNumber;
    }
}
