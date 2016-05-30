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
	
	
	/**
	 * CECI EST A BUT DE TEST
	 * VOUS POUVEZ FAIRE RUN
	 * C EST POUR COMPRENDRE COMMENT AFFICHER DES TRUCS EN JAVA DE MANIERE FACILE
	 */
	int x = 0;
    int y = 0;

    @SuppressWarnings("unused")
	private void moveBall() {
        x = x + 1;
        y = y + 1;
    }
    
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
        this.map.initWorld();
        this.map.buildWorld(g2d);
    }
	
	//J'ai enlevé le posHero, la position est dans Grid au début du jeu
    public Game() {
		this.map= new Grid();
		this.enemies=new ArrayList<Enemy>();
		map.initWorld();
	}

	public void run() throws InterruptedException {

		}
}