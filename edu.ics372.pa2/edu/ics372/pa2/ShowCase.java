package edu.ics372.pa2;

/**
 * This class handles the ShowCase object.
 * This class is a subclass to MuseumEntity.
 * A ShowCase can hold a collection of Document object,
 * and is stored in an ArrayList showCaseExhibits.
 * 
 * @author Mohamed Mahdy
 */
import java.util.ArrayList;
import java.util.List;

public class ShowCase extends MuseumEntity {

	private List<Exhibit> showCaseExhibits = new ArrayList<Exhibit>();
	Room destination;

	/**
	 * Creates a ShowCase object
	 * 
	 * @param name of the ShowCase object
	 */
	public ShowCase(String name) {
		super(name);
	}

	/**
	 * Adds a document to the SshowCaseExhibits list
	 * 
	 * @param document object
	 */
	public void addExhibit(Document document) {
		showCaseExhibits.add(document);
	}

	/**
	 * Sets a room and adds the ShowCase to a list of ShowCases
	 * 
	 * @param Room destination
	 */
	public void setRoom(Room destination) {
		this.destination = destination;
		destination.addShowCase(this);
	}

	@Override
	public List<Exhibit> getExhibits() {
		return showCaseExhibits;
	}

	@Override
	public String toString() {
		return this.name + " in room " + this.destination;
	}

}
