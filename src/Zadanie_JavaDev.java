/**Program g��wny rozpoczynaj�cy dzia�anie aplikacji rysuj�cej drzewa.
 * 
 * @author Dorota
 * @version 2.0 (23-15-2017)
 */
public class Zadanie_JavaDev {
	
public static void main(String[] args) {
		System.out.println("Witam w programie rysuj�cym drzewa.");
		System.out.println("Aby narysowa� drzewo, musisz poda� dane.");
		
		Input in = new Input();
		in.startInput();
			
		TreeBuilder zadanie = new TreeBuilder();
		zadanie.drawTree(in.inputLev, in.inputDir);
		}
}

	
	


