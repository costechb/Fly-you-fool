package fr.iutvalence.info.dut.m2107;


public class Tile {

	Character occupant;
	private int TILESIZE = 32;
	private boolean occuped;
	private int x;
	private int y;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param solid
	 */
	public Tile(int x, int y, boolean solid) {
		// TODO - implement Tile.Tile
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		
		return "Tile [occupant=" + occupant + ", TILESIZE=" + TILESIZE	+ ", occuped=" + occuped + ", x=" + x + ", y=" + y + "]";
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