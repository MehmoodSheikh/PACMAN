package Pacman;

import javax.swing.JFrame;

public class Pacman extends JFrame{

	public Pacman() {
		add(new Model()); /*ADDING MODEL*/
	}
	
	
	public static void main(String[] args) {
		Pacman pac = new Pacman(); 
		pac.setVisible(true);  
		pac.setTitle("PACMAN"); /*NAME*/
		pac.setSize(380,420); /*SIZE OF THE WINDOW*/
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);/*SET POSITION IN MIDDLE OF YOUR SCREEN*/
		
	}

}