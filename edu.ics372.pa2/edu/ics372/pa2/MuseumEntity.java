package edu.ics372.pa2;

/**
 * This is an abstract class that handles a MuseumEntity object This class
 * implements the Entity interface This class is a superclass to subclasses in
 * this program
 * 
 * @author Mohamed Mahdy
 *
 */

public abstract class MuseumEntity implements Entity {

	String name;

	/**
	 * Creates a MuseumEntity
	 * 
	 * @param name of Entity
	 */
	public MuseumEntity(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
