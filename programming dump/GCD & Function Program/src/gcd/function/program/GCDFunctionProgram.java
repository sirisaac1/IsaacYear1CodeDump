import java.util.*; // For Scanner

class GCD {
    public static void main(String[] args) {
    // Initialize variables
    int firstNumber = 0;
    int secondNumber = 0;
    // Output prompts user to enter 1st number
    System.out.println("Enter the First Number, ZERO to exit.");
    // Creates input, instantiates Scanner
    Scanner input = new Scanner(System.in);
    // Enter 1st number with nextInt method
    firstNumber = input.nextInt();
    /* While loop to give user option to exit program with 0
    or calculate multiple values*/
    while (firstNumber!=0) {
        // Prompt user to enter 2nd number
        System.out.println("Enter the Second Number.");
        // Input 2nd number
        secondNumber = input.nextInt();
        System.out.println("The GCD is:");
        // Calls calcGCD method, defined below main
        System.out.println(calcGCD (firstNumber, secondNumber));
        // Re-initializes variables after calculating value
        firstNumber = 0;
        secondNumber = 0;
        // Re-prompts user to enter value
        System.out.println("Enter the First Number, ZERO to exit.");
        // Input 1st number or exit with 0
        firstNumber = input.nextInt();
    }
    System.exit(0);
    }
    // Method that follows Euclidean Algorithm
    public static int calcGCD (int firstNumber, int secondNumber) {
        // Initialize variables
        int highest = 0;
        int remainder = 9999;
        // if 1st < 2nd, makes 2nd = 1st number so algorithm works smoothly
        if (firstNumber<secondNumber) {
            highest = secondNumber;
            secondNumber = firstNumber;
            firstNumber = highest;
        }
        // When remainder is 0, algorithm is finished and returns value
        while (remainder>0) {
            // Divides 1st by 2nd using subtraction loop
            while (firstNumber>=secondNumber) {
                firstNumber = firstNumber-secondNumber;
            }
            // When 1st<2nd, 1st beocmes the remainder as it cannot divide more
            remainder = firstNumber;
            if (remainder>0) {
                /*checks if more work needs to be done, this process re-sorts
                variables to go through division again in above while loop per
                the Euclidean Algorithm*/
                firstNumber = secondNumber;
                secondNumber = remainder;
            }
        }
        return secondNumber;
    }
}

