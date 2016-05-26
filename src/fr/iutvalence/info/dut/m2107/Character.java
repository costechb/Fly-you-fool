package fr.iutvalence.info.dut.m2107;


public class Character {

	private static Tile pos;
	private static Tile mov;
	

	public Character(int x, int y) {
		// TODO Auto-generated constructor stub
		//
	}

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
	public static Tile getPos() {
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