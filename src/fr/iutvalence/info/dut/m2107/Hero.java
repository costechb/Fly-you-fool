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
		// J'ai changï¿½ le paramï¿½tre letter en tile
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

}

/*
//Récupérer la position du héro
Tile tile = this.hero.getPos();
//Utiliser le scanner dans le main, récupérer la touche saisi et la passer en paramètre de movehero
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
}	*/