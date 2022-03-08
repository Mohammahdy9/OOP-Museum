package edu.ics372.pa2;

public class Main {

	public static void main(String[] args) {

		Museum museum = new Museum("M1");
		Room room1 = museum.addRoom("r1");
		Room room2 = museum.addRoom("r2");
		Painting painting1 = new Painting("p1", "a1", 1765);
		Painting painting2 = new Painting("p2", "a2", 1812);
		Wall wall1 = room1.addWall("w1");
		Wall wall2 = room2.addWall("w2");
		ShowCase showCase = new ShowCase("showcase1");
		showCase.setRoom(room1);
		Document document = new Document("d1", "w1", 1800);
		document.setShowCase(showCase);
		Sculpture sculpture = new Sculpture("s1", "a3", 1300);
		sculpture.setRoom(room1);
		painting1.setWall(wall1);
		painting2.setWall(wall2);
		System.out.println(painting1.getWall());
		System.out.println(wall1.getExhibits());
		System.out.println(wall2.getExhibits());
		System.out.println(room1.getExhibits());
		System.out.println(room2.getExhibits());
		System.out.println(museum.getExhibits());
		MuseumEntity a;

		Entity a1 = new Room(null);
	}

}
