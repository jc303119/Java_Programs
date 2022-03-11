package com.brainmentors.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player implements GameConstants, PlayerState{
	  private int x;
	  private int y;
	  private int w;
	  private int h;
	  private int speed;
	  BufferedImage spriteSheet;
	  private final int FLOOR = GAME_HEIGHT - 50;
	  private final int GRAVITY = 1;
	  private int force;
	  private int state;
	  BufferedImage defaultImageArr[];
	  BufferedImage kickImageArr[];
	  
	  public int getState() {
		return state;
	  }
	  public void setState(int state) {
		this.state = state;
	  }
	  
	  
	public Player(){
		  loadSpriteSheet();
		  defaultImageArr = defaultImage();
		  kickImageArr = kickImage();
		  
		  x  = 100;
		  h =100;
		  w = 80;
		  speed = 7;
		  state = WALK;
		  y = FLOOR - h;
		  
	  }
	
	  public void loadSpriteSheet(){
		  
         try {
			spriteSheet = ImageIO.read(Player.class.getResource("player.gif"));
		} catch (IOException e) {
			System.out.println("Cannot read the Images");
			e.printStackTrace();
		}
	  }
	  
	  public BufferedImage[] defaultImage(){
		 // return spriteSheet.getSubimage(377, 12, 71, 102);       //for getting any one sub image from the sprite sheet
		 BufferedImage array[] = new BufferedImage[5];                 //for multiple sub images to make animated image
		 array[0] = spriteSheet.getSubimage(0, 8, 50, 95);
	     array[1] = spriteSheet.getSubimage(72, 7, 50, 95);
	     array[2] = spriteSheet.getSubimage(137, 5,50, 95);
		 array[3] = spriteSheet.getSubimage(206, 6, 50, 95);
	     array[4] = spriteSheet.getSubimage(274, 7, 50, 95);
	   
	     return array;
		  
	  }
	  
	/*  public BufferedImage[] defaultImageReverse(){
		 // return spriteSheet.getSubimage(377, 12, 71, 102);       //for getting any one sub image from the sprite sheet
		 BufferedImage array[] = new BufferedImage[5];                 //for multiple sub images to make animated image
		 array[0] = spriteSheet.getSubimage(53, 110, 53, 88);
	     array[1] = spriteSheet.getSubimage(73, 106, 39, 87);
	     array[2] = spriteSheet.getSubimage(134, 107, 43, 90);
		 array[3] = spriteSheet.getSubimage(201, 109, 37, 84);
	     array[4] = spriteSheet.getSubimage(267, 108, 35, 82);
	     return array;
		  
	  }
	  */
	  
	  public BufferedImage[] kickImage(){
		  BufferedImage array[] = new BufferedImage[4];                 //for multiple sub images to make animated image
			 array[0] = spriteSheet.getSubimage(0, 309, 49, 92);
		     array[1] = spriteSheet.getSubimage(63,307, 49, 92);
		     array[2] = spriteSheet.getSubimage(130, 299, 75, 97);
		     array[3] = spriteSheet.getSubimage(216, 304, 75, 97);
		     return array;
	  }
	  
	  int walkPass = 0;
	  int walkIndex = 0;
	  public void walkEffect(Graphics g){
		  if(walkIndex>=defaultImageArr.length-1){
			  walkIndex = 0;
		  }
		  else{
			  g.drawImage(defaultImageArr[walkIndex], x, y, w, h, null);
			  walkPass++;
			  if(walkPass==4){
			      walkIndex++; 
			      walkPass = 0;
		        }
		    }
	  }
	  
	  int kickIndex = 0;
	  int kickPass = 0;
	  public void kickEffect(Graphics g){
		  if(kickIndex>=kickImageArr.length-1){
			  kickIndex = 0;
			  walkIndex = 0;
			  state = WALK;
		  }
		  else{
			  g.drawImage(kickImageArr[kickIndex], x, y, w, h, null);
			  kickPass++;
			  if(kickPass==4){
				  
				  kickIndex++;
				  kickPass = 0;
			  }
		  }
	  }
	  public void drawPlayer(Graphics g){
		 // g.drawImage(defaultImage(), x, y, w, h, null);
		  if(state==WALK){
			  walkEffect(g);
		  }
		  else
			  if(state == KICK){
			 kickEffect(g);
			  }
	  }

	  public void walk(){
			x += speed;
		}
	  public void walkY(){
		  x-=speed;
	  }
     private boolean isJump;            //by default isJump is false
     public void jump(){
	      if(!isJump){             //here isjump become true
	    	  force = -15;
	    	  y = y + force;
	    	  isJump = true;
	      }
	      
      }

      public void fall(){
	    if(y<FLOOR - h){
	    	force = force + GRAVITY;
	    	y = y + force;
	    }
	    if(y>FLOOR - h){
	    	isJump = false;
	    	y = FLOOR - h;
	    }
      }

}