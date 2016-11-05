package LifestyleChange;

import java.awt.Color;

import javax.swing.JFrame;

public class HealthMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainMenu menu = new MainMenu();
		GuiController gui = new GuiController("FiZiCo");
		gui.setSize(800,500);
		gui.setResizable(true);
		gui.setLocationRelativeTo(null);
		gui.setBackground(Color.white);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
	}

}
