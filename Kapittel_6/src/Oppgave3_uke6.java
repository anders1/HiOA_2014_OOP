import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave3_uke6
{
  public static void main( String[] args )
  {
    Terning terningen = new Terning();
    int antKast = 100;
    
    // oppretter JTextArea for visning av utskrift
    JTextArea tekstomr�de = new JTextArea();
    
    for ( int i = 1; i <= antKast; i++ ){
	    	terningen.kast();
	    int verdi = terningen.getVerdi();
	    tekstomr�de.append(verdi + "  ");
    
	    if (i % 10 == 0) {
    		  tekstomr�de.append("\n");
    }
     
    }
    JOptionPane.showMessageDialog( null, tekstomr�de, "Terningtest",
        JOptionPane.PLAIN_MESSAGE );
  }
}