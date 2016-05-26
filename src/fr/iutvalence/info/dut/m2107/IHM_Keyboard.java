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
	public void moveHero(char Move) throws IHM_KeyboardException {
		// TODO - implement IHM_Keyboard.moveHero
		
		// Récupérer la position du héro
		Tile tile = this.hero.getPos();
		// Utiliser le scanner dans le main, récupérer la touche saisi et la passer en paramètre de movehero
		switch (Move) {
		
		case 'z':
			// Avancer d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			Tile tileToMoveForward = this.map.getTile( tile.getX() + 1, tile.getY());
			// On appelle la méthode de la vérification de la case
			if (this.hero.checkMov(tileToMoveForward)) {
				// On lance le déplacement du héro
				this.hero.moveHero(tileToMoveForward);
				
			} else {
				// La case n'est pas libre
			}
			break;
		
		case 'q': 
			
			// Aller à gauche d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			Tile tileToMoveLeft = this.map.getTile( tile.getX() , tile.getY() + 1 );
			// On appelle la méthode de la vérification de la case
			if (this.hero.checkMov(tileToMoveLeft)) {
				// On lance le déplacement du héro
				this.hero.moveHero(tileToMoveLeft);
				
			} else {
				// La case n'est pas libre
			}
			break;
			
		case 's':
			
			//Reculer d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			//TODO: utiliser Grid, les tile n'ont pas de coordonnées
			Tile tileToMoveBackward = this.map.getTile( tile.getX() - 1 , tile.getY()  );
			// On appelle la méthode de la vérification de la case
			if (this.hero.checkMov(tileToMoveBackward)) {
				// On lance le déplacement du héro
				this.hero.moveHero(tileToMoveBackward);
				
			} else {
				// La case n'est pas libre
			}
			break;
			
		case 'd': 
			
			// Aller à droite d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			//TODO: utiliser Grid, les tile n'ont pas de coordonnées
			Tile tileToMoveRight = this.map.getTile( tile.getX()  , tile.getY() - 1);
			// On appelle la méthode de la vérification de la case
			if (this.hero.checkMov(tileToMoveRight )) {
				// On lance le déplacement du héro
				this.hero.moveHero(tileToMoveRight );
				
			} else {
				// La case n'est pas libre
			}
			
			
			break;

		default: 
			// Dans le cas ou la lettre reçu n'est pas valide, on lève une exception
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