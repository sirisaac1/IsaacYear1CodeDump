import java.util.Scanner;
class GCD {
public static void main(String[] args) {
    //init
    int firstNumber = 0;
    int secondNumber = 0;
    int remainder = 0;
    int highest = 0;
    //output
    System.out.println("Enter the First Number");
    //input using scanner
    Scanner input = new Scanner(System.in);
    firstNumber = input.nextInt();
    //calcGCD method definition
    class calcGCD {
        public int calcGCD (int firstNumber, int secondNumber) {
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
    //whileloops
    while (firstNumber!=0) {
        System.out.println("Enter the Second Number.");
        secondNumber = input.nextInt();
        System.out.println("The GCD is:");
        System.out.println(calcGCD (firstNumber, secondNumber));
        firstNumber = 0;
        secondNumber = 0;
        remainder = 0;
        highest = 0;
        System.out.println("Enter the First Number.");
        firstNumber = input.nextInt();
    }
    System.exit(0);
}
}
