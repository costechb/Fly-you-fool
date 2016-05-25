package fr.iutvalence.info.dut.m2107;

import java.util.ArrayList;

public class Grid {

	Tile[] tabgrid;
	private int nbCol;
	private int nbLig;
	private final int OFFSET = 30;
	private final int SPACE = 20;
	private int width = 0;
    private int height = 0;
	
	private ArrayList walls = new ArrayList();
	private ArrayList areas = new ArrayList();
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Grid(int x, int y) {
		// TODO - implement Grid.Grid
		throw new UnsupportedOperationException();
	}

	
	private String level1 =
            "################\n"
		   +"###            #\n"
		   +"#              #\n"
		   +"#     #####    #\n"
		   +"#     #####    #\n"
		   +"#     #####   x#\n"
		   +"#    @#####    #\n"
		   +"#    ######    #\n"
		   +"#  x ######    #\n"
		   +"##00########00##\n";
	// #:murs
	// @:personnage
	// x:ennemi
	// 0:porte de sortie
	// la porte a coté du héro est inaccessible a cause de l'ennemi,pour faire genre tutoriel
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Tile getTile(int x,  int y) {
		// TODO - implement Grid.getTile
		// j'ai changé le float en int puisque une tile est défini sur un int x et int y 
		throw new UnsupportedOperationException();
	}

	public int getNbCol() {
		return this.nbCol;
	}

	public int getNbLig() {
		return this.nbLig;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public boolean inGrid(int x, int y) {
		// TODO - implement Grid.inGrid
		throw new UnsupportedOperationException();
	}

	
public final void initWorld() {
        
        int x = OFFSET;
        int y = OFFSET;
        


        for (int i = 0; i < level1.length(); i++) {
        	
            char item = level1.charAt(i);
            Tile tile;
            if (item == '\n') {
                y += SPACE;
                if (this.width < x) {
                    this.width = x;
                }

                x = OFFSET;
            } else if (item == '#') {
                tile = new Tile(x, y, true);
                walls.add(tile);
                x += SPACE;
            } else if (item == '@') {
                Hero hero = new Hero(x, y);
                x += SPACE;
            } else if (item == ' ') {
                x += SPACE;
            }

            height = y;
        }
    }

	
	
	
}