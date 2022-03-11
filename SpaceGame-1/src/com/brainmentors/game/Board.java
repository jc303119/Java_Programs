package com.brainmentors.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	 private Image backgroundImage;
     private Timer timer;
     private Player player;
    // private Enemy enemy;
     Enemy enemies[] = new Enemy[MAX_ENEMY];
     private boolean isMove = false;
     private int enemyMoveCounter;
     private boolean isDirection = false;
     private boolean isStop = false;
     Camera camera = new Camera();
     
    private void loadEnemies(){
    	int x = 100;
    	for (int i=0; i<MAX_ENEMY; i++){
    		enemies[i]= new Enemy(x);
    		x +=200;
    	}
    }
   
	public void loadimage(){
		backgroundImage= new ImageIcon(Board.class.getResource("Space1.jpg")).getImage();
	}
	
	private void drawBackground(Graphics g){
		
		camera.drawbg(g);
		//g.drawImage(backgroundImage, 0, 0, GAME_WIDTH, GAME_HEIGHT,null);
	}

	
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("Key released " +e.getKeyCode());
				player.stop();
				player.xAcc = player.yAcc = 0;
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("KEY pressed "+e.getKeyCode());
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
			           player.addBullets();
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					camera.move();
					//player.up();
					//player.setY(player.getY() + player.acc);
					//player.yAcc--;
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					//player.down();
					//player.setY(player.getY() + player.acc);
					//player.yAcc++;
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					player.left();
					player.xAcc--;
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.right();
					player.xAcc++;
				}
				
			}
			
		});			
		
	}
	
	public void moveEnemies(){
		if(Enemy.movingY<=70 && enemyMoveCounter<5000){       // what is enemymovecounter  ?? 
			isMove = false;
			
		}
		else
			if(Enemy.movingY==70 && enemyMoveCounter>=5000){
				isMove = true;
				enemyMoveCounter = 0;
				isDirection = true;
				//isStop = true;
				
			}
			else
				if(Enemy.movingY>=140 && !isStop){
					isDirection = false;
					isMove = false;
					enemyMoveCounter = 0;
					isStop = true;
					//System.out.println("Inside 70 stop....." +isMove);
				}
				else
					if(Enemy.movingY>=140 && enemyMoveCounter>=5000 && isStop){
						isMove = true;
						isStop = false;
						isDirection = false;
						enemyMoveCounter = 0;
					}
		enemyMoveCounter += 50;
	}
	
	private void drawEnemies(Graphics g){
		
		    	for(Enemy enemy : enemies){
		    		if(enemy.isVisible){
		    			if(isMove && isDirection){
		    				Enemy.direction = 1;
		    				enemy.drawEnemy(g);
		    				enemy.move();
		    			}
		    			if(isMove && !isDirection){
		    				Enemy.direction = -1;
		    				enemy.drawEnemy(g);
		    				enemy.move();
		    			}
		    			if(!isMove){
		    				Enemy.direction = 0;
		    				enemy.drawEnemy(g);
		    				enemy.move();
		    			}
		    		}
		    		
		    		
		    	}
		   
		}
	
     private void gameLoop(){
    	 timer = new Timer(DELAY,(e)->{
    		 repaint();
    		 player.move();
    		 moveEnemies();
    	 });
    	 timer.start();
     }
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
	    player = new Player();
		//enemy = new Enemy(100);
		loadimage();
		loadEnemies();
		gameLoop();
		
		setFocusable(true);	
		bindEvents();
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBackground(g);
		player.drawPlayer(g);
	    drawEnemies(g);
		player.drawBullets(g);
		
	}
}
