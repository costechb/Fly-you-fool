package fr.iutvalence.info.dut.m2107;

import java.util.*;
import java.util.Scanner;
import javax.swing.JFrame;

public class Game extends JFrame {

	private Hero hero;
	private ArrayList<Enemy> enemies;
	Grid map;
	protected IHM_Keyboard keyboard;
	private IHM_View display;

	/**
	 * 
	 * @param x 
	 * @param x
	 * @param y 
	 * @param y
	 */
	//J'ai enlev� le posHero, la position est dans Grid au d�but du jeu
	public Game() {
		this.map= new Grid();
		this.enemies=new ArrayList<Enemy>();
		map.initWorld();
		
	}

	public void play() {

	}

	
	//J'ai supprim� le Main et je l'ai mis l�, �a sert a rien d'avoir un Game et un Main ou il y a rien
	public static void main(String[] args)  {
		Game game = new Game();
		game.setVisible(true);
		game.play();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char Move = str.charAt(0);
	
	
	
}
	
}