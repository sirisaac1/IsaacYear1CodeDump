package dow;

public class Dow {

    public static void main(String[] args) {
        //Init all 28 variables for each day of week+day and temp
        int monHigh=-9999;
        int monLow=9999;
        int monTotal=0;
        int monCount=0;
        int tueHigh=-9999;
        int tueLow=9999;
        int tueTotal=0;
        int tueCount=0;
        int wedHigh=-9999;
        int wedLow=9999;
        int wedTotal=0;
        int wedCount=0;
        int thuHigh=-9999;
        int thuLow=9999;
        int thuTotal=0;
        int thuCount=0;
        int friHigh=-9999;
        int friLow=9999;
        int friTotal=0;
        int friCount=0;
        int satHigh=-9999;
        int satLow=9999;
        int satTotal=0;
        int satCount=0;
        int sunHigh=-9999;
        int sunLow=9999;
        int sunTotal=0;
        int sunCount=0;
        int day = 0;
        int temp = 0;
        //Output start of program
        System.out.println("DOW Temperature Started. Please wait...");
        //Creates in and out objects, and designates input and output files
        InputFile in = new InputFile("tempin.txt");
        OutputFile out = new OutputFile("dowOut.txt");
        //Checks for end of file before reading any values
        while (!in.eof())
        {
            day = in.readInt();//reads 1st value in file as the day of week
            temp = in.readInt();//reads 2nd value in file as the temperature
            
            if (day == 1)//checks if the dow is monday. if true work follows 
            {
                monCount=monCount+1;//counts number of times monday occurs
                monTotal=monTotal+temp;//accumulates temp values for average later
                
                if (temp>monHigh)//checks for new monday High
                {
                    monHigh=temp;
                }
                
                if (temp<monLow)//checks for new monday Low
                {
                    monLow=temp;
                }
            }
            if (day == 2)//checks if the dow is tuesday, does similar work if true
            {
                tueCount=tueCount+1;
                tueTotal=tueTotal+temp;
                
                if (temp>tueHigh)
                {
                    tueHigh=temp;
                }
                if (temp<tueLow)
                {
                    tueLow=temp;
                }
            }
            if (day == 3)//checks if dow is wednesday
            {
                wedCount=wedCount+1;
                wedTotal=wedTotal+temp;
                
                if (temp>wedHigh)
                {
                    wedHigh=temp;
                }
                if (temp<wedLow)
                {
                    wedLow=temp;
                }
            }
            if (day == 4)//checks if dow is thursday
            {
                thuCount=thuCount+1;
                thuTotal=thuTotal+temp;
                
                if (temp>thuHigh)
                {
                    thuHigh=temp;
                }
                if (temp<thuLow)
                {
                    thuLow=temp;
                }
            }
            if (day == 5)//checks if dow is friday
            {
                friCount=friCount+1;
                friTotal=friTotal+temp;
                
                if (temp>friHigh)
                {
                    friHigh=temp;
                }
                if (temp<friLow)
                {
                    friLow=temp;
                }
            }
            if (day == 6)//checks if dow is saturday
            {
                satCount=satCount+1;
                satTotal=satTotal+temp;
                
                if (temp>satHigh)
                {
                    satHigh=temp;
                }
                if (temp<satLow)
                {
                    satLow=temp;
                }
            }
            if (day == 7)//checks if dow is sunday
            {
                sunCount=sunCount+1;
                sunTotal=sunTotal+temp;
                
                if (temp>sunHigh)
                {
                    sunHigh=temp;
                }
                if (temp<sunLow)
                {
                    sunLow=temp;
                }
            }
        }
        if (monCount==0)// if no monday value was logged in input file,
        //high and low are 0 and will be written as 0    
        {
            day=1;
            monHigh=0;
            monLow=0;
        }
        else// calculates average from total temperatures divided by # of times dow occured in input file
        {
            day=1;
            monTotal=monTotal/monCount;
        }
        //writes out values
        out.writeInt(day);
        out.writeInt(monHigh);
        out.writeInt(monLow);
        out.writeInt(monTotal);
        out.writeEOL();//end of line
        
        if (tueCount==0)//same as last if else, but for tuesday
        {
            day=2;
            tueHigh=0;
            tueLow=0;
        }
        else
        {
            day=2;
            tueTotal=tueTotal/tueCount;
        }
        
        out.writeInt(day);
        out.writeInt(tueHigh);
        out.writeInt(tueLow);
        out.writeInt(tueTotal);
        out.writeEOL();
        
        if (wedCount==0)//same as last if-else, but for wednesday
        {
            day=3;
            wedHigh=0;
            wedLow=0;
        }
        else
        {
            day=3;
            wedTotal=wedTotal/wedCount;
        }
        
        out.writeInt(day);
        out.writeInt(wedHigh);
        out.writeInt(wedLow);
        out.writeInt(wedTotal);
        out.writeEOL();
        
        if (thuCount==0)//same as last if-else, but for thursday
        {
            day=4;
            thuHigh=0;
            thuLow=0;
        }
        else
        {
            day=4;
            thuTotal=thuTotal/thuCount;
        }
        
        out.writeInt(day);
        out.writeInt(thuHigh);
        out.writeInt(thuLow);
        out.writeInt(thuTotal);
        out.writeEOL();
        
        if (friCount==0)//same as last if-else but for friday
        {
            day=5;
            friHigh=0;
            friLow=0;
        }
        else
        {
            day=5;
            friTotal=friTotal/friCount;
        }
        
        out.writeInt(day);
        out.writeInt(friHigh);
        out.writeInt(friLow);
        out.writeInt(friTotal);
        out.writeEOL();
        
        if (satCount==0)//same as last if-else but for saturday
        {
            day=6;
            satHigh=0;
            satLow=0;
        }
        else
        {
            day=6;
            satTotal=satTotal/satCount;
        }
        
        out.writeInt(day);
        out.writeInt(satHigh);
        out.writeInt(satLow);
        out.writeInt(satTotal);
        out.writeEOL();
        
        if (sunCount==0)//same as last if-elfse but for sunday
        {
            day=7;
            sunHigh=0;
            sunLow=0;
        }
        else
        {
            day=7;
            sunTotal=sunTotal/sunCount;
        }
        
        out.writeInt(day);
        out.writeInt(sunHigh);
        out.writeInt(sunLow);
        out.writeInt(sunTotal);
        out.writeEOL();
        
        out.close();//closes file once each set of values has been calculated
        //outputs elling user the output file is complete
        System.out.println("DOW Temperature Completed Successfully.");
    }
    
}
