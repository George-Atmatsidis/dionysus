/* 	Dionysus, a student pub management software in Java
    Copyright (C) 2011,2013  podgy_piglet

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. 
*/

package fr.dionysus.database;


public interface Database {

	/**
	 * Initializes DB with the binary data from a given file
	 * @param filename path to the file to be used
	 */
	public void createFromTextFile(String filename);
	
	/**
	 * Saves the database content to a binary (and not text, despite the name) file
	 */
	public void saveToTextFile();
	
	/**
	 * Returns the data array which is at the heart of the database
	 * An ArrayList might be better suited for this purpose
	 * @return
	 */
	public Object [] getArray();
	
	/**
	 * Generates an array compliant with a display in a JTable component
	 * @return an Object array
	 */
	public Object [][] getArrayForTables();
	
	/**
	 * Generates the array required for display
	 */
	public void makeArrayForTables();
}