package fr.iutvalence.info.dut.m2107;


public class Character {

	private Tile pos;
	private Tile mov;

	/**
	 * 
	 * @param mov
	 */
	public boolean checkMov(Tile mov) {
		// TODO  Check cell is empty
		if(mov.isOccuped()){
			return false;
		}
		else{return true;}
		
	}
	public Tile getPos() {
		return pos;
	}

	public Tile getMov() {
		return mov;
	}

	public void setPos(Tile pos) {
		this.pos = pos;
	}

	public void setMov(Tile mov) {
		this.mov = mov;
	}

}