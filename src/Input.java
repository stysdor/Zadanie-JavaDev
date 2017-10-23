import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {	
	
	 int inputLev = 0; //wysokość drzewa
	 int inputDir = 0; //kierunek drzewa
	
	public void startInput () {
		Scanner input = new Scanner(System.in);
		
		while (InputValidation.check(inputLev, inputDir) == false ) {
			//Wprowadzenie wysokości i kierunku rysowania drzewa
			try {
				System.out.print("Podaj wysokość drzewa (musi być liczbą naturalną większą od 0): ");
				inputLev = input.nextInt();
				System.out.print("Podaj kierunek rysowanie (1 - od góry , 2 - od lewej): ");
				inputDir =  input.nextInt();
			} catch(InputMismatchException ex) {
				System.out.println("Nie podano liczby całkowitej!");
				input = new Scanner(System.in);
			}
		}
		input.close();
	}
	
}
