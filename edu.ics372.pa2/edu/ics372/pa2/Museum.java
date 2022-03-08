package edu.ics372.pa2;

/**
 *This class handles the Museum object. 
 *This class is a subclass of Entity.
 *The Museum object contains rooms, walls, showcases, and exhibits and is stored in an ArrayList roomList
 *
 * @author Mohamed Mahdy
 */
import java.util.ArrayList;
import java.util.List;

public class Museum extends MuseumEntity {
	private List<Room> roomList = new ArrayList<Room>();

	/**
	 * Creates the Museum object
	 * 
	 * @param Name of the museum
	 */
	public Museum(String name) {
		super(name);
	}

	/**
	 * Adds a room to the Museum
	 * 
	 * @param name of the newly added room
	 * @returns the newly added room
	 */
	public Room addRoom(String name) {
		Room addedRoom = new Room(name);
		roomList.add(addedRoom);
		return addedRoom;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public List<Exhibit> getExhibits() {

		List<Exhibit> exhibits = new ArrayList<Exhibit>();
		for (Room room : roomList) {
			for (ShowCase showCase : room.getShowCasesInRoom()) {
				exhibits.addAll(showCase.getExhibits());
			}
			for (Wall wall : room.getWallsInRoom()) {
				for (Exhibit exhibit : wall.getExhibits()) {
					exhibits.add(exhibit);
				}
				for (Exhibit exhibit : room.getRoomExhibits()) {
					exhibits.add(exhibit);
				}
			}
		}

		return exhibits;
	}

}
