package fr.iutvalence.info.dut.m2107;

import java.util.*;

public class Game {

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
	public Game(Tile posHero) {
		this.map= new Grid();
		this.hero=new Hero(posHero);
		this.enemies=new ArrayList<Enemy>();
	}

	public void play() {

	}

}