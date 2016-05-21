package fr.iutvalence.info.dut.m2107;


public class Character {

	private Tile pos;
	private Tile mov;

	/**
	 * 
	 * @param mov
	 */
	public boolean checkMov(Tile mov) {
		// TODO - implement Character.checkMov
		throw new UnsupportedOperationException();
	}

	/**
	 * @return the pos
	 */
	public Tile getPos() {
		return pos;
	}

	/**
	 * @param pos the pos to set
	 */
	public void setPos(Tile pos) {
		this.pos = pos;
	}

	/**
	 * @return the mov
	 */
	public Tile getMov() {
		return mov;
	}

	/**
	 * @param mov the mov to set
	 */
	public void setMov(Tile mov) {
		this.mov = mov;
	}

}