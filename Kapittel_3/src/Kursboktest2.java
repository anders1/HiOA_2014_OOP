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
 * Når vi gjør kall på metoden, må vi istedenfor den formelle parameteren 
 * bruke en aktuell parameter av samme datatype som den formelle. 
 * 
 * (Men legg merke til at i kallet spesifiserer vi ikke datatypen for den aktuelle parameteren, 
 * slik vi gjør for den formelle parameteren i metodedefinisjonen. (INNI PARANTES)
 *  
 * Den aktuelle parameteren kan enten være en konkret dataverdi av vedkommende datatype, 
 * eller det kan være, slik som her, en variabel av vedkommende datatype. 
 * Denne variabelen må da på forhånd ha blitt tilordnet en verdi (av riktig datatype). 
 * 
 * I begge tilfeller virker kallet på følgende måte:
 
Verdien til den aktuelle parameter blir tilordnet som verdi til den variabel som er formell parameter. 
Denne verdien brukes når metoden utfører sine instruksjoner. 
Resultatet blir derfor at vi via parameteren får tilført metoden en verdi utenfra. 
Den tilførte verdien kan selvsagt være forskjellig fra gang til gang som vi gjør kall på metoden.

Når det gjelder navnene til den formelle parameter og den variabel som eventuelt brukes som aktuell 
parameter, så er disse uavhengige av hverandre. 

I eksemplet ovenfor er det brukt forskjellige navn (kursnavn og navn). 
Men det er også tillatt å bruke samme navn. Det avgjørende er at den aktuelle parameter er 
av samme datatype som den formelle parameter.*/


