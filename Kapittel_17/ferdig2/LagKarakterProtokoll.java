package ferdig2;
//BRUK DENNE TIL Å SKRIVE UT KARAKTERPROTOKOLLEN
//DENNE LAGER KARAKTRPROTOKOLL

// Programmet leser en tekstfil og viser hver post på skjerm
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.*;


public class LagKarakterProtokoll
{
	 private Scanner input; //objekt av klassen Scanner brukes til å lese fra fil
	 private Formatter output;
	 private Double kar;

	 // her åpnes fila
	public void aapneFil()
	{
	try
	{

	input = new Scanner (new File("elever.txt"));
	output = new Formatter ("karakter.txt");
	} // end try
	catch ( SecurityException securityException )
	{
	JOptionPane.showMessageDialog(null, "", "Du har ikke skriverettigheter til denne fila", JOptionPane.PLAIN_MESSAGE );
	System.exit( 1 ); // avslutter programmet
	} // end catch
	catch ( FileNotFoundException fileNotFoundException )
	{
	JOptionPane.showMessageDialog(null, "", "Feil ved åpning av fila", JOptionPane.PLAIN_MESSAGE );
	System.exit( 1 ); // avslutter programmet
	} // end catch
	} // end aapneFil
	
	// leser poster fra fila
	public void lesPoster()
	{
	// objekt som skal skrives på skjerm
	ElevPost post = new ElevPost();
	KarakterPost karakter = new KarakterPost();
	
	try // leser objekter fra fila vha input som er et Scanner-objekt
	{
	while(input.hasNext() )
	{
	post.setKonto( input.nextInt() );
	post.setForNavn(input.next());
	post.setEtterNavn(input.next() );
	kar = Double.parseDouble(JOptionPane.showInputDialog("Skriv karakter for: "+ post.getKonto() + " " + post.getForNavn() + " " + post.getEtterNavn()));
	karakter.setKarakter(kar);
		
	output.format("%d %s %s %.2f\n", post.getKonto(), post.getForNavn(), post.getEtterNavn(), karakter.getKarakter());

	} // end while
	} // end try

	catch ( FormatterClosedException formatterClosedException )
	{
	JOptionPane.showMessageDialog(null, "", "feil ved skriving til fil", JOptionPane.PLAIN_MESSAGE );
	return;
	}
	catch ( NoSuchElementException elementException )
	{
	JOptionPane.showMessageDialog(null, "Upassende format i fila", null, JOptionPane.PLAIN_MESSAGE);
	input.close();
	System.exit( 1 );
	} // end catch
	catch ( IllegalStateException stateException )
	{
	JOptionPane.showMessageDialog(null, "Feil i lesing fra fil", null, JOptionPane.PLAIN_MESSAGE);
	System.exit( 1 );
	} // end catch
	} // end lesPoster
	
	// lukk fila og avslutt
	public void lukkFil()
	{
	if ( input != null )
	input.close();
	if ( output != null)
	output.close();
	}
	}

