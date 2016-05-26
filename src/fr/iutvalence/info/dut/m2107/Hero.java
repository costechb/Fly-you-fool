package fr.iutvalence.info.dut.m2107;


public class Hero extends Character {

	
	public Hero(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void afficheHero() {
		// TODO - implement Hero.afficheHero
		//Character.getPos();
		throw new UnsupportedOperationException();
		
	}

	/**
	 * 
	 * @param tile
	 */
	public void moveHero(Tile tile) {
		// TODO - implement Hero.moveHero

		this.setMov(tile);	
		throw new UnsupportedOperationException();
		// J'ai chang� le param�tre letter en tile
		// Pour prendre sa position et lui en attribuer une nouvelle
		

	}

	/**
	 * 
	 * @param letter
	 */
	public void stopHero(char letter) {
		// TODO - implement Hero.stopHero
		
		throw new UnsupportedOperationException();
	}

}
