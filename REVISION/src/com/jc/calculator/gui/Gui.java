package com.jc.calculator.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame implements Constants,ActionListener{

	private JPanel buttonPanel;
	private JPanel inputOutputPanel;
	
	private JTextField info;
	
	 public Gui(){
		 
		 setTitle("Calculator");
		 setSize(FRAME_WIDTH, FRAME_HEIGHT);
		 setResizable(false);
		 setFocusable(true);
		 setLocation(FRAME_X, FRAME_Y);
		 
		 Container contentPane = getContentPane();
		 contentPane.setLayout(new FlowLayout());
		 
		 buttonPanel = new JPanel();
		 buttonPanel.setLayout(new GridLayout(5,5,6,6));
		 buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		 
		 inputOutputPanel = new JPanel();
		 inputOutputPanel.setLayout(new FlowLayout());
		 inputOutputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		 
		 info = new JTextField();
		 info.setFont(new Font("SansSerif", Font.PLAIN, 30));
	     info.setBackground(Color.white);
	     info.setBorder(BorderFactory.createLineBorder(Color.black));
	     info.setPreferredSize(new Dimension(270, 35));
	     inputOutputPanel.add(info);
	     
         String buttons[] = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2","3","-","0",".","=", "+",};
		 
		 for(String i : buttons){
			 JButton button = new JButton(i);
			 button.addActionListener(this);
			 buttonPanel.add(button);
			 
		 }
		 
		 
		 contentPane.add(inputOutputPanel);
		 contentPane.add(buttonPanel);
		 

	 }
	public static void main(String[] args) {
		Gui obj = new Gui();
		obj.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			
			JButton click = (JButton) e.getSource();
			if(click.getText().equals("=")){
				addOutput();
			}
			else{
				addInput(click.getText());
			}
		}
		
		else{
			addOutput();
		}
	}
	
	private boolean value = true;
public void addOutput() {
		
    try
    {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        info.setText(engine.eval(info.getText()).toString());
    }
    catch(ScriptException e)
    {
        info.setText("Syntax error");
    }
    value = false;
}


public void addInput(String line){
	if(value){
		info.setText(info.getText()+line);
	}
		 else
	        {
	            info.setText(line);
	            value = true;
	        }

   }

}
