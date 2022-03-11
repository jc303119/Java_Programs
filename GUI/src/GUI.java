import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI extends JFrame implements ActionListener{
    
	private JButton one,two,three,four,five,six,seven,eight,nine,zero,point,equal,multiply,plus,minus,divide;
	
	double a=0, b=0, result=0;
	int operator=0;
	private JPanel contentPane;
	private JTextField t;

	/**
	 * Launch the application.
	 */
	public static void main(String  ...s) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    one = new JButton("1");
		one.setAlignmentX(Component.RIGHT_ALIGNMENT);
		one.setBounds(10, 72, 89, 23);
		contentPane.add(one);
		one.addActionListener(this);
		
//		JButton two = new JButton("2");              //Why is it not working with JButton 
//		two.setBounds(109, 72, 89, 23);
//		contentPane.add(two);
//		two.addActionListener(this);
	
	    two = new JButton("2");
		two.setBounds(109, 72, 89, 23);
		contentPane.add(two);
		two.addActionListener(this);
		
	    three = new JButton("3");
		three.setBounds(208, 72, 89, 23);
		contentPane.add(three);
		three.addActionListener(this);
		
		four = new JButton("4");
		four.setBounds(10, 126, 89, 23);
		contentPane.add(four);
		four.addActionListener(this);
		
	    five = new JButton("5");
		five.setBounds(109, 126, 89, 23);
		contentPane.add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setBounds(208, 126, 89, 23);
		contentPane.add(six);
		six.addActionListener(this);
		
		 seven = new JButton("7");
		seven.setBounds(10, 178, 89, 23);
		contentPane.add(seven);
		seven.addActionListener(this);
		
		 eight = new JButton("8");
		eight.setBounds(109, 178, 89, 23);
		contentPane.add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setBounds(208, 178, 89, 23);
		contentPane.add(nine);
		nine.addActionListener(this);
		
	    zero = new JButton("0");
		zero.setBounds(10, 227, 89, 23);
		contentPane.add(zero);
		zero.addActionListener(this);
		
	    point = new JButton(".");
		point.setBounds(109, 227, 89, 23);
		contentPane.add(point);
		point.addActionListener(this);
		
		equal = new JButton("=");
		equal.setBounds(208, 227, 89, 23);
		contentPane.add(equal);
		equal.addActionListener(this);
		
		multiply = new JButton("x");
		multiply.setBounds(311, 72, 89, 23);
		contentPane.add(multiply);
		multiply.addActionListener(this);
		
		divide = new JButton("/");
		divide.setBounds(311, 126, 89, 23);
		contentPane.add(divide);
		divide.addActionListener(this);
		
		plus = new JButton("+");
		plus.setBounds(311, 178, 89, 23);
		contentPane.add(plus);
		plus.addActionListener(this);
		
	    minus = new JButton("-");
		minus.setBounds(311, 227, 89, 23);
		contentPane.add(minus);
		minus.addActionListener(this);
		
		t = new JTextField();
		t.setBounds(10, 11, 390, 50);
		contentPane.add(t);
		t.setColumns(10);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
 
        if(e.getSource()==one){
        	System.out.println("Button one click");
            t.setText(t.getText().concat("1"));
		}
		
        if(e.getSource()==two){
        	t.setText(t.getText().concat("2"));
		}
       if(e.getSource()==three){
	        t.setText(t.getText().concat("3"));	
		}
       if(e.getSource()==four){
	        t.setText(t.getText().concat("4"));
    	}
       if(e.getSource()==five){
	        t.setText(t.getText().concat("5"));
	    }
        if(e.getSource()==six){
	        t.setText(t.getText().concat("6"));
	    }
        if(e.getSource()==seven){
	        t.setText(t.getText().concat("7"));	
	    }
        if(e.getSource()==eight){
         	 t.setText(t.getText().concat("8"));	
     	}
        if(e.getSource()==nine){
         	 t.setText(t.getText().concat("9"));
	    }
        if(e.getSource()==zero){
	         t.setText(t.getText().concat("0"));	
      	}
        if(e.getSource()==point){
        	 t.setText(t.getText());	
       	}
 
 
        if(e.getSource()==plus){
         	 a=Double.parseDouble(t.getText());  	
           	 operator=1;
	         t.setText(t.getText()+"+");
	    }
        if(e.getSource()==minus){
	         a=Double.parseDouble(t.getText());
	         operator=2;
	         t.setText(t.getText()+"-");	
	    }
         if(e.getSource()==multiply){
         	 a=Double.parseDouble(t.getText());
          	 operator=3;
        	 t.setText(t.getText()+"*");
      	}
       if(e.getSource()==divide){
        	 a=Double.parseDouble(t.getText());
	         operator=4;
	         t.setText(t.getText()+"/");
	    }
    try{
       if(e.getSource()==equal){
	         b=Double.parseDouble(t.getText());
	 
	 switch(operator){
	 case 1: result = a+b;
	    break;
	 case 2: result = a-b;
	    break;
	 case 3: result = a*b;
	    break;
	 case 4: result = a/b;
	    break;
	    default: result =0;
	   }
	 t.setText(""+result);
	} 
 }
 finally{
	  System.out.println("Invalid input");
 }
  }
}
