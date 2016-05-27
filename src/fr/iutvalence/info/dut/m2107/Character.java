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

	public Character(Tile pos) {
		this.pos=pos;
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
	public  Tile getPos() {
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

	public void moveCharacter(Character charac, Tile pos) {
		checkMov(pos);
		
		throw new UnsupportedOperationException();
	}
	
	public void stopCharacter() {
		
		throw new UnsupportedOperationException();
	}
}

