package com.brainmentors.game;

import java.awt.Toolkit;


import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants{
  
	public GameFrame(){
		
		
	
		setSize(GAME_WIDTH, GAME_HEIGHT);
		
		setTitle(GAME_TITLE);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Board board = new Board();
	    add(board);
	    setVisible(true);
	    Toolkit.getDefaultToolkit().sync();
	}
	
	public static void main(String[] args) {
		GameFrame gameframe = new GameFrame();

	}

}
