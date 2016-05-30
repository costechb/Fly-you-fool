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
	
	//J'ai enlevé le posHero, la position est dans Grid au début du jeu
    public Game() {
		this.map= new Grid();
		this.enemies=new ArrayList<Enemy>();
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


		}
}