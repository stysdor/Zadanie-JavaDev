/**Klasa TreeBuilder rysuje drzewa.
 * 
 * @author Dorota
 * @version 2.0 (23-10-2017)
 *
 */
public class TreeBuilder {
	/*
	 * Metoda rysuj¹ca drzewo o zadanej wysokoœci i kierunku
	 * @param lev - liczba ca³kowita, wysokoœæ drzewa
	 * @parap dir - liczba ca³kowita, kierunek rysowania
	 */
	public void drawTree(int lev , int dir) {
		switch (dir) {
				//Rysowanie drzewa w kierunku UP
				case 1 : for( int i = lev - 1; i >= 0 ; i--) {
							for ( int j = 0 ;j < i ; j++) {
								System.out.print(" ");	
							}
							for (int k = 0 ; k < lev -1 - i ; k++) {
								System.out.print("xx");
							}
							System.out.println("x");
							}
						break;
						
				//Rysowanie drzewa w kierunku LEFT
				case 2: for( int i = lev - 1; i > 0 ; i--) {
								for ( int j = 0 ;j < i ; j++) {
									System.out.print(" ");	
								}
								for (int k = 0 ; k < lev - i ; k++) {
									System.out.print("x");
								}
								System.out.println(" ");
						}
						for( int i = lev; i > 0 ; i--) {
								for (int k = 0 ; k < lev - i ; k++) {
									System.out.print(" ");
								}
								for ( int j = 0 ;j < i ; j++) {
									System.out.print("x");	
								}
						System.out.println(" ");
						}
						break;
				
			}
		} 
	
}
	

