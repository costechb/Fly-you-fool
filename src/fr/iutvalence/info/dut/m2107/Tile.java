package fr.iutvalence.info.dut.m2107;



public class Tile {

	Character occupant;
	// Tilesize : taille de la tuile niveau graphique
	private int TILESIZE = 32;
	private boolean occuped;
	private int x;
	private int y;

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
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param solid
	 */
	public Tile(int x, int y, boolean solid) {
		
		throw new UnsupportedOperationException();
	}

	public void showTile() {
		// TODO - implement Tile.showTile
		throw new UnsupportedOperationException();
	}

	public boolean isOccuped() {
		return this.occuped;
		
	}

	/**
	 * 
	 * @param occuped
	 */
	public void setOccuped(boolean occuped) {
		this.occuped = occuped;
	}

}