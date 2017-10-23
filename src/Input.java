import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {	
	
	 int inputLev = 0; //wysokoœæ drzewa
	 int inputDir = 0; //kierunek drzewa
	
	public void startInput () {
		Scanner input = new Scanner(System.in);
		
		while (InputValidation.check(inputLev, inputDir) == false ) {
			//Wprowadzenie wysokoœci i kierunku rysowania drzewa
			try {
				System.out.print("Podaj wysokoœæ drzewa (musi byæ liczb¹ naturaln¹ wiêksz¹ od 0): ");
				inputLev = input.nextInt();
				System.out.print("Podaj kierunek rysowanie (1 - od góry , 2 - od lewej): ");
				inputDir =  input.nextInt();
			} catch(InputMismatchException ex) {
				System.out.println("Nie podano liczby ca³kowitej!");
			}
		}
		input.close();
	}
	
}
