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

	//m�thode mise ici par Hugo qui renvoit vrai si le h�ro est sur une case du champ de vision d'un ennemis et faux dans le cas contraire. gl & hf
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
		//Utiliser le scanner dans le main, r�cup�rer la touche saisi et la passer en param�tre de movehero
		if(direction=='z') {
				// Avancer d'une case
				// R�cup�rer la case sur laquelle on veut se d�placer
				Tile tileToMoveForward = setPos( i+1 , j);	
				
				// On appelle la m�thode de la v�rification de la case
				if (checkMov(tileToMoveForward)==true) {
					// On lance le d�placement du h�ro
					moveHero(tileToMoveForward);
					
				} else {
					// La case n'est pas libre
				}
		}
		if(direction=='q') {
			// Avancer d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveLeft = setPos( i , j+1 );	
			
			// On appelle la m�thode de la v�rification de la case
			if (checkMov(tileToMoveLeft)==true) {
				// On lance le d�placement du h�ro
				moveHero(tileToMoveLeft);
				
			} else {
				// La case n'est pas libre
			}
		}
		if(direction=='s') {
			// Avancer d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveBackward = setPos( i-1 , j );	
			
			// On appelle la m�thode de la v�rification de la case
			if (checkMov(tileToMoveBackward)==true) {
				// On lance le d�placement du h�ro
				moveHero(tileToMoveBackward);
				
			} else {
				// La case n'est pas libre
			}
		}
		if(direction=='d') {
			// Avancer d'une case
			// R�cup�rer la case sur laquelle on veut se d�placer
			Tile tileToMoveRight = setPos( i , j-1);	
			
			// On appelle la m�thode de la v�rification de la case
			if (checkMov(tileToMoveRight)==true) {
				// On lance le d�placement du h�ro
				moveHero(tileToMoveRight);
				
			} else {
				// La case n'est pas libre
			}
		}
	}
}