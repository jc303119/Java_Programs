  /**
   * 
   * 
   * CONS for initializing
   * setlocationrealtionto is for position of the ball if null starting at centre

   */

import javax.swing.JFrame;

public class Ballgame extends JFrame implements GameConstant{      //frame for drawing
	
   public Ballgame(){ 
       setTitle(title);
	   setSize(900,700); 
	   setVisible(true); 
	   setLocationRelativeTo(null);
	   //setLocation(100,100);
	   Board board=new Board();
	   this.add(board);
	   
	   
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Ballgame obj=new Ballgame();
	}

}
