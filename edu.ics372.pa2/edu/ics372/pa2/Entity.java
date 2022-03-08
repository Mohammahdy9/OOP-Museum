package edu.ics372.pa2;

import java.util.List;

/**
 * This is an Interface class that holds the following methods: getName()
 * getExhibits();
 * 
 * @author Mohamed Mahdy
 */
public interface Entity {

	/**
	 * This class will get a name of an Entity
	 * 
	 * @returns name of the Entity
	 */
	public String getName();

	/**
	 * This class will get all Exhibits
	 * 
	 * @returns a list of exhibits
	 */
	public List<Exhibit> getExhibits();

}
