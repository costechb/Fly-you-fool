package fr.iutvalence.info.dut.m2107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game extends JPanel {

	private Hero hero;
	private ArrayList<Enemy> enemies;
	private Grid map;
	protected IHM_Keyboard keyboard;
	private IHM_View display;
	private Tile posSortie;
	
    @Override
    /**
     * m�thode obligatoire pour dessiner des trucs
     * Il faut d'ailleurs utiliser repaint (qui utilise paint)
     */
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        this.map.buildWorld(g2d);
    }
	
    public Game() {
		this.map = new Grid();
		System.out.println("\n This is the level you will play on \n");
		System.out.println("You have to go on the target block at the end on the level \n");
		this.hero = new Hero();
		System.out.println("\n And this is your hero ! \n");
		this.enemies = new ArrayList<Enemy>();
		System.out.println("\n But there is some enemies that should not see you. Be careful ! \n");
	}
    
	private boolean moveH(Hero theHero, Tile theTile){
		
		return true;
	}
	
    public void run() throws InterruptedException {
    	//Create a window
    	JFrame myFrame = new JFrame("Fly you Fools");
    	Game game = new Game();
		 
		//Default window options
		myFrame.add(game);
		myFrame.setSize(750,750);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		 
		 /*
		  * Hugo : Algo du d�roulement d'un tour, du jeu etc
		  * ceci est sujet � changement(s)
		  * 
		  * lancer la boucle d'un tour de jeu (tant que la posHero n'est pas la posSortie ou que la posHero n'est pas dans les posChampDeVision)
		  * 	demander au joueur la direction qu'il veut
		  * 	enregistrer cette nouvelle position comme sa prochaine position
		  * 	faire pareil avec les ennemis
		  * 	actualiser les positions de tout le monde
		  * 	r�afficher la carte
		  * fin de la boucle d'un tour
		  * selon la position
		  * 	sortie : afficher VICTORY
		  * 	champDeVision : afficher YOU LOOSE
		  * fin de la methode
		  */

		 while(hero.getPos()!=posSortie && !hero.isCaught(hero)) {
			 System.out.println("\n Press the direction you want to go by, or Spacebar if you want to stay at your position  \n");
			 
			 char direction=keyboard.readKey();
			 
			 hero.moveHero();
			 
			 	enregistrer cette nouvelle position comme sa prochaine position
			 	faire pareil avec les ennemis
			 	actualiser les positions de tout le monde
			 	r�afficher la carte
		 }		 
		 selon la position
		 	sortie : afficher VICTORY
		 	champDeVision : afficher YOU LOOSE
		 fin de la methode
		  
		}
}
