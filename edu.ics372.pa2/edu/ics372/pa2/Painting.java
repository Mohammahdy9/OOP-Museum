package edu.ics372.pa2;

/**
 * This class handles everything with the Painting Object This class is a
 * subclass of Exhibit.
 * 
 * @author Mohamed Mahdy
 */

public class Painting extends Exhibit {

	Wall destination;

	/**
	 * Creates a painting object
	 * 
	 * @param name   of the painting object
	 * @param artist of the painting object
	 * @param year   of the painting object
	 */
	public Painting(String name, String artist, int year) {
		super(name, artist, year);
	}

	/**
	 * Set the wall destination for the painting
	 * 
	 * @param Wall destination for the painting
	 */
	public void setWall(Wall destination) {

		this.destination = destination;
		destination.addExhibit(this);
	}

	@Override
	public String toString() {
		return "Painting Exhibit " + super.toString() + this.destination;
	}

	public Wall getWall() {
		return this.destination;
	}
}
