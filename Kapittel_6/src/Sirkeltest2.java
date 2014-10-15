//Skriv en klasse Sirkeltest som gir et testprogram for Sirkel-klassen. 
//Programmet skal fra brukeren lese inn radius til en sirkel og bruke 
//denne verdien som konstruktørparameter ved opprettelsen av et Sirkel-objekt. 

//Programmet skal skrive ut data for sirkelen, tilsvarende som vist i 
//følgende dialogboks (du kan ha en annen verdi for sirkelens radius):

//De utskrevne tallverdiene skal formateres til to desimaler.

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Sirkeltest2 {

	public static void main(String[] args) {
		
		String utskrift = "";
		String radiusTxt = JOptionPane.showInputDialog ("Skriv inn radius på sirkelen: ");
		double radiusKonv = Double.parseDouble(radiusTxt);
		
		Sirkel sirkeldata = new Sirkel();
		
		double diameter = sirkeldata.diameter();
		double omkrets = sirkeldata.omkrets();
		double areal = sirkeldata.areal();
		double radius = sirkeldata.getRadius(); 
		String formateringsstreng = "#,###,##0.00";
	    DecimalFormat formateringsobjekt = new DecimalFormat( formateringsstreng );
	    
		utskrift = "Radius: " + formateringsobjekt.radius + "\n"
			 +"Diameter: " + diameter + "\n" + 
			"Omkrets: " + omkrets + "\n" + "Areal: " + areal + "\n";
		JOptionPane.showMessageDialog( 
	              null, utskrift, "Sirkeldata", 
	              JOptionPane.PLAIN_MESSAGE );
		//Programmet skal fra brukeren lese inn radius til en sirkel og bruke 
		//denne verdien som konstruktørparameter ved opprettelsen av et 
		//Sirkel-objekt.	
		
		//Programmet skal skrive ut data for sirkelen, tilsvarende som vist i 
		//følgende dialogboks (du kan ha en annen verdi for sirkelens radius):
		
		//De utskrevne tallverdiene skal formateres til to desimaler.
	}

}
