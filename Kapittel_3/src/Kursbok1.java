import javax.swing.JOptionPane;

//trenger � definere en metode som n�r den blir kalt opp viser kursbokas innhold p� skjermen. 
//En instruksjon for dette m� derfor st� inni metoden.
//Eksempel 1: Definere en klasse som inneholder en metode ( og opprette et objekt av klassen) 


public class Kursbok1 
// Public - Forel�pig kan du oppfatte det som en indikasjon p� at det 
// skal v�re tillatt for alle � gj�re kall p� metoden visTittel.
{
	public void visTittel() //Void trenger ikke � returnere noen verdi
	{
		JOptionPane.showMessageDialog(null, "Kursbok");
	}
}
