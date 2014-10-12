/*
 * De kursbokobjektene vi har definert og opprettet hittil kan ikke v�re av s�rlig stor nytte, 
 * for det er ikke mulig � lagre noen data i dem. Dette skal vi rette p� n�. 
 * I f�rste omgang skal vi ta sikte p� � lagre selve kursnavnet.
 * 
 * De variable som en klasse har for lagring av objektenes data, kan vi kalle klassens datafelter. 
 * Det er ogs� vanlig � omtale disse som klassens attributter, mens metodene kalles klassens 
 * operasjoner. 
 * Som betegnelse for datafeltene brukes ogs� uttrykkene objektvariable og instansvariable, 
 * siden et objekt ogs� blir kalt for en instans av vedkommende klasse.
 * 
 * Variabelen kursnavn skal alts� brukes til � lagre navnet p� kurset som klassen definerer kursbok for.
 * 
 * PRIVARE. Dette har som virkning at variabelen bare vil v�re tilgjengelig inni klassen Kursbok3, 
 * det vil si at det bare er der det er mulig � referere til den slik at vi kan tilordne den en verdi, 
 * eller se hvilken verdi den har.
 * 
 * Vi skal imidlertid, som i eksempel 2 ovenfor, bruke et kursbokobjekt i et program som leser inn kursnavn. 
 * Vi vil da v�re utenfor klassen Kursbok3. 
 * Sp�rsm�let blir dermed hvordan vi skal f� overf�rt det innleste navnet til objektet v�rt. 
 * Det kan vi f� gjort ved � gj�re kall p� den nye metoden setKursnavn, 
 * med det innleste navnet som aktuell parameter. 
 * For den metoden overf�rer til datafeltet kursnavn den verdi som dens parameter navn har n�r metoden blir kalt opp. 
 * Dersom vi har et kursbokobjekt og vil se p� hvilket kursnavn det inneholder, 
 * kan vi gj�re kall p� dets metode getKursnavn. 
 * For den vil returnere verdien til datafeltet kursnavn til det stedet der metoden blir kalt opp. 
 * For � returnere en verdi fra en metode, bruker vi n�kkelordet RETURN. 
 * Det har som virkning � avslutte hele metoden, samtidig som verdien av uttrykket 
 * bak return blir returnert til det stedet der metoden blir kalt opp. 
 * Datatypen for dette uttrykket m� angis som returverditype foran metodenavnet, i dette tilfellet 
 * er det datatypen String.
 */

import javax.swing.JOptionPane;

public class Kursbok3
{
  private String kursnavn;

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