package nl.youngcapital.kermis.attracties;


public class Spookhuis extends Attractie{
   
   public Spookhuis() {
      super("Spookhuis", 3.20);
   }
   public void attractieDraaien() {
      System.out.println("De attractie " +  attractieNaam + " draait.");
   }
}