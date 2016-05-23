package fr.iutvalence.info.dut.m2107;


public class Character {

	private Tile pos;
	private Tile mov;

	/**
	 * 
	 * @param mov
	 */
	public boolean checkMov(Tile mov) {
		// Check cell is empty
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

	public void moveCharacter(Character charac, Tile pos) {
		checkMov(pos);
		
		throw new UnsupportedOperationException();
	}
	
	public void stopCharacter() {
		
		throw new UnsupportedOperationException();
	}

	
}