package fr.iutvalence.info.dut.m2107;


public class Hero extends Character {

	
	public Hero(Tile pos) {
		super(pos);
	}

	public void afficheHero() {
		
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
		// J'ai change le parametre letter en tile
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

	//méthode mise ici par Hugo qui renvoit vrai si le héro est sur une case du champ de vision d'un ennemis et faux dans le cas contraire. gl & hf
	public boolean isCaught(Hero hero) {
		// TODO Auto-generated method stub
		return false;
	}

	public void moveHero(char direction) {
		// TODO Auto-generated method stub
		
	}

	public boolean isCaught() {
		// TODO Auto-generated method stub
		return false;
	}



	public void moveHeroTile(){
		int i=0, j=0;
		char direction;
		//Utiliser le scanner dans le main, récupérer la touche saisi et la passer en paramètre de movehero
		if(direction=='z') {
				// Avancer d'une case
				// Récupérer la case sur laquelle on veut se déplacer
				Tile tileToMoveForward = setPos( i+1 , j);	
				
				// On appelle la méthode de la vérification de la case
				if (checkMov(tileToMoveForward)==true) {
					// On lance le déplacement du héro
					moveHero(tileToMoveForward);
					
				} else {
					// La case n'est pas libre
				}
		}
		if(direction=='q') {
			// Avancer d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			Tile tileToMoveLeft = setPos( i , j+1 );	
			
			// On appelle la méthode de la vérification de la case
			if (checkMov(tileToMoveLeft)==true) {
				// On lance le déplacement du héro
				moveHero(tileToMoveLeft);
				
			} else {
				// La case n'est pas libre
			}
		}
		if(direction=='s') {
			// Avancer d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			Tile tileToMoveBackward = setPos( i-1 , j );	
			
			// On appelle la méthode de la vérification de la case
			if (checkMov(tileToMoveBackward)==true) {
				// On lance le déplacement du héro
				moveHero(tileToMoveBackward);
				
			} else {
				// La case n'est pas libre
			}
		}
		if(direction=='d') {
			// Avancer d'une case
			// Récupérer la case sur laquelle on veut se déplacer
			Tile tileToMoveRight = setPos( i , j-1);	
			
			// On appelle la méthode de la vérification de la case
			if (checkMov(tileToMoveRight)==true) {
				// On lance le déplacement du héro
				moveHero(tileToMoveRight);
				
			} else {
				// La case n'est pas libre
			}
		}
	}
}