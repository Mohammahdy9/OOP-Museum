package edu.ics372.pa2;

/**
 * This class handles the Exhibit object. This is a superclass to other
 * subclasses.
 * 
 * @author Mohamed Mahdy
 *
 */
public class Exhibit {

	String name;
	String artist;
	int year;

	/**
	 * Creates an Exhibit object
	 * 
	 * @param name   of the exhibit
	 * @param artist of the exhibit
	 * @param year   made of the exhibit
	 */
	public Exhibit(String name, String artist, int year) {
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "[name=" + this.getName() + ", artist=" + this.getArtist() + ", year=" + this.getYear() + "] ";

	}
}
