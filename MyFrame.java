/* I Jayson Flores DO NOT AUTHORIZE THE usage of this code without explicit permission.
 Permission can be requested by emailing me directly at jayson_flores@me.com. 
 Any usage of the code without permission would be considered code theft and plagarism which will be 
 prosecuted to the furthest extent of the law.  All rights are reserved by Jayson Flores, code creator */

package firstCalc;


import javax.swing.*;


import java.awt.*;

//mx parser used for this project


public class MyFrame extends JFrame{
	
	
	// displaying results into strings 
	// action listener calculates returns values and gathers values
	
	static JLabel display;
	static JLabel displayOperator;
	public static String entry;
	public static String repeatEntry;
	public static String repeatEntry2;
	public static String num1 = "";
	public static String num2 = "";
	public static String total = "";
	public static String operator =  "";
	
	
	// public values for buttons 
	
	public JButton zero;
	public JButton one;
	public JButton two;
	public JButton three;
	public JButton four;
	public JButton five;
	public JButton six;
	public JButton seven;
	public JButton eight;
	public JButton nine;
	public JButton equal;
	public JButton divide;
	public JButton multiply;
	public JButton minus;
	public JButton plus;
	public JButton clear;
	public JButton negative;
	public JButton decimal;
	
	//attributes for bag layout 
	
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
	
	public MyFrame() {
		super();
		init();
          //added strings to constructor frame 

	}
	
	private void init() {
		
		
		// creating a grid bag layout
		
		
		
		this.setLayout(new GridBagLayout());
		this.setTitle("Calculator");
		GridBagConstraints c = new GridBagConstraints();
		
		
		
		
		
		//all output will shown in this JLabel
		display = new JLabel("",SwingConstants.RIGHT);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.weightx = 1;
		c.weighty = 1;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 1;
		this.add(display, c);
		
        displayOperator = new JLabel("",SwingConstants.LEFT);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		this.add(displayOperator, c);
		
		
		display.setFont(new Font("Times Roman", Font.PLAIN, 30));
		FontMetrics fm = display.getFontMetrics(display.getFont());
	    int w = fm.stringWidth("00000000");
	    int h = fm.getHeight();
	    Dimension size = new Dimension(w, h);
	    display.setMinimumSize(size);
	    display.setPreferredSize(size);
	    
	    /* background is enabled to view input 
	    display.setBackground(Color.RED);
	    display.setOpaque(true); //Sets Button Opaque so it works
	    */
	   
		 
		 JButton seven = new JButton("7");
		 this.add(seven);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 0;
		 c.gridy = 4;
		 c.gridwidth = 1;
		 c.weightx = 1;
		 c.weighty = 1;
		 this.add(seven, c);
		 seven.addActionListener(new MyButtonListener(this)); 
		 
		 
		 JButton eight = new JButton("8");
		 this.add(eight);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 1;
		 c.gridy = 4;
		 c.gridwidth = 1;
		 c.weightx = 1;
		 c.weighty = 1;
		 this.add(eight, c);
		 eight.addActionListener(new MyButtonListener(this)); 
		 
		 JButton nine = new JButton("9");
		 this.add(nine);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 2;
		 c.gridy = 4;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(nine, c);
		 nine.addActionListener(new MyButtonListener(this)); 
		 
		 JButton divide = new JButton("/");
		 this.add(divide);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 3;
		 c.gridy = 4;
		 c.weightx = .75;
		 c.weighty = .75;
		 c.gridwidth = 1;
		 this.add(divide, c);
		 divide.addActionListener(new MyButtonListener(this)); 
		 
		 
		 JButton four = new JButton("4");
		 this.add(four);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 0;
		 c.gridy = 5;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(four, c);
		 four.addActionListener(new MyButtonListener(this)); 
		 
		 
		 JButton five = new JButton("5");
		 this.add(five);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 1;
		 c.gridy = 5;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(five, c);
		 five.addActionListener(new MyButtonListener(this));  
		 
		 JButton six = new JButton("6");
		 this.add(six);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 2;
		 c.gridy = 5;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(six, c);
		 six.addActionListener(new MyButtonListener(this)); 
		 
		 JButton multiply = new JButton("*");
		 this.add(multiply);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 3;
		 c.gridy = 5;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(multiply, c);
		 multiply.addActionListener(new MyButtonListener(this)); 
		 
		 JButton one = new JButton("1");
		 this.add(one);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 0;
		 c.gridy = 6;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(one, c);
		 one.addActionListener(new MyButtonListener(this)); 
		 
		 JButton two = new JButton("2");
		 this.add(two);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 1;
		 c.gridy = 6;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(two, c);
		 two.addActionListener(new MyButtonListener(this)); 
		 
		 JButton three = new JButton("3");
		 this.add(three);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 2;
		 c.gridy = 6;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(three, c);
		 three.addActionListener(new MyButtonListener(this));  
		 
		 JButton minus = new JButton("-");
		 this.add(minus);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 3;
		 c.gridy = 6;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(minus, c);
		 minus.addActionListener(new MyButtonListener(this)); 
		 
		 JButton zero = new JButton("0");
		 this.add(zero);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 0;
		 c.gridy = 7;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(zero, c);
		 zero.addActionListener(new MyButtonListener(this)); 
		 
		 JButton decimal = new JButton(".");
		 this.add(decimal);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 1;
		 c.gridy = 7;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(decimal, c);
		 decimal.addActionListener(new MyButtonListener(this)); 
		 
		 
		 JButton equal = new JButton("=");
		 this.add(equal);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 2;
		 c.gridy = 7;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(equal, c);
		 equal.addActionListener(new MyButtonListener(this)); 
		 
		 JButton plus = new JButton("+");
		 this.add(plus);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 3;
		 c.gridy = 7;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(plus, c);
		 plus.addActionListener(new MyButtonListener(this)); 
		 
		 
		 JButton clear = new JButton("C");
		 this.add(clear);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 1;
		 c.gridy = 8;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(clear, c);
		 clear.addActionListener(new MyButtonListener(this));  
		 
		 JButton negative = new JButton("+/-");
		 this.add(negative);
		 c.fill = GridBagConstraints.BOTH;
		 
		 c.gridx = 2;
		 c.gridy = 8;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(negative, c);
		 negative.addActionListener(new MyButtonListener(this)); 
		 
		
		 JButton percentage = new JButton("%");
		 this.add(percentage);
		 c.fill = GridBagConstraints.BOTH;
		
		 c.gridx = 3;
		 c.gridy = 8;
		 c.weightx = 1;
		 c.weighty = 1;
		 c.gridwidth = 1;
		 this.add(percentage, c);
		 percentage.addActionListener(new MyButtonListener(this)); 
		 
		 
		 // sets dimensions for window 
		 
		 
		 int frameWidth = 400;
		 int frameHeight = 500;
			Dimension screenSize =
				Toolkit.getDefaultToolkit().getScreenSize();
			this.setBounds((int) screenSize.getWidth() - frameWidth, 0,
			frameWidth, frameHeight);
		
		
		 
		
		
		
	}
	
	

	
	
	
	

}
