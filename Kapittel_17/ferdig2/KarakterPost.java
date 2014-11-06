package ferdig2;
//SETTER KARAKTER I KARAKTERPROTOKOLLEN SAMMEN MED ELEVLISTA
public class KarakterPost
{

private double karakter;

// konstruktør uten parametre, initialiserer klassen
public KarakterPost()
{
this(0.0); // kaller kontstruktør med ett argument
} // end konstruktør uten argumenter

 // konstruktør med ett argument
public KarakterPost(double kar )
{

 setKarakter(kar);
} // end 1-argumenters konstruktør


// set karakter
public void setKarakter( double kar )
{
karakter = kar;
 }

// get karakter
public double getKarakter()
{
return karakter;
}
}