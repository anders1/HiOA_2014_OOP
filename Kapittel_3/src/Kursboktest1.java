/*Eksempel 1: (Definere en klasse som inneholder en metode) og opprette et objekt av klassen

  Klassen Kursbok1 er i seg selv ikke noe fullstendig program, og er heller ikke ment � v�re det. 
  Klassen har som oppgave � definere en bestemt type objekt. 
  Skal vi ha noen nytte av slike objektdefinisjoner, m� vi opprette objekter 
  av den definerte typen og bruke dem i programmer. */

public class Kursboktest1 {

	public static void main(String[] args) {
		// Opptretter (et nytt objekt) Kursbok1-objekt:
		// (Navn p� objktet) oppretter variabelen protokoll som er av datatypen Kursbok1
		
		Kursbok1 protokoll = new Kursbok1(); 
	 
		/*Gj�r kall p� objektets visTittel-metode:definert i klassen Kursbok1, 
		og kallet skal skje utenfor denne klassen.
		
		For � gj�re kallet, trenger vi da et objekt av type Kursbok1. 
		N�r vi har opprettet objektet protokoll, slik det er gjort ovenfor, 
		kan vi skrive kallet slik:*/
		
			protokoll.visTittel();
	}

}
