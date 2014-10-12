import javax.swing.JOptionPane;

public class Kursboktest2
{
  public static void main( String[] args )
  {
    Kursbok2 protokoll = new Kursbok2();

    // Leser inn kursnavn:
    String navn = JOptionPane.showInputDialog( "Skriv kursnavn:" );

    // Viser hvilket kurs vi har opprettet kursbok for:
    protokoll.visTittel( navn ); //Aktuell parameter
  }
}

/*I denne definisjonen kaller vi kursnavn for en formell parameter. 
 * 
 * N�r vi gj�r kall p� metoden, m� vi istedenfor den formelle parameteren 
 * bruke en aktuell parameter av samme datatype som den formelle. 
 * 
 * (Men legg merke til at i kallet spesifiserer vi ikke datatypen for den aktuelle parameteren, 
 * slik vi gj�r for den formelle parameteren i metodedefinisjonen. (INNI PARANTES)
 *  
 * Den aktuelle parameteren kan enten v�re en konkret dataverdi av vedkommende datatype, 
 * eller det kan v�re, slik som her, en variabel av vedkommende datatype. 
 * Denne variabelen m� da p� forh�nd ha blitt tilordnet en verdi (av riktig datatype). 
 * 
 * I begge tilfeller virker kallet p� f�lgende m�te:
 
Verdien til den aktuelle parameter blir tilordnet som verdi til den variabel som er formell parameter. 
Denne verdien brukes n�r metoden utf�rer sine instruksjoner. 
Resultatet blir derfor at vi via parameteren f�r tilf�rt metoden en verdi utenfra. 
Den tilf�rte verdien kan selvsagt v�re forskjellig fra gang til gang som vi gj�r kall p� metoden.

N�r det gjelder navnene til den formelle parameter og den variabel som eventuelt brukes som aktuell 
parameter, s� er disse uavhengige av hverandre. 

I eksemplet ovenfor er det brukt forskjellige navn (kursnavn og navn). 
Men det er ogs� tillatt � bruke samme navn. Det avgj�rende er at den aktuelle parameter er 
av samme datatype som den formelle parameter.*/


