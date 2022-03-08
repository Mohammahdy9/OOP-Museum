package edu.ics372.pa2;

/**
 * This is a class that will handle all things with the Sculpture object. This
 * class is a subclass of Exhibit. This class will hold a Room in the variable
 * destination
 * 
 * @author Mohamed Mahdy
 */
public class Sculpture extends Exhibit {

	Room destination;

	/**
	 * Creates a Sculpture object
	 * 
	 * @param name
	 * @param artist
	 * @param year
	 * 
	 */
	public Sculpture(String name, String artist, int year) {
		super(name, artist, year);

	}

	/**
	 * Sets a room and adds the Sculpture to a list of Exhibits
	 * 
	 * @param Wall destination
	 */
	public void setRoom(Room destination) {
		this.destination = destination;
		destination.addExhibit(this);
	}

	@Override
	public String toString() {
		return "Sculpture Exhibit " + super.toString() + " " + this.destination;
	}

	public Room getDestination() {
		return this.destination;
	}
}
