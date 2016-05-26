package fr.iutvalence.info.dut.m2107;

import java.awt.Image;


public class Character {

	private Tile pos;
	private Tile mov;
	private Hero hero;
	
	/**
	 * The image of the character
	 */
	private Image image;
	
	public Character(int x, int y) {
		// TODO Auto-generated constructor stub
		//
	}

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
	
	/**
	 * To get the image of the character
	 */
	public Image getImage() {
        return this.image;
    }
	/**
	 * To set the image of the character
	 * @param img
	 */
    public void setImage(Image img) {
        image = img;
    }

}