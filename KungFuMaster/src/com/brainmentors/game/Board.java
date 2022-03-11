package com.brainmentors.game;

import java.awt.Graphics;


import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants, ActionListener {
            private Timer timer;
	        private Image background;
	        private Player player;
            
     public void loadBGImage(){
    	 background = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
     }
     
     public void DrawBGImage(Graphics g){
    	 g.drawImage(background, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
     }
      
     private void bindevents(){
    	 this.addKeyListener(new KeyAdapter() {
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.walk();
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					player.walkY();
				}
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					player.jump();
				}
				if(e.getKeyCode()==KeyEvent.VK_K){
					player.setState(Player.KICK);
				}
				
			}
		});
     }
	public void gameLoop(){
		timer = new Timer(GAME_SPEED,this);
		
			timer.start();
	
		}
	
	public  Board(){
		player = new Player();
		loadBGImage();
		setSize(GAME_WIDTH, GAME_HEIGHT);
		
		setFocusable(true);
		bindevents();
		gameLoop();
		
		
	}
	public void paintComponent(Graphics g){
		//System.out.println("Paint component working");
		super.paintComponent(g);
		DrawBGImage(g);

		player.drawPlayer(g);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		player.fall();
	}



}
