package dowarray;

public class Dowarray {


    public static void main(String[] args) {
        // Declares 8 spaces in memory each variable, for each day of week
        int high[];
        high = new int[8];
        int low[];
        low = new int[8];
        int total[];
        total = new int[8];
        int count[];
        count = new int[8];
        // Initialize dow and temp
        int temp=0;
        int dow=0;
        // For loop to initialize variables
        for (dow = 1; dow < 8; dow++)
        {
            high[dow]=-9999;
            low[dow]=9999;
            total[dow]=0;
            count[dow]=0;
        }
        
        // Output start of program
        System.out.println("Dow Temperature Started. Please wait...");
        
        // Creates in and out objects, calls constructors, and designates input and output files
        InputFile in = new InputFile("tempin.txt");
        OutputFile out = new OutputFile("dowOut.txt");
        
        // While loop to read until the end of the file.
        while (!in.eof())
        {
            // Input from file, reads first int as dow and second as temp
            dow = in.readInt();
            temp = in.readInt();
            total[dow]=total[dow]+temp; // Accumulator for average
            count[dow]++; // Counts how many times a day of week was in file
            
            // Checks if current temperature is new high
            if (temp>high[dow])
            {
                high[dow]=temp;
            }
            
            // Checks if current temperature is new low
            if (temp<low[dow])
            {
                low[dow]=temp;
            }   
        }
        // For loop, repeats following work for each dow
        for (dow = 1; dow < 8; dow++) 
        {
            if (count[dow]==0)
            {
                high[dow]=0;
                low[dow]=0;
                /* If no temperatures for this day were logged in input file
                the high and low are zero and will be output as such*/
            }
            else
            {
                total[dow]=total[dow]/count[dow];
                // Calculates average temperature for day of week
            }
            // writeInt writes values of each variable to output file
            out.writeInt(dow);
            out.writeInt(high[dow]);
            out.writeInt(low[dow]);
            out.writeInt(total[dow]);
            out.writeEOL();
            // Writes end of line so next row of values can be written
        }
        // Closes file after writing values out
        out.close();
        // Output end of program
        System.out.println("DOW Temperature Completed Successfully.");
    }
    
}
