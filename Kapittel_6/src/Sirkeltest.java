//Skriv en klasse Sirkeltest som gir et testprogram for Sirkel-klassen. 
//Programmet skal fra brukeren lese inn radius til en sirkel og bruke 
//denne verdien som konstruktørparameter ved opprettelsen av et Sirkel-objekt. 

//Programmet skal skrive ut data for sirkelen, tilsvarende som vist i 
//følgende dialogboks (du kan ha en annen verdi for sirkelens radius):

//De utskrevne tallverdiene skal formateres til to desimaler.
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Sirkeltest {

	public static void main(String[] args) {
		Sirkel sirkeldata = new Sirkel(); //Konstruktør
		
		String utskrift = "";
		//String radiusTxt = JOptionPane.showInputDialog ("Skriv inn radius på sirkelen: ");
		double radiusKonv = Double.parseDouble(JOptionPane.showInputDialog ("Skriv inn radius på sirkelen: "));
		sirkeldata.setRadius(radiusKonv); //Leser og parser radius og sender den til sirkel.
		
		String formateringsstreng = "#,###,##0.00";
	    DecimalFormat formateringsobjekt = new DecimalFormat( formateringsstreng );
	    String utskriftRadius = formateringsobjekt.format(sirkeldata.getRadius());
	    
		utskrift = "Radius: " + utskriftRadius/*sirkeldata.getRadius()*/ + "\n"
			 +"Diameter: " + sirkeldata.diameter() + "\n" + 
			"Omkrets: " + sirkeldata.omkrets() + "\n" + "Areal: " + sirkeldata.areal() + "\n";
		JOptionPane.showMessageDialog( 
	              null, utskrift, "Sirkeldata", 
	              JOptionPane.PLAIN_MESSAGE );
	}

}
