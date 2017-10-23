import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {	
	
	 int inputLev = 0; //wysoko�� drzewa
	 int inputDir = 0; //kierunek drzewa
	
	public void startInput () {
		Scanner input = new Scanner(System.in);
		
		while (InputValidation.check(inputLev, inputDir) == false ) {
			//Wprowadzenie wysoko�ci i kierunku rysowania drzewa
			try {
				System.out.print("Podaj wysoko�� drzewa (musi by� liczb� naturaln� wi�ksz� od 0): ");
				inputLev = input.nextInt();
				System.out.print("Podaj kierunek rysowanie (1 - od g�ry , 2 - od lewej): ");
				inputDir =  input.nextInt();
			} catch(InputMismatchException ex) {
				System.out.println("Nie podano liczby ca�kowitej!");
			}
		}
		input.close();
	}
	
}
