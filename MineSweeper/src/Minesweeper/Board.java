package Minesweeper;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel {
	Tile tiles[][]=new Tile[5][5];
	Board() {
		int count=0;
		for(int i=0;i<tiles.length;i++) {
			for(int j=0;j<tiles.length;j++) {
				tiles[i][j]=new Tile(i,j,60);
				
			}
		}
		
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<tiles.length;i++) {
			for(int j=0;j<tiles.length;j++) {
				tiles[i][j].draw(g);
			}
		}
	}
	
	
	

}
