/**
 *Program Name:	ReverseRepeter.java
 *Purpose:			
 *@author			Micheal Taylor
 *@version			
 *@since			Mar 11, 2025
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReverseRepeter extends JFrame{

	private JLabel lblInput;
	private JLabel lblOutput;
	
	private JTextField txtInput;//single field editiable
	private JTextField txtOutput;//single field non-editiable
	
	
	private JTextArea txtOutputArea;//multi field non-editiable
		
	private JButton btnClear;
	private Font font; 
	private int count;
	public ReverseRepeter() {
		
		super("Reverse Repeater");
		setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		
		lblInput = new JLabel("Enter your name:");
		lblOutput = new JLabel("here is you name in reverse");
		
		txtInput = new JTextField(20);
		
		txtOutput = new JTextField(20);		
		txtOutput.setEditable(false);
		
		font = new Font(Font.MONOSPACED, Font.ITALIC, 14);
		
		txtOutputArea = new JTextArea(10, 30);
		txtOutputArea.setEditable(false);
		txtOutputArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,2),"List Output"));
		txtOutputArea.setFont(font);
		
		btnClear = new JButton("Clear");
		count = 1;
		
		add(lblInput);
		add(txtInput);
		add(lblOutput);
		add(txtOutput);
		add(txtOutputArea);
		add(btnClear);
		
		txtInput.addActionListener(new ActionListener()
		{
			public void  actionPerformed(ActionEvent e) 
			{
				reverseName();
			}
		});
		
		
		
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtInput.setText("");
				txtOutput.setText("");
				txtInput.requestFocusInWindow();
			}
		});
		
		
		
		setSize(450,450);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
	
	private void reverseName()
	{
		String name = txtInput.getText();
		String reversed = "";
		for(int i =0;i<name.length();++i) 
		{
			reversed += name.charAt(name.length()-1-i);			
		}
		txtOutput.setText(reversed);
		
		txtOutputArea.append(String.format("%-5s%s\n",count+", ",reversed));
		++count;
	}
	
	public static void main(String[] args) {

		ReverseRepeter frame =new ReverseRepeter();		
	}//end main

}//end class
