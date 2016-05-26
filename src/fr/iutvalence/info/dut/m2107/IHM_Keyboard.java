package fr.iutvalence.info.dut.m2107;



public class IHM_Keyboard {
	
	private Grid map;
	private Hero hero;
	
	

	/**
	 * 
	 * @param map
	 * @param hero
	 */
	public IHM_Keyboard(Grid map, Hero hero)  { 
		// TODO - implement IHM_Keyboard.IHM_Keyboard
		
		
		this.map = map;
		this.hero = hero;	
	}
	
	/**
	 * 
	 * @param letter
	 */
	public void moveHero(char letter) throws IHM_KeyboardException {
		// TODO - implement IHM_Keyboard.moveHero
		
		// R�cup�rer la position du h�ro
		Tile tile = this.hero.getPos();
		// Utiliser le scanner dans le main, r�cup�rer la touche saisi et la passer en param�tre de movehero
		switch (letter) {
		
		case 'z':
			// Avancer d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveForward = this.map.getTile( tile.getX() + 1, tile.getY());
			// On appelle la m�thode de la v�rification de la case
			if (this.hero.checkMov(tileToMoveForward)) {
				// On lance le d�placement du h�ro
				this.hero.moveHero(tileToMoveForward);
				
			} else {
				// La case n'est pas libre
			}
			break;
		
		case 'q': 
			
			// Aller � gauche d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveLeft = this.map.getTile( tile.getX() , tile.getY() + 1 );
			// On appelle la m�thode de la v�rification de la case
			if (this.hero.checkMov(tileToMoveLeft)) {
				// On lance le d�placement du h�ro
				this.hero.moveHero(tileToMoveLeft);
				
			} else {
				// La case n'est pas libre
			}
			break;
			
		case 's':
			
			//Reculer d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveBackward = this.map.getTile( tile.getX() - 1 , tile.getY()  );
			// On appelle la m�thode de la v�rification de la case
			if (this.hero.checkMov(tileToMoveBackward)) {
				// On lance le d�placement du h�ro
				this.hero.moveHero(tileToMoveBackward);
				
			} else {
				// La case n'est pas libre
			}
			break;
			
		case 'd': 
			
			// Aller � droite d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveRight = this.map.getTile( tile.getX()  , tile.getY() - 1);
			// On appelle la m�thode de la v�rification de la case
			if (this.hero.checkMov(tileToMoveRight )) {
				// On lance le d�placement du h�ro
				this.hero.moveHero(tileToMoveRight );
				
			} else {
				// La case n'est pas libre
			}
			
			
			break;

		default: 
			// Dans le cas ou la lettre re�u n'est pas valide, on l�ve une exception
			throw new IHM_KeyboardException();	
		}	
	}
	
	/**
	 * @return the map
	 */
	public Grid getMap() {
		return map;
	}
	
	/**
	 * @param map the map to set
	 */
	public void setMap(Grid map) {
		this.map = map;
	}
	
	/**
	 * @return the hero
	 */
	public Hero getHero() {
		return hero;
	}

	/**
	 * @param hero the hero to set
	 */
	public void setHero(Hero hero) {
		this.hero = hero;
	}
}