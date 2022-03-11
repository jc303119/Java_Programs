package com.brainmentors.game;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {
	
	
         public GameFrame(){
        	   
              Board board = new Board();
              
              setSize(GAME_WIDTH, GAME_HEIGHT);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setTitle(TITLE);
              setResizable(false);
              setLocationRelativeTo(null);
              setVisible(true);
              add(board);

         }
	public static void main(String[] args) {
		
		GameFrame gameframe= new GameFrame();
	}

}
