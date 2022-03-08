package edu.ics372.pa2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class handles everything with the Wall object. This is a subclass of
 * MuseumEntity. The Wall object contains exhibits that are stored in an
 * ArrayList wallExhibits.
 * 
 * @author Mohamed Mahdy
 *
 */
public class Wall extends MuseumEntity {

	private List<Exhibit> wallExhibits = new ArrayList<Exhibit>();

	/**
	 * Creates a wall object
	 * 
	 * @param Name of wall
	 */
	public Wall(String name) {
		super(name);
	}

	/**
	 * Adds an Exhibit to a wall
	 * 
	 * @param Exhibit to be added
	 */
	public void addExhibit(Exhibit exhibit) { // Assuming all exhibits can be on a wall, rather than just a painting {
		wallExhibits.add(exhibit);
	}

	@Override
	public String toString() {
		return "wall " + this.name;
	}

	@Override
	public List<Exhibit> getExhibits() {
		return wallExhibits;
	}
}
