/* I Jayson Flores DO NOT AUTHORIZE THE usage of this code without explicit permission.
 Permission can be requested by emailing me directly at jayson_flores@me.com. 
 Any usage of the code without permission would be considered code theft and plagarism which will be 
 prosecuted to the furthest extent of the law.  All rights are reserved by Jayson Flores, code creator */

package firstCalc;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class CalcMain {
	
public static void constructGUI() {
	
	// makes JFrame visible and calls upon the Myframe object
		
	JFrame.setDefaultLookAndFeelDecorated(true);
	MyFrame frame = new MyFrame();
	frame.setVisible(true);	
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		SwingUtilities.invokeLater(new Runnable() {
			
			
			public void run() {
				constructGUI();
				
				 
			}	
		});
	   }

	

}
