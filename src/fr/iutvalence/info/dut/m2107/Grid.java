package fr.iutvalence.info.dut.m2107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class Grid {

	Tile[] tabgrid;
	private int TILESIZE = 32;
	public Tile[][] maped;
	public static final int MAX_LENGTH_DEFAULT=40;
	public static final int MAX_WIDTH_DEFAULT=40;
	private int i;
	private int j;

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

		this.maped = new Tile[levelwidth][levelheight];
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
				maped[abcisse][ordonnee]= new Tile(true);
				
			} else if (item == '@') {
				//TODO: Hero(tile) quand il y aura la m�thode
				//Hero hero = new Hero(x,y);
			} else if (item == ' ') {
				//it is free space so it is not occuped
				maped[abcisse][ordonnee]= new Tile(false);
				
			}
		}


	}

	public void showMap(){
		System.out.println();
		for(int i=0; i<levelheight; i++){
			for(int j=0; j<levelwidth; j++){
				System.out.print(" | " + maped[i][j]);
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
	// la porte a cot� du h�ros est inaccessible a cause de l'ennemi,pour faire genre tutoriel

	private int levelwidth = 10;
	private int levelheight = 18;
	
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	
	// A voir !!!
	public Tile getTile(int i , int j ) {
		// TODO - implement Grid.getTile
		for (i = 0; i < level1.length(); i++){
			for (j = 0; j < level1.length(); j++){
				
				return maped[i][j];
			}
			
		}
		return null;
	
		
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	// A voir !!!
	public boolean inGrid(int i, int j) {
		// TODO - implement Grid.inGrid
		for (i = 0; i < level1.length(); i++){
			for (j = 0; j < level1.length(); j++){
				
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	/**
	 * Reads the String level and place it in the map
	 */
	public final void initWorld() {
		
		int ordonnee=0;
		int abscisse=0;
		for (int i = 0; i < level1.length(); i++) {
			char item = level1.charAt(i);
			switch (item){
			case '\n':
				ordonnee++;
				abscisse=0;
				break;
			case '#':
				//it is a wall so it is occuped				
				maped[ordonnee][abscisse]= new Tile(true);
				abscisse++;				
				break;
			default:
				maped[ordonnee][abscisse]= new Tile(false);
				abscisse++;
	
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
				if(maped[i][j].occupant==null){
					if(maped[i][j].isSolid()){
						g.setColor(new Color(102, 51, 0));
						g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
					}
					else {
						g.setColor(new Color(255, 204, 0));
						g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
						
					}
				}
				else if (maped[i][j].occupant instanceof Character){
					g.setColor(new Color(255, 0, 0));
					g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
				}
				
				


				
				
				// truc cool: si est un Hero 
				if (maped[i][j].getOccupant() instanceof Hero){
					//g.drawImage(item.getImage(), item.getPos().getX() + 2, item.getPos().getY() + 2, (ImageObserver) this);
				}
				else if (maped[i][j].getOccupant() instanceof Enemy){
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

