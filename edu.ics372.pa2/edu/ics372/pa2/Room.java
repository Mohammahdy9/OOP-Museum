package edu.ics372.pa2;

/**
 * This class handles everything with the Room object.
 * This class is a subclass of MuseumEntity.
 * Each room contains walls, that are stored in an ArrayList wallList
 * Each room contains Exhibits, that are stored in an ArrayList roomExhibits
 * Each rooms contains showCases, that are stored in an ArrayList showCases
 * 
 * @author Mohamed Mahdy
 */
import java.util.ArrayList;
import java.util.List;

public class Room extends MuseumEntity {

	private List<Wall> wallList = new ArrayList<Wall>();
	private List<Exhibit> roomExhibits = new ArrayList<Exhibit>();
	private List<ShowCase> showCases = new ArrayList<ShowCase>();

	/**
	 * Creates the room object
	 * 
	 * @param Name of the room
	 */
	public Room(String name) {
		super(name);
	}

	public List<Wall> getWallsInRoom() {
		return wallList;
	}

	public List<ShowCase> getShowCasesInRoom() {
		return showCases;
	}

	public List<Exhibit> getRoomExhibits() {
		return roomExhibits;
	}

	/**
	 * Adds a wall to a room
	 * 
	 * @param Name of the newly added wall
	 * @return the newly added wall
	 */
	public Wall addWall(String name) {
		Wall addedWall = new Wall(name);
		wallList.add(addedWall);
		return addedWall;
	}

	/**
	 * Adds a ShowCase to a room
	 * 
	 * @param showCase to be added
	 * @return the newly added showCase
	 */
	public ShowCase addShowCase(ShowCase showCase) {
		showCases.add(showCase);
		return showCase;
	}

	/**
	 * Adds an exhibit to a room
	 * 
	 * @param exhibit to be added
	 */
	public void addExhibit(Exhibit exhibit) {
		roomExhibits.add(exhibit);

	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public List<Exhibit> getExhibits() {
		List<Exhibit> exhibits = new ArrayList<Exhibit>();

		for (Wall wall : wallList) {

			exhibits.addAll(wall.getExhibits());

		}
		for (ShowCase showCase : showCases) {
			exhibits.addAll(showCase.getExhibits());
		}

		exhibits.addAll(roomExhibits);
		return exhibits;
	}

}
