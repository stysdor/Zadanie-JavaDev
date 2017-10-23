/**Klasa InputValidation sprawdza poprawno�� wprowadzonych przez u�ytkownika danych.
 * Gdy dane s� poprawne tworzy obiekt TreeBuilder i ustawia
 * 
 * @author Dorota
 * @version 1.0 (23-10-2017)
 *
 */
public class InputValidation {
	
	public static boolean check(int level, int direction) {
		
		boolean isCorrect = false;
		if ( level > 0 && (direction == 1 || direction == 2)) {
			isCorrect = true;
		}
		
		return isCorrect;
	}
}
