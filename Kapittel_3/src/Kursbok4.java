/*Klassen Kursbok4 er utstyrt med en konstrukt�r som initialiserer 
 * datafeltet kursnavn via en konstrukt�rparameter.*/

import javax.swing.JOptionPane;

public class Kursbok4
{
  private String kursnavn;

  // Konstrukt�r som initialiserer datafeltet kursnavn.
  public Kursbok4( String n )
  {
    kursnavn = n;
  }

  public void setKursnavn( String navn )
  {
    kursnavn = navn;
  }

  public String getKursnavn()
  {
    return kursnavn;
  }

  public void visTittel()
  {
    JOptionPane.showMessageDialog( null, "Kursbok for " + kursnavn );
  }
}