package fr.iutvalence.info.dut.m2107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class Grid {

	Tile[] tabgrid;
	private int nbCol;
	private int nbLig;

	public Tile[][] map;
	public static final int MAX_LENGTH_DEFAULT=40;
	public static final int MAX_WIDTH_DEFAULT=40;

	/**
	 * IS the level finished or not
	 */
	public boolean completed = false;


	/**
	 * For display window
	 */

	private final int OFFSET = 30;
	private final int SPACE = 20;
	private int width = 0;
	private int height = 0;

	private ArrayList walls = new ArrayList();
	private ArrayList areas = new ArrayList();

	private int getHeight() {

		return this.height;
	}

	private int getWidth() {

		return this.width;
	}

	/**Grid
	 * Constructor or Grid
	 */
	public Grid() {

		map = new Tile[nbCol][nbLig];
		for (int i=0; i<MAX_LENGTH_DEFAULT; i++) {
			for (int j=0; j<MAX_WIDTH_DEFAULT; j++) { 


			}
		}


	}

	public void showMap(){
		System.out.println();
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print(" | " + map[i][j]);
			}
			System.out.println(" | ");
		}
	}




	private String level1 =
				     "################\n"
					+"###            #\n"
					+"#              #\n"
					+"#     #####    #\n"
					+"#     #####    #\n"
					+"#     #####   x#\n"
					+"#    @#####    #\n"
					+"#    ######    #\n"
					+"#  x ######    #\n"
					+"##00########00##\n";
	// #:murs
	// @:personnage
	// x:ennemi
	// 0:porte de sortie
	// la porte a coté du héro est inaccessible a cause de l'ennemi,pour faire genre tutoriel

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Tile getTile(int x,  int y) {
		// TODO - implement Grid.getTile
		// j'ai changé le float en int puisque une tile est défini sur un int x et int y 
		throw new UnsupportedOperationException();
	}

	public int getNbCol() {
		return this.nbCol;
	}

	public int getNbLig() {
		return this.nbLig;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public boolean inGrid(int x, int y) {
		// TODO - implement Grid.inGrid
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	public final void initWorld() {
		int x = OFFSET;
		int y = OFFSET;

		for (int i = 0; i < level1.length(); i++) {
			char item = level1.charAt(i);
			Tile tile;
			if (item == '\n') {
				y += SPACE;
				if (this.width < x)
					this.width = x;
				x = OFFSET;
			} else if (item == '#') {
				tile = new Tile(x, y, true);
				walls.add(tile);
				x += SPACE;
			} else if (item == '@') {
				Hero hero = new Hero(x, y);
				x += SPACE;
			} else if (item == ' ') {
				x += SPACE;
			}
			height = y;
		}
	}
	/**
	 * 
	 * @param g
	 * display the world on the screen
	 */
	@SuppressWarnings("unchecked")
	public void buildWorld(Graphics g) {

		g.setColor(new Color(250, 240, 170));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		@SuppressWarnings("rawtypes")
		ArrayList world = new ArrayList();
		world.addAll(walls);
		world.addAll(areas);


		for (int i = 0; i < world.size(); i++) {

			Character item = (Character) world.get(i);

			if ((item instanceof Hero) || (item instanceof Enemy)) {
				g.drawImage(item.getImage(), item.getPos().getX() + 2, item.getPos().getY() + 2, (ImageObserver) this);
			} else {
				g.drawImage(item.getImage(), item.getPos().getX(), item.getPos().getY(), (ImageObserver) this);
			}

			if (completed) {
				g.setColor(new Color(0, 0, 0));
				g.drawString("Completed", 25, 20);
			}
		}
	}
	
}

