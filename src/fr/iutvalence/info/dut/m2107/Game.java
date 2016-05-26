package fr.iutvalence.info.dut.m2107;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game extends JPanel {

	private Hero hero;
	private ArrayList<Enemy> enemies;
	Grid map;
	protected IHM_Keyboard keyboard;
	private IHM_View display;
	
	
	/**
	 * CECI EST A BUT DE TEST
	 * VOUS POUVEZ FAIRE RUN
	 * C EST POUR COMPRENDRE COMMENT AFFICHER DES TRUCS EN JAVA DE MANIERE FACILE
	 * 
	 * 
	 * 
	 * 
	 */
	int x = 0;
    int y = 0;

    private void moveBall() {
        x = x + 1;
        y = y + 1;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

	
	
	//J'ai enlevé le posHero, la position est dans Grid au début du jeu
    @SuppressWarnings("serial")
	public Game() {
		this.map= new Grid();
		this.enemies=new ArrayList<Enemy>();
		map.initWorld();
		
	}

	public void play() {

	}

	
	//J'ai supprimé le Main et je l'ai mis là, ça sert a rien d'avoir un Game et un Main ou il y a rien
	public static void main(String[] args) throws InterruptedException {
		JFrame myFrame = new JFrame("Fly you Fools");
		Game game = new Game();
		myFrame.add(game);
		myFrame.setSize(500,500);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }

		/**
		game.play();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char Move = str.charAt(0);
		*/
	
	
}
	
}