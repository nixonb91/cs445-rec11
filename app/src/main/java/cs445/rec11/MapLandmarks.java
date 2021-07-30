package cs445.rec11;

import java.lang.Math;
import java.util.Iterator;

/**
 A class to demonstrate the usage of dictionaries methods,
 it uses keys as Tuples to map landmarks. 
 @author William C. Garrison III
 @author Brian T. Nixon
 @author Norhan Abbas
 */


public class MapLandmarks<V> extends HashingDictionary<Tuple, V>{

		public MapLandmarks(){
			// invoke HashingDictionary constructor
			super();
		} 

		/**
		 * Adds a new landmark and tuple of coordinates to the hashingdictionary
		 * @param value the value of the landmark
		 * @param firstComponent the first component of the coordinate
		 * @param secondComponent the second component of the coordinate
		 */
		public void addLandmark(V value, double firstComponent, double secondComponent){
			// TODO: implement this method 
			// to add a pair of a landmark and its key (which has 2 components)
		}

		/**
		 * Removes a landmark at the specified coordinate
		 * @param firstComponent the first component of the coordinate
		 * @param secondComponent the second component of the coordinate
		 * @return returns the removed landmark value of the specified coordinates
		 */
		public V remove(double firstComponent, double secondComponent) {
			Tuple keyToFind = new Tuple(firstComponent, secondComponent);
			return super.remove(keyToFind);
		}

		/**
		 * Removes the first instance of a specified landmark value
		 * Consider: Why are we unable to remove all cases of value here?
		 * @param value the landmark value to remove
		 */
		public void removeLandmark(V value){
			// TODO: implement this method using itertors to remove a landmark
		}

		/**
		 * Retrieves the landmark value for a specific coordinate
		 * @param firstComponent first component of the coordinate
		 * @param secondComponent second component of the coordinate
		 * @return the associated value for the specified coordinate
		 */
		public V getValue(double firstComponent, double secondComponent) {
			Tuple keyToGet = new Tuple(firstComponent, secondComponent);
			return super.getValue(keyToGet);
		}

		/**
		 * Checks if a specified coordinate contains a landmark value
		 * @param firstComponent the first component of the coordinate
		 * @param secondComponent the second component of the coordinate
		 * @return true if the coordinate exists in dictionary, false otherwise
		 */
		public boolean containsCoordinate(double firstComponent, double secondComponent) {
			Tuple keyToCheck = new Tuple(firstComponent, secondComponent);
			return super.contains(keyToCheck);
		}

		/**
		 * Prints all of the landmarks and their associated coordinates to the console
		 */
		public void printAllLandmarks(){
			// TODO: implement this method to print all landmarks in your dictionary
		}
}
