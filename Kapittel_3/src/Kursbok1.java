import javax.swing.JOptionPane;

//trenger å definere en metode som når den blir kalt opp viser kursbokas innhold på skjermen. 
//En instruksjon for dette må derfor stå inni metoden.
//Eksempel 1: Definere en klasse som inneholder en metode ( og opprette et objekt av klassen) 


public class Kursbok1 
// Public - Foreløpig kan du oppfatte det som en indikasjon på at det 
// skal være tillatt for alle å gjøre kall på metoden visTittel.
{
	public void visTittel() //Void trenger ikke å returnere noen verdi
	{
		JOptionPane.showMessageDialog(null, "Kursbok");
	}
}
