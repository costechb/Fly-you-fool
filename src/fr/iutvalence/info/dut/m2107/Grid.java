package fr.iutvalence.info.dut.m2107;

import java.awt.Color;
import java.awt.Graphics;


public class Grid {

	Tile[] tabgrid;
	private int TILESIZE = 32;
	public Tile[][] map;
	public static final int MAX_LENGTH_DEFAULT=40;
	public static final int MAX_WIDTH_DEFAULT=40;
	private int i;
	private int j;
	private Tile PosSortie;
	private Tile PosEntry;

	/**
	 * IS the level finished or not
	 */
	public boolean completed = false;


	/**
	 * For display window
	 */


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
	// la porte a coté du héros est inaccessible a cause de l'ennemi,pour faire genre tutoriel
	
	private int levelwidth = 10;
	private int levelheight = 18;



	/**Grid
	 * Constructor or Grid
	 */
	public Grid() {

		this.map = new Tile[levelwidth][levelheight];
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
				map[ordonnee][abscisse]= new Tile(true);
				abscisse++;				
				break;
			case 'x':
				map[ordonnee][abscisse]= new Tile(true,new Enemy(map[ordonnee][abscisse]));
				abscisse++;
				break;
				
			case '@':
				map[ordonnee][abscisse]= new Tile(true,new Hero(map[ordonnee][abscisse]));
				abscisse++;
				break;
			
			default:
				map[ordonnee][abscisse]= new Tile(false);
				abscisse++;				
				break;
			}
		}



	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	
	// A voir !!!
	public Tile getTile(int i, int j) {
		
		return map[i][j];
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


	/**
	 * 
	 * @param g
	 * draw the world on the screen
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
						g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
					}
					else {
						g.setColor(new Color(255, 204, 0));
						g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
						
					}
				}
				else if (map[i][j].occupant instanceof Hero){
					g.setColor(new Color(255, 204, 0));
					g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
					g.setColor(new Color(0, 255, 0));
					g.fillOval(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
				}
				else if (map[i][j].occupant instanceof Enemy){
					g.setColor(new Color(255, 204, 0));
					g.fillRect(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
					g.setColor(new Color(255, 0, 0));
					g.fillOval(j*TILESIZE, i*TILESIZE, TILESIZE, TILESIZE);
				}
			}
		}
		
	}
	public Tile getPosSortie(){
		return this.PosSortie;
	}
	public Tile getPosEntry(){
		return this.PosEntry;
	}
	
}//End of Grid Class


