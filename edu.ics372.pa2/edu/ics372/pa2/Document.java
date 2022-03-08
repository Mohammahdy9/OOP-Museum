package edu.ics372.pa2;

/**
 * This class handles the Document object. This is a subclass of Exhibit. the
 * destination variable holds a ShowCase that the document will be held in
 * 
 * @author Mohamed Mahdy
 *
 */
public class Document extends Exhibit {

	ShowCase destination;

	/**
	 * Creates a Document object
	 * 
	 * @param name   of the document
	 * @param artist of the document
	 * @param year   made of the document
	 */
	public Document(String name, String artist, int year) {
		super(name, artist, year);
	}

	/**
	 * Sets the ShowCase that the document will be stored in and adds it to a list
	 * off Documents in ShowCase
	 * 
	 * @param destination
	 */
	public void setShowCase(ShowCase destination) {
		this.destination = destination;
		destination.addExhibit(this);
	}

	@Override
	public String toString() {
		return "Document Exhibit " + super.toString() + "in ShowCase " + this.destination;
	}

	public ShowCase getShowCase() {
		return this.destination;
	}
}
