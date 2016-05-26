package fr.iutvalence.info.dut.m2107;


public class Grid {

	Tile[] tabgrid;
	private int nbCol;
	private int nbLig;
	public Tile[][] map;
	public static final int MAX_LENGTH_DEFAULT=40;
	public static final int MAX_WIDTH_DEFAULT=40;
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Grid() {
		// TODO - implement Grid.Grid
		map = new Tile[nbCol][nbLig];
		for (int i=0; i<MAX_LENGTH_DEFAULT; i++) {
			for (int j=0; j<MAX_WIDTH_DEFAULT; j++) { 
				
				
			}
		}
			
		throw new UnsupportedOperationException();
	
		
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void getTile(float x, float y) {
		// TODO - implement Grid.getTile
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
	public boolean inGrid(float x, float y) {
		// TODO - implement Grid.inGrid
		throw new UnsupportedOperationException();
	}

}
/* Je suis une coccinnelle */