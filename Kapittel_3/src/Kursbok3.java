/*
 * De kursbokobjektene vi har definert og opprettet hittil kan ikke være av særlig stor nytte, 
 * for det er ikke mulig å lagre noen data i dem. Dette skal vi rette på nå. 
 * I første omgang skal vi ta sikte på å lagre selve kursnavnet.
 * 
 * De variable som en klasse har for lagring av objektenes data, kan vi kalle klassens datafelter. 
 * Det er også vanlig å omtale disse som klassens attributter, mens metodene kalles klassens 
 * operasjoner. 
 * Som betegnelse for datafeltene brukes også uttrykkene objektvariable og instansvariable, 
 * siden et objekt også blir kalt for en instans av vedkommende klasse.
 * 
 * Variabelen kursnavn skal altså brukes til å lagre navnet på kurset som klassen definerer kursbok for.
 * 
 * PRIVARE. Dette har som virkning at variabelen bare vil være tilgjengelig inni klassen Kursbok3, 
 * det vil si at det bare er der det er mulig å referere til den slik at vi kan tilordne den en verdi, 
 * eller se hvilken verdi den har.
 * 
 * Vi skal imidlertid, som i eksempel 2 ovenfor, bruke et kursbokobjekt i et program som leser inn kursnavn. 
 * Vi vil da være utenfor klassen Kursbok3. 
 * Spørsmålet blir dermed hvordan vi skal få overført det innleste navnet til objektet vårt. 
 * Det kan vi få gjort ved å gjøre kall på den nye metoden setKursnavn, 
 * med det innleste navnet som aktuell parameter. 
 * For den metoden overfører til datafeltet kursnavn den verdi som dens parameter navn har når metoden blir kalt opp. 
 * Dersom vi har et kursbokobjekt og vil se på hvilket kursnavn det inneholder, 
 * kan vi gjøre kall på dets metode getKursnavn. 
 * For den vil returnere verdien til datafeltet kursnavn til det stedet der metoden blir kalt opp. 
 * For å returnere en verdi fra en metode, bruker vi nøkkelordet RETURN. 
 * Det har som virkning å avslutte hele metoden, samtidig som verdien av uttrykket 
 * bak return blir returnert til det stedet der metoden blir kalt opp. 
 * Datatypen for dette uttrykket må angis som returverditype foran metodenavnet, i dette tilfellet 
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