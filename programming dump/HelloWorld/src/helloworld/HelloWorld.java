import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        //Initialization
        int age=0;
        int count=0;
        // Creates input object, instantiates scanner for keyboard input
        Scanner input = new Scanner(System.in);
        // Prompts user to input age
        System.out.println("Hello World");
        System.out.println("Enter your age: ");
        //age is the next number the user types, calls nextInt()
        age=input.nextInt();
        //if-then
        if (age>20) {
            System.out.println("Party Time");
        }  
        //if-then-else
        if (age>17) {
            System.out.println("You can vote");
        }
        else {
            System.out.println("You can't vote");
        }
        //while-loop
        while (age<100) {
            age=age+1;
            count=count+1;
        }
        System.out.println("in "+count+" years you will be 100");
        System.exit(0);//exit program
        
    }
    
}
