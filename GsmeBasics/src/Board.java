import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;

import javax.swing.JPanel;

public class Board extends JPanel implements GameConstant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setSize(GWIDTH,GHEIGHT);
		setBackground(Color.CYAN);
		setFocusable(true);
		gameloop();
	}
  Timer timer;
	private void gameloop(){
		
		timer=new Timer((Game_speed,(e)->{
		//repaint call paintComponent(g);
		  repaint();
		  moveBall();
		});
	  timer.start();
}
	int x=100;
	int speed=1;
	@Override
 public void paintComponent(Graphics g){
	 super.paintComponent(g);
	 g.setColor(Color.RED);
	//g.fillRect(100, 100, 150, 150);
	 g.fillOval(x, 100,150, 150);
 }
	private void moveBall(){
		x=x+speed;
	}
	private void balldirection(){
		if(x>=GWIDTH){
			speed=-10;
		}
		else
         if(x<=0){
        	 speed=10;
         }
     }
}
