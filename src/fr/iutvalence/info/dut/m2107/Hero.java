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

}

/*
//R�cup�rer la position du h�ro
Tile tile = this.hero.getPos();
//Utiliser le scanner dans le main, r�cup�rer la touche saisi et la passer en param�tre de movehero
switch (Move) {

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
	//TODO: utiliser Grid, les tile n'ont pas de coordonn�es
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
	//TODO: utiliser Grid, les tile n'ont pas de coordonn�es
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
}	*/