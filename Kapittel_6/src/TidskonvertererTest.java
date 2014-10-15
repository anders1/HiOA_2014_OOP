
import javax.swing.JOptionPane;

public class TidskonvertererTest
{
   public static void main( String args[] )
   {     
	  Tidskonverterer konvertert = new Tidskonverterer();
      int sekunderInput = Integer.parseInt( JOptionPane.showInputDialog( 
        		"Skriv inn sekunder i hele tall" ) );     
      while ( sekunderInput >= 0 )
      {
	     konvertert.setAntSekunder(sekunderInput);
	     String utskrift = konvertert.konvertertTid();
	
	     JOptionPane.showMessageDialog( null, utskrift,
	             "Tidskonverterer", JOptionPane.PLAIN_MESSAGE );
	     sekunderInput = Integer.parseInt( JOptionPane.showInputDialog( 
	     		"Skriv inn sekunder i hele tall" ) );       
      }
   } 
}  
