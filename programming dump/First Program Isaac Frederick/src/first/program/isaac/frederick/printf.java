//Isaac Frederick
public class printf
{ 
    
    public static void main(String[] args) 
    {
        System.out.println("    J    A    V     V    A");
        System.out.println("    J   A A    V   V    A A");
        System.out.println("J   J  AAAAA    V V    AAAAA");
        System.out.println(" J J  A     A    V    A     A");
        
        System.out.printf("A string in a field: %10s ending here\n", "abcdefg");
        System.out.printf("A string in a field: %-10s ending here\n", "abcdefg");
        System.out.printf("A whole number in a field: %10d ending here\n", 12345);
        System.out.printf("A whole number in a field: %-10d ending here\n", 12345);
        System.out.printf("A decimal number in a field displaying 3 decimal places: %20.3f ending here\n", 12345.678901);
        System.out.printf("A decimal number in a field displaying 3 decimal places: %-20.5f ending here\n", 12345.678901);
        
        double x;
        x = 3 + 4 * 10 - 1 / 2;
        System.out.println(x);
    }

}
