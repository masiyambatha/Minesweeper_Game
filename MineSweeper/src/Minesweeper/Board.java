package Minesweeper;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener{
	Tile tiles[][]=new Tile[5][5];
	Board() {
		int count=0;
		for(int i=0;i<tiles.length;i++) {
			for(int j=0;j<tiles.length;j++) {
				tiles[i][j]=new Tile(i,j,60);
				if(count<4) {
					tiles[i][j].setNumber(9);
					count++;
				}
			}
		}
		scrumble();
		this.addMouseListener(this);
	}
	
	void swap(int row1,int col1,int row2,int col2) {
		int temp=tiles[row1][col1].getNumber();
		tiles[row1][col1].setNumber(tiles[row2][col2].getNumber());
		tiles[row2][col2].setNumber(temp);
	}
	void scrumble() {
		for(int k=0;k<10;k++) {
			for(int i=0;i<tiles.length;i++) {
				for(int j=0;j<tiles.length;j++) {
					swap(i,j,(int)Math.random()*3,(int)(Math.random()*3));
				}
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
	int checkBoom(int i,int j) {
		int c=0;
		try {
			if(tiles[i-1][j-1].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i][j-1].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i+1][j-1].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i-1][j].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i+1][j].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i-1][j+1].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i][j+1].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		try {
			if(tiles[i+1][j+1].getNumber()==9) 
				c++;
		}catch(Exception ex) {}
		return c;
	}
	boolean isWin() {
		int count=0;
		for(int i=0;i<tiles.length;i++) {
			for(int j=0;j<tiles.length;j++) {
				if(tiles[i][j].getNumber()==10) {
					count++;
				}
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row=e.getY()/60;
		int col=e.getX()/60;
		int x=e.getX();
		int y=e.getY();
		if(tiles[row][col].isSelected(x, y)==true) {
			if(tiles[row][col].getNumber()==9) {
				tiles[row][col].setNumber(11);
			}else {
				tiles[row][col].setNumber(checkBoom(row,col));
			}
		}
		repaint();
		if(tiles[row][col].getNumber()==11) {
			JOptionPane.showMessageDialog(null, "Sorry, you've encounted a bom");
			//System.exit(0);
			int count=0;
			for(int i=0;i<tiles.length;i++) {
				for(int j=0;j<tiles.length;j++) {
					if(count<4) {
						tiles[i][j].setNumber(9);
						count++;
					}else {
						tiles[i][j].setNumber(10);
					}
				}
			}
			scrumble();
			repaint();
		}
		else if(isWin()==true) {
			JOptionPane.showMessageDialog(null, "Cogratulations you've managed to win the game");
			//System.exit(0);
			int count=0;
			for(int i=0;i<tiles.length;i++) {
				for(int j=0;j<tiles.length;j++) {
					if(count<4) {
						tiles[i][j].setNumber(9);
						count++;
					}else {
						tiles[i][j].setNumber(10);
					}
				}
			}
			scrumble();
			repaint();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
