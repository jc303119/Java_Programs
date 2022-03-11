package com.brainmentors.game;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Sprite implements GameConstants{
           public Bullet(int x, int y){
        	   h=w=10;
        	   this.x =x;
        	   this.y = y;
        	   ySpeed = -10;
        	   isVisible = true;
        	   
           }
           public void move(){
        	   y += ySpeed;
           }
           public void drawBullet(Graphics g, int OWNER){
        	   if(OWNER == PLAYER){
        		   g.setColor(Color.WHITE);
        	   }
        	   else
        		   if(OWNER == ENEMY){
        			   g.setColor(Color.RED);
        		   }
        	   g.fillOval(x, y, w, h);
        	   move();
           }
}
