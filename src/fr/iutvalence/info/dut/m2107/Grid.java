package fr.iutvalence.info.dut.m2107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class Grid {

	Tile[] tabgrid;
	private int nbCol;
	private int nbLig;
	private int TILESIZE = 20;
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



	//private int getHeight() {

	//	return this.height;
	//}

	//private int getWidth() {

	//	return this.width;
	//}

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
		for(int i=0; i<levelheight; i++){
			for(int j=0; j<levelwidth; j++){
				System.out.print(" | " + map[i][j]);
			}
			System.out.println(" | ");
		}
	}




	private String level1 =
				     " ################ \n"
					+" ###          ### \n"
					+" #              # \n"
					+" #     #####    # \n"
					+" #     #####    # \n"
					+" #     #####   x# \n"
					+" #    @#####    # \n"
					+" #    ######    # \n"
					+" #  x ######    # \n"
					+" ##00########00## \n";
	// #:murs
	// @:personnage
	// x:ennemi
	// 0:porte de sortie
	// la porte a coté du héro est inaccessible a cause de l'ennemi,pour faire genre tutoriel

	private int levelwidth = 16;
	private int levelheight = 10;
	
	
	
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
	/**
	 * Reads the String level and place it in the map
	 */
	public final void initWorld() {
		
		int ordonnee=0;
		int abcisse=0;
		for (int i = 0; i < level1.length(); i++) {
			abcisse=i%levelwidth;
			char item = level1.charAt(i);
			if (item == '\n') {
				ordonnee++;
				abcisse=0;
			} else if (item == '#') {
				//it is a wall so it is occuped				
				map[abcisse][ordonnee]= new Tile(true);
				
			} else if (item == '@') {
				//TODO: Hero(tile) quand il y aura la méthode
				//Hero hero = new Hero(x,y);
			} else if (item == ' ') {
				//it is free space so it is not occuped
				map[abcisse][ordonnee]= new Tile(false);
				
			}
		}
	}
	/**
	 * 
	 * @param g
	 * display the world on the screen
	 */
	// Nouvelle version utilisant Grid et Tile
	
	public void buildWorld(Graphics g) {

		g.setColor(new Color(250, 240, 170));
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());




		for (int i = 0; i < levelwidth; i++) {
			for (int j=0; j< levelheight; j++) {
				if(map[i][j].occupant==null){
					if(map[i][j].isSolid()){
						g.setColor(new Color(102, 51, 0));
						g.fillRect(i*TILESIZE, j*TILESIZE, TILESIZE, TILESIZE);
					}
					else {
						g.setColor(new Color(255, 204, 0));
						g.fillRect(i*TILESIZE, j*TILESIZE, TILESIZE, TILESIZE);
						
					}
				}
				else if (map[i][j].occupant instanceof Character){
					g.setColor(new Color(255, 0, 0));
					g.fillRect(i*TILESIZE, j*TILESIZE, TILESIZE, TILESIZE);
				}
				
				


				
				
				// truc cool: si est un Hero 
				if (map[i][j].getOccupant() instanceof Hero){
					//g.drawImage(item.getImage(), item.getPos().getX() + 2, item.getPos().getY() + 2, (ImageObserver) this);
				}
				else if (map[i][j].getOccupant() instanceof Enemy){
					//g.drawImage(item.getImage(), item.getPos().getX(), item.getPos().getY(), (ImageObserver) this);
				}
				
				if (completed) {
					g.setColor(new Color(0, 0, 0));
					g.drawString("Completed", 25, 20);
				}
			}
		}

	}
}

