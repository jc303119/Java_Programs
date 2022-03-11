package com.brainmentors.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Camera {
          private int x;
          private int y;
          private int w;
          private int h;
          private int ySpeed;
          
          private BufferedImage img;
          public Camera(){
        	  ySpeed = 100;
        	  y = x = 0;
        	  w = 900;
        	  h = 600;
        	  try{
        		  img = ImageIO.read(Camera.class.getResource("bg.png"));
        	  }
        	  catch(IOException e){
        		  e.printStackTrace();
        	  }
          }
          
          public Image getPartImage(){
        	  return img.getSubimage(x, y, w, h);
          }
          
          public void move(){
        	  y += ySpeed;
        	 
          }
          
          public void drawbg(Graphics g){
        	  g.drawImage(getPartImage(), 0, 0, w, h, null);
          }
}
