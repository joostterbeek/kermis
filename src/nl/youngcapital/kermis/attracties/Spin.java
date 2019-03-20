package nl.youngcapital.kermis.attracties;


public class Spin extends Attractie{
   
   public Spin() {
      super("Spin", 2.25);
   }
   
   public void attractieDraaien() {
      System.out.println("De attractie " +  attractieNaam + " draait!");
   }
}