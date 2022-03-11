package com.brainmentors.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
        private Image backgroundImage;
        private Player player;
        private Timer timer;
        
        private void loadImages(){
        	backgroundImage = new ImageIcon(Board.class.getResource("Space1.jpg")).getImage();
        }
      
        private void bindEvents(){
        	this.addKeyListener(new KeyAdapter() {
				
        		
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					player.stop();
					player.acc = 0;
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					if(e.getKeyCode()==KeyEvent.VK_UP){
						player.up();
						player.setY(player.getY()+player.acc);
						player.acc--;
					}
					if(e.getKeyCode()==KeyEvent.VK_DOWN){
						player.down();
						player.setY(player.getY()+player.acc);
						player.acc++;
					}
					
					if(e.getKeyCode()==KeyEvent.VK_LEFT){
						player.left();
					}

					if(e.getKeyCode()==KeyEvent.VK_RIGHT){
						player.right();
					}
					
					
				}
			});
        }
        
	    private void gameloop(){
	    	  timer = new Timer(DELAY,(e)->{
	    		  repaint();
	    		  player.move();
	    	  });
	    	  timer.start();
	      }
	    
        public Board(){
        	 setSize(GAME_WIDTH,GAME_HEIGHT);
        	 player = new Player();
        	 loadImages();
        	 gameloop();
        	 setFocusable(true);
        	 bindEvents();
        	 
         }
	          private void drawBackGround(Graphics g){
	        	  g.drawImage(backgroundImage, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	          }
	          
	          public void paintComponent(Graphics g){
	        	  super.paintComponent(g);
	        	  drawBackGround(g);
	        	  player.drawPlayer(g);
	          }
  }
