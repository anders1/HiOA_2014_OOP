/* Vi har derfor behov for å informere visTittel-metoden om hvilket kursnavn 
   den skal 
 * skrive ut når den blir kalt opp. Informasjon til metoder kan vi få gitt ved 
 * å bruke parametre. 
 * 
 * Nå skal vi definere en ny versjon av denne metoden. 
 * Den skal ha en parameter som inneholder navnet på det kurset som klassen vår definerer kursbok for. 
 */

import javax.swing.JOptionPane;

public class Kursbok2 
{
	public void visTittel(String Kursnavn) //Kursnav formell parameter
	{
		JOptionPane.showMessageDialog(null, "Kursbok for " + Kursnavn);
	}
}