package fr.iutvalence.info.dut.m2107;


public class Hero extends Character {

	public void afficheHero() {
		// TODO - implement Hero.afficheHero
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tile
	 */
	public void moveHero(Tile tile) {
		// TODO - implement Hero.moveHero
		// J'ai chang� le param�tre letter en tile
		// Pour prendre sa position et lui en attribuer une nouvelle
		this.setPos(tile);
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