/**Program g³ówny rozpoczynaj¹cy dzia³anie aplikacji rysuj¹cej drzewa.
 * 
 * @author Dorota
 * @version 2.0 (23-15-2017)
 */
public class Zadanie_JavaDev {
	
public static void main(String[] args) {
		System.out.println("Witam w programie rysuj¹cym drzewa.");
		System.out.println("Aby narysowaæ drzewo, musisz podaæ dane.");
		
		Input in = new Input();
		in.startInput();
			
		TreeBuilder zadanie = new TreeBuilder();
		zadanie.drawTree(in.inputLev, in.inputDir);
		}
}

	
	


