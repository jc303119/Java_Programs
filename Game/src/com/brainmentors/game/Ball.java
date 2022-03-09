package com.brainmentors.game;

import java.awt.Color;
import java.awt.Graphics;

import com.brainmentors.game.utils.GameConstants;
import com.brainmentors.game.utils.GameUtils;

public class Ball implements GameConstants{
         private int x;
		 private int y;
         private int w;
         private int h;
         private int xspeed;
         private int yspeed;
         private Color color;
         static GameUtils g;
         static GameUtils speed;
         static GameUtils red;
         static GameUtils green;
         static GameUtils blue;
         static GameUtils random;
         
         static{
        	 g=new GameUtils(GAME_HEIGHT);
        	 speed=new GameUtils(30);
        	 red=new GameUtils(100);
        	 green=new GameUtils(130);
        	 blue=new GameUtils(160);
         }
      
         public Ball(){
        	 
        	 x=g.getRandomNumber();
        	 y=g.getRandomNumber();
        	 w=h=50;
        	 xspeed=yspeed=10;
        	 color=new Color(red.getRandomNumber(),green.getRandomNumber(),blue.getRandomNumber());
         }
         public void drawball(Graphics g){
        	g.setColor(color);
     		g.fillOval(x, y, w,h);
         }
         
         public void changeColor(Graphics g){
        	 g.setColor(Color.PINK);
        	 g.fillOval(x, y, w,h);
         }
         
         public void DoulbleBall(Graphics g){
        	 g.setColor(Color.BLACK);
         }
         
         public void getrandom(){
        	 
         }
         public void changeDirection(){
     		if(x>=(GAME_WIDTH-50)){
     		     xspeed= -speed.getRandomNumber();
     		}
     		
     		if(x<=0){
     			xspeed = speed.getRandomNumber();
     		}
     		if(y>=(GAME_HEIGHT-50)){
     			yspeed = -speed.getRandomNumber();
     		}
     		if(y<=0){
     			yspeed = speed.getRandomNumber();
     		}
     	}
         void move(){
     		x+=xspeed;
     		y+=yspeed;
     		
     	}
     
         public int getX() {
 			return x;
 		}
 		public void setX(int x) {
 			this.x = x;
 		}
 		public int getY() {
 			return y;
 		}
 		public void setY(int y) {
 			this.y = y;
 		}
 		public int getW() {
 			return w;
 		}
 		public void setW(int w) {
 			this.w = w;
 		}
 		public int getH() {
 			return h;
 		}
 		public void setH(int h) {
 			this.h = h;
 		}
 		public Color getColor() {
 			return color;
 		}
 		public void setColor(Color color) {
 			this.color = color;
 		}
 		public static GameUtils getG() {
 			return g;
 		}
 		public static void setG(GameUtils g) {
 			Ball.g = g;
 		}
 		public static GameUtils getRed() {
 			return red;
 		}  
		public static void setRed(GameUtils red) {
			Ball.red = red;
		}
		public static GameUtils getGreen() {
			return green;
		}
		public static void setGreen(GameUtils green) {
			Ball.green = green;
		}
		public static GameUtils getBlue() {
			return blue;
		}
		public static void setBlue(GameUtils blue) {
			Ball.blue = blue;
		}
 		
}
