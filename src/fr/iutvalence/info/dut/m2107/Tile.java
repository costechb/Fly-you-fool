package fr.iutvalence.info.dut.m2107;



public class Tile {
	
	
	/**
	 * The character on the tile
	 */
	Character occupant=null;
	
	// Tilesize : taille de la tuile niveau graphique, en px
	private int TILESIZE = 20;
	
	
	
	
	// J'ai renommé occuped en solid, en effet, une case occupée est solide mais toute les cases solides ne sont pas occupée par un personnage
	//pour savoir si une case est occupée--> tile.occupant!=null
	// j'ai corrigé en conséquence la méthode isOccuped(), qui est donc toujours utilisable
	private boolean solid=false;
	
	
	// Je crois que x et y ne servent à rien, les coordonnées de la tile sont dans Grid exemple: Grid[i][j]= une tile
	// Ce qui caractérise une tile c'est son image, sa taille, son caractère solide ou non, ainsi que son occupant
	//Ce n'est pas une tile qu'on déplace ce sont les character qui changent de tile
	//private int x;
	//private int y;

	/**
	 * @return the x
	 */
	//public int getX() {
	//	return x;
	//}
	
	/**
	 * @param x the x to set
	 */
	//public void setX(int x) {
	//	this.x = x;
	//}
	
	/**
	 * @return the y
	 */
	//public int getY() {
	//	return y;
	//}
	
	/**
	 * @param y the y to set
	 */
	//public void setY(int y) {
	//	this.y = y;
	//}
	/**
	 * @return the occupant
	 */
	
	
	
	
	public Character getOccupant() {
		return occupant;
	}

	/**
	 * @param occupant the occupant to set
	 */
	public void setOccupant(Character occupant) {
		this.occupant = occupant;
	}


	/**
	 * 
	 * @param x
	 * @param y
	 * @param occupation
	 * Pour définir une case avec un Character
	 */
	public Tile(boolean b, Character occupant){
		//this.x=x;
		//this.y=y;
		this.solid=b;
		this.occupant=occupant;
		

	}
	/**
	 * Pour définir une case sans Character
	 * @param b
	 */
	public Tile(boolean b) {
		this.solid=b;
		this.occupant=null;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "Tile [occupant=" + occupant + ", TILESIZE=" + TILESIZE	+ ", occuped=" + solid + "]";
	}
	
	public void showTile() {
		// TODO - implement Tile.showTile
		throw new UnsupportedOperationException();
	}
	
	
	
	/**
	 * Tells if there is a character in the tile
	 * @return
	 */
	public boolean isOccuped() {
		return this.occupant!=null;
		}


	/**
	 * @return the solid
	 */
	public boolean isSolid() {
		return solid;
	}

	/**
	 * @param b, the solid to set
	 */
	public void setSolid(boolean b) {
		this.solid = b;
	}

}
