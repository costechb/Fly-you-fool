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
	private IHM_Keyboard keyboard;
	private IHM_View display;
	private Tile posSortie;
	
    @Override
    /**
     * méthode obligatoire pour dessiner des trucs
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
		  * Hugo : Algo du déroulement d'un tour, du jeu etc
		  * ceci est sujet à changement(s)
		  * 
		  * lancer la boucle d'un tour de jeu (tant que la posHero n'est pas la posSortie ou que la posHero n'est pas dans les posChampDeVision)
		  * 	demander au joueur la direction qu'il veut
		  * 	enregistrer cette nouvelle position comme sa prochaine position
		  * 	faire pareil avec les ennemis
		  * 	actualiser les positions de tout le monde
		  * 	réafficher la carte
		  * fin de la boucle d'un tour
		  * selon la position
		  * 	sortie : afficher VICTORY
		  * 	champDeVision : afficher YOU LOOSE
		  * fin de la methode
		  */

		/*
		 * the turn loop
		 */
		while(hero.getPos()!=posSortie && !hero.isCaught()) {
			System.out.println("\n Press the direction you want to go by, or Spacebar if you want to stay at your position  \n");
			char direction = keyboard.readkey();
			//System.out.println("\n TESTS : you will now have your mov changed ! \n");
			hero.moveHero(direction);
			//System.out.println("\n TESTS : you have mov changed ! \n");
			
			enemies.forEach(enemy->enemy.moveEnemy());
			
			hero.setPos(hero.getMov());
			enemies.forEach(enemy->enemy.setPos(enemy.getMov()));
			display.showMap(map);
		}
		if(hero.getPos()==posSortie){
			System.out.println("\n YOU WON \n");
		}
		else if (hero.isCaught()){
			System.out.println("\n YOU LOOSE \n");
		}
    }
}
