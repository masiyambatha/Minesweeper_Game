package Minesweeper;

import javax.swing.JFrame;

public class MinesweeperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame s=new JFrame("Vezokuhle-Minesweeper Game");
		s.setSize(330,350);
		s.setVisible(true);
		s.add(new Board());
	}

}
