/* Vi har derfor behov for � informere visTittel-metoden om hvilket kursnavn 
   den skal 
 * skrive ut n�r den blir kalt opp. Informasjon til metoder kan vi f� gitt ved 
 * � bruke parametre. 
 * 
 * N� skal vi definere en ny versjon av denne metoden. 
 * Den skal ha en parameter som inneholder navnet p� det kurset som klassen v�r definerer kursbok for. 
 */

import javax.swing.JOptionPane;

public class Kursbok2 
{
	public void visTittel(String Kursnavn) //Kursnav formell parameter
	{
		JOptionPane.showMessageDialog(null, "Kursbok for " + Kursnavn);
	}
}