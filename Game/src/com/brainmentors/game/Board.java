package com.brainmentors.game;

import java.awt.Color;
import java.awt.Graphics;
//import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.game.utils.GameConstants;

@SuppressWarnings("serial")
public class Board extends JPanel implements GameConstants{
	
	private Timer timer;
	final int SPEED = 30;
    final int MAX_BALL=50;
    //int x[]=new int[5];
	Ball balls[]=new Ball[MAX_BALL];     //Array of Object is used for 50 balls in this case. array by default 0 blank
	
	
	private void prepareBalls(){
		for(int i=0; i<MAX_BALL; i++){
			Ball ball=new Ball();
			balls[i]=ball;
		}
	}
	public Board(){
		prepareBalls();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
	//@Override
	//public void actionPerformed(ActionEvent e){
		//repaint();
	//}
	public void gameLoop(){
		System.out.println("Balls are "+balls.length);
		timer=new Timer(GAME_SPEED,(e)->{           //ball move after every 50ms (work of Timer) (Short hand of ActionListener)
			repaint();                        //paint the ball repeatedly act as for loop
					
		});
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g){                 //paint the ball once on  the board
		
		super.paintComponent(g);
		for(Ball ball: balls){
			
			ball.move();
			ball.changeDirection();
			ball.drawball(g);
			
			int xDistance=((+ball.getX())-(+ball.getX()));
	    		xDistance=Math.abs(xDistance);
			if(xDistance<=ball.getX()){
	    			
	    			ball.changeColor(g);
	    		}
	  
			//if((ball.getX())==(ball.getY())){
				//ball.DoulbleBall(g);
		//	}
			
			//System.out.println("Ball "+ball.getX()+" "+ball.getY());
		    		
				}
		//ball.drawball();
		//g.setColor(Color.RED);
		//g.fillOval(x, y, 50,50);
		
	}
	
}