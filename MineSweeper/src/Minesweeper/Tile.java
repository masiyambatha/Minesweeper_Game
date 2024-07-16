package Minesweeper;

import java.awt.Color;
import java.awt.Graphics;

public class Tile {
	int x,y,size,number=10;
	Tile(int row,int col,int size){
		x=col*size;
		y=row*size;
		this.size=size;
	}
	public void draw(Graphics g) {
		g.drawRect(x, y, size, size);
	    //g.setColor(Color.RED);
		
		
	}	
}
