import java.util.Scanner;

public class JavaKermis {

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
class Attractie {
	String attractieNaam;
	int prijs;
	int oppervlakte;
	void attractieDraaien() {
		System.out.println("De attractie " + attractieNaam + " draait!");
	}
}
class Botsautos extends Attractie{
	Botsautos(){
		attractieNaam = "botsautos";
	}
}
class Spin extends Attractie{
	String attractieNaam = "spin";
	void attractieDraaien() {
		System.out.println("De attractie " +  attractieNaam + " draait!");
	}
}
class Spiegelpaleis extends Attractie{
	String attractieNaam = "spiegelpaleis";
	void attractieDraaien() {
		System.out.println("De attractie " +  attractieNaam + " draait");
	}
}
class Spookhuis extends Attractie{
	String attractieNaam = "spookhuis";
	void attractieDraaien() {
		System.out.println("De attractie " +  attractieNaam + " draait.");
	}
}
class Hawaii extends Attractie{
	String attractieNaam = "hawaii";
	void attractieDraaien() {
		System.out.println("De attractie " +  attractieNaam + " draait.");
	}
}
class LadderKlimmen extends Attractie{
	String attractieNaam = "ladderklimmen";
	void attractieDraaien() {
		System.out.println("De attractie " +  attractieNaam + " draait.");
	}
}