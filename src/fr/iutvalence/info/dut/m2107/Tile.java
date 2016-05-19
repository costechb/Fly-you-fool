package fr.iutvalence.info.dut.m2107;

import javax.swing.JPanel;

public class Tile extends JPanel {

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