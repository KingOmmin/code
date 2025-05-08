/**
 *Program Name:	Microwave.java
 *Purpose:		A gui application which simulates a microwave oven	
 *@author			Micheal Taylor
 *@version			1.0
 *@since			Mar 11, 2025
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Microwave extends JFrame{
	private JTextArea txtInput,txtOven;
	private JButton[] buttons;
	private JButton btnLevel,btnDefrost,btnTime,btnStart,btnStop;
	
	private JPanel sidePanel, buttonPanel;
	private Font newFont;
	private String cookTime;
	private String timeDisplay;
	
	private Microwave() 
	{
		 super("Micheal Taylor's Microwave Oven");
		 setLayout(new BorderLayout());
		 
		 txtOven = new JTextArea("Oven Area = Food Goes Here");
		 txtOven.setEditable(false);
		 txtOven.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 txtOven.setBackground(Color.white);
		 
		 txtOven.setForeground(Color.blue);
		 newFont = new Font("sans- Serif",Font.BOLD,18);
		 txtOven.setFont(newFont);
		 cookTime ="";
		 timeDisplay ="";
		 buildSidePanel();
	}
	
	public void buildSidePanel() 
	{
		sidePanel = new JPanel();
		sidePanel.setLayout(new BorderLayout());
		
		txtInput = new JTextArea("Cooking time is displayed here . . .");
		
		txtInput.setLineWrap(true);
		txtInput.setWrapStyleWord(true);
		txtInput.setEditable(false);
		
		buildButtonPanel();
		
		sidePanel.add(txtInput,BorderLayout.NORTH);
		sidePanel.add(buttonPanel,BorderLayout.CENTER);	
		
	}
		
	
	
	public void buildButtonPanel() 
	{
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,3));
		
		
		
		
	}
	public class ButtonHandler implements ActionListener 
	{
		public void  actionPerformed(ActionEvent e) 
		{
			
		}
	}
	
	private static void setLookAndFeel()
	{
	     try
	     {
	         UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

	         //UIManager.setLookAndFeel("com.sun.java.swing.plaf.MetalLookAndFeel");
	         //UIManager.setLookAndFeel(“com.sun.java.swing.plaf.windows.WindowsLookAndFeel”);
	         //UIManager.setLookAndFeel(“com.sun.java.swing.plaf.motif.MotifLookAndFeel”);

	         //SwingUtililies.updateComponentTreeUI(this);
	     }	
	     catch (Exception e)
	     {
	         System.out.println(e.getMessage());
	     }
	}
	
	public static void main(String[] args) {

		setLookAndFeel();
	}

}
