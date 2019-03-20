package nl.youngcapital.kermis;
import java.util.Scanner;

import nl.youngcapital.kermis.attracties.Attractie;
import nl.youngcapital.kermis.attracties.Botsautos;

public class KermisApplication {

	public static void main(String[] args) {
		Attractie attractie = new Attractie();
		attractie.attractieDraaien();
		Attractie botsautos = new Botsautos();
		System.out.println("Toets 1 om de botsautos te laten draaien");
		Scanner scanner = new Scanner(System.in);
		if(scanner.nextInt() == 1) {
			botsautos.attractieDraaien();
		}
	}
}
