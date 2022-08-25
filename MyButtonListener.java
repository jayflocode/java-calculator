/* I Jayson Flores DO NOT AUTHORIZE THE usage of this code without explicit permission.
 Permission can be requested by emailing me directly at jayson_flores@me.com. 
 Any usage of the code without permission would be considered code theft and plagarism which will be 
 prosecuted to the furthest extent of the law.  All rights are reserved by Jayson Flores, code creator */

package firstCalc;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.event.*;
import org.mariuszgromada.math.mxparser.*;


 


class MyButtonListener extends JFrame implements ActionListener {
	
	
	static MyFrame fr;
	
	public static String entry;   //used to store entered data by the active listener 
	public static String num1 = "";  //stores numbers as operands for calculation
	public static String num2 = "";
	public static String total = "";  // stores total 
	public static String operator =  "";  // stores operator used for calculation
	public static String clear;  // will be used clear values 
	public static String lastCalc;
	
      
    // please review 
	
	public MyButtonListener(MyFrame frame)  // calls on Frame class to gain access to members
	{
		fr = frame;
	}
	
	// please review 

	public void actionPerformed(ActionEvent e)  // action event used to read button input, and JTextFrame output

	{
	   System.out.println("num 1:" + num1);
	   System.out.println("num 2:" + num2);
	   System.out.println("total:" + total);
	   System.out.println("Operator:" + operator);
	   System.out.println("Last Number:" + lastCalc);
	   
	
		entry = e.getActionCommand();  // when press it creates a string 
		
		// does operand exist? 
		
		// nested if else statements 
		
		if (!operator.equals("") && !num1.equals("") && !num2.equals("") //if these factors are available
				
			
				) {
			System.out.println("Detecting additional 1");
			
			//if an operator was also pressed 
			
			if (entry.equals("*") || entry.equals("-") || entry.equals("/") || entry.equals("+")) {	
			
				System.out.println("Detecting additional 2");
			
			lastCalc = total;  // stores last calculation 
			
			
			String win = num1 + operator + num2;  // adds operands and operator as a string
			
			
			// output testing 
			System.out.println(win);
			
			Expression equation = new Expression(win);
			
			String finaleq = String.valueOf(equation.calculate());
			
			
			
			total = finaleq;
			   //sets total of calculation to calculator display JText
			
		      //clears all values on exit 
			
		
			num1 = total;
					
		    num2  = operator = "";
			
			}
			
			
		} 
		
		
		
		    if (entry.equals("+/-")) {    //if negative entry is detected it adds negative string
			
			
			if (!num1.contains("-")) {
				
				num1 = "-" + num1;
				
				
			}
			
			if (!num2.contains("-") && !num2.equals("")) {
				
			    num2 = "-" + num2;
		
			}
    
			
			     // after data is detected it then evaluates the input stored 
		}

		if (entry.equals("=")) {    ///evaluates the expression from the strings using mxParser
			
            
			
			if (entry.equals("=") && num1.equals("") && num2.equals("")  ) {
				
				System.out.println("C Trigger 2");
				total = ("");
				
			}
			
			
			
			else if (entry.equals("=") && !num1.equals("") && num2.equals("")  ) {
				
				System.out.println("C Trigger 3");
				total = num1;
				
			}
			
			else {

			if (num2.contains("-")) {      //removes extra negative from string if detected 
				
				
				num2 = "(" + num2 + ")"; 
				
			}
			
			String win = num1 + operator + num2;  // adds operands and operator as a string
			
		
			// output testing 
			System.out.println(win);
			
			Expression equation = new Expression(win);
			
			String finaleq = String.valueOf(equation.calculate());
			
			
			
			total = finaleq;
			fr.displayOperator.setText("");   //sets total of calculation to calculator display JText
			
		      //clears all values on exit 
			
		
			num1 = num2  = operator = "";
			
		
		}
		
		}
		
		else {
		
			//if clear key is pressed, all values clear and restarts every condition
		
		if (entry.equals("C")) {    /// clears the strings 
			
			
			num1 = num2 = total = operator = "";
			total = "";
			fr.displayOperator.setText("");
			
		}
		
		else {
		
		//assigns an operator after first input is not blank, and input is pressed 
			
			
		if (entry.equals("+") || entry.equals("-") || entry.equals("*") || entry.equals("/")
			) {
			
			
		operator = entry;
		
		fr.displayOperator.setText("  " + entry);
		
			
			
		}
		
		else {
			
			// if operator is present, num2 operand is empty, or if operator is pressed without the first 
			// operand entered, or if operand num2 is missing it stores operand, plus any subsequent entries
		
		if (!operator.equals("") && num2.equals("") || !num2.equals(""))  {
			
			 if (num2.equals("")) {
					
					num2 = entry;
					total = num2;		
					System.out.println("2nd value set: " + num2);
					
					}  
					
					else {
						
						// values keep getting added up until = is selected, operators detection will be ignored
						
		num2 = num2 + entry;  
		
		num2 = num2.replace("+/-", "");
						
		total = num2;
						
						
		System.out.println("repeated value(2) detected: " + num2);
						
					
					}	
			
			
		}
		
		// if operator is missing it automatically stores first entries to first operand
		
		if (operator.equals(""))  {
			
			
			
			
 	   // if all operands are empty first value is stored as first operand 
		
        if (num1.equals("") && num2.equals("") ) {
		
		num1 = entry;
		total = num1;		
		System.out.println("First ever value set: " + num1);
		
		}  
        
        // if its not empty numbers will be added and increase 
		
		else {
			
		
			num1 = num1 + entry;  
			
			num1 = num1.replace("+/-", "");
		
			total = num1;
	
			System.out.println("repeated value(1) detected: " + num1);
			
		
		           }
		
		        }
		
		     }
		
		   }
		
		}
		
		
		 
		//final output will returned to JText as a simulated calculator display
		
		 fr.display.setText(total);
       
		
	}
		
   }
