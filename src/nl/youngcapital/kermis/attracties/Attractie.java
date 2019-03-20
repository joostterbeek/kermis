package nl.youngcapital.kermis.attracties;

public class Attractie {

   public String attractieNaam;
   public double prijs;
   public int oppervlakte;

   public Attractie() {
   }
   
   public void attractieDraaien() {
      System.out.println("De attractie " + attractieNaam + " draait!");
   }
}