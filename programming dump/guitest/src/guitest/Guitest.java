package guitest;
//importing necessary utilities, abstract window toolkit and swing
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//uses extends so Guitest can inherit fields and methods from JFrame
class Guitest extends JFrame
{
//no magic numbers, defining constants
    private static final int quarterValue = 25;
    private static final int dimeValue = 10;
    private static final int nickelValue = 5;
    //creating Text Fields for input and output
    private JTextField changeAmountTF = new JTextField(3);
    private JTextField quartersTF = new JTextField (3);
    private JTextField dimesTF = new JTextField(3);
    private JTextField nickelsTF = new JTextField(3);
    private JTextField penniesTF = new JTextField(3);
    //start of constructor class for window's characteristics
    public Guitest()
    {
        //creating buttons in GUI
        JButton calculateBtn = new JButton("Calculate");
        JButton clearBtn = new JButton("Clear");
        //calls addActionListner, which defines what happens when user clicks these buttons
        calculateBtn.addActionListener(new CalculateBtnListener());//these constructors define what happens when buttons are clicked
        clearBtn.addActionListener(new ClearBtnListener());
        //this text field has a listner to to handle if a user presses enter after entering a value in this field
        changeAmountTF.addActionListener(new CalculateBtnListener());
        //makes fields uneditable
        quartersTF.setEditable(false);
        dimesTF.setEditable(false);
        nickelsTF.setEditable(false);
        penniesTF.setEditable(false);
        //instantiates JPanel to fill with components of GUI
        JPanel content = new JPanel();
        content.setLayout(new GridLayout(6, 2, 6, 4)); //Panel uses Grid Layout
        content.setPreferredSize(new Dimension(240, 180)); //Defines Window Size
        //add all the components displayed in JPanel in order displayed in Grid
        content.add(new JLabel("Enter Change (1-99):")); //adds Label prefacing text field
        content.add(changeAmountTF);
        content.add(new JLabel("Quarters:"));
        content.add(quartersTF);
        content.add(new JLabel("Dimes:"));
        content.add(dimesTF);
        content.add(new JLabel("Nickels:"));
        content.add(nickelsTF);
        content.add(new JLabel("Pennies:"));
        content.add(penniesTF);
        content.add(calculateBtn);//adds buttons at bottom of GUI
        content.add(clearBtn);
        //packs everything into the layout of the pane
        setContentPane(content);
        pack();
        //name pane
        setTitle("Minimum Coins");
        //when JFrame is closed program exits
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //no component specified, null will center frame on screen
        setLocationRelativeTo(null);
    }
    //implements ActionListener for calculate button
    class CalculateBtnListener implements ActionListener
    {
        //initialize variables
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        //implements actionPerformed method for Calculate Button
        public void actionPerformed(ActionEvent e)
        {
            //this try checks that an integer is input
            try {
                //gets String from text box and converts into integer value so work can be done
                String chgStr = changeAmountTF.getText();
                int changeAmount = Integer.parseInt(chgStr);
                //Finds amount of quarters, then dimes, nickels. any remaining value is output as pennies
                while (changeAmount>=quarterValue) {
                    changeAmount = changeAmount - quarterValue;
                    quarters = quarters + 1;
                }
                while (changeAmount>=dimeValue) {
                    changeAmount = changeAmount - dimeValue;
                    dimes = dimes + 1;
                }
                if (changeAmount>=5) {
                    changeAmount = changeAmount - nickelValue;
                    nickels = nickels + 1;
                }
                //uses text fields as output, concats empty string with int to convert to string
                quartersTF.setText("" + quarters);
                dimesTF.setText("" + dimes);
                nickelsTF.setText("" + nickels);
                penniesTF.setText("" + changeAmount);
                //sets values back to zero so program doesnt get confused if user wants to calculate more than one changeAmount
                quarters = 0;
                dimes = 0;
                nickels = 0;
                changeAmount = 0;
            }
            //this catch displays INVALID when non-integer value is input and highlights text
            catch(NumberFormatException f) {
                changeAmountTF.setText("Invalid");
                changeAmountTF.requestFocus();
                changeAmountTF.selectAll();
                
            }
        }
    }
    //defines Clear button as implementation of ActionListener interface
    class ClearBtnListener implements ActionListener
    {
        //implements actionPerformed method for Clear Button
        public void actionPerformed(ActionEvent e)
        {
            //deletes all text from fields
            changeAmountTF.setText("");
            quartersTF.setText("");
            dimesTF.setText("");
            nickelsTF.setText("");
            penniesTF.setText("");
        }
    }
    //main class, surprisingly empty
    public static void main(String[] args) 
    {
        //instantiates Guitest, implements window and makes it visible
        Guitest window = new Guitest();
        window.setVisible(true);
    }
}
