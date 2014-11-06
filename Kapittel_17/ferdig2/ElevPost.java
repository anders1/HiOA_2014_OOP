package ferdig2;

public class ElevPost
{
private int konto;
private String forNavn;
private String etterNavn;
//private double balanse;

// konstruktør uten parametre, initialiserer klassen
public ElevPost()
{
this( 0, "", "" ); // kaller kontstruktør med tre argumenter
} // end konstruktør uten argumenter

 // konstruktør med fire argumenter
public ElevPost( int knt, String fnavn, String enavn)
{
setKonto( knt );
setForNavn( fnavn );
setEtterNavn( enavn );

} // end 4-argumenters konstrukt�r

// set kontomummer
public void setKonto( int knt )
{
konto = knt;
}

 // get kontonummer
public int getKonto()
{
return konto;
}

// set fornavn
public void setForNavn( String fnavn )
{
forNavn = fnavn;
}

// get fornavn
 public String getForNavn()
{
return forNavn;
}

// set etternavn
public void setEtterNavn( String enavn )
{
etterNavn = enavn;
}

// get etternavn
public String getEtterNavn()
{
return etterNavn;
}

}