package ferdig2;


//SETTER KARAKTER I KARAKTERPROTOKOLLEN SAMMEN MED ELEVLISTA
public class KarakterPostFlereFag
{

private String faget;
private double karakter1;
private double karakter2;
private double karakter3;
private double karakter4;
private double karakter5;
double gjennomsnitt;

// konstruktør uten parametre, initialiserer klassen
public KarakterPostFlereFag()
{
this("", 0.0,0.0,0.0,0.0,0.0); // kaller kontstruktør med SEKS argument
} // end konstruktør uten argumenter

 // konstruktør med SEKS argument
public KarakterPostFlereFag(String fag, double kar1, double kar2, double kar3, double kar4, double kar5 )
{
		setFaget(fag);	
		setKarakter1(kar1);
		setKarakter2(kar2);
		setKarakter3(kar3);
		setKarakter4(kar4);
		setKarakter5(kar5);
		
		  
		} // end 6-argumenters konstruktør
		
		//set fag
		public void setFaget(String fag)
		{
			faget=fag;
		}
		//get fag
		public  String getFaget()
		{
			return faget;
		}
		
		// set karakter1
		public void setKarakter1( double kar1 )
		{
		karakter1 = kar1;
		 }
		
		// get karakter1
		public double getKarakter1()
		{
		return karakter1;
		}
		
		//set karakter2
		public void setKarakter2( double kar2 )
		{
		karakter2 = kar2;
		}
		
		//get karakter2
		public double getKarakter2()
		{
		return karakter2;
		}
		
		//set karakter3
		public void setKarakter3( double kar3 )
		{
		karakter3 = kar3;
		}
		
		//get karakter3
		public double getKarakter3()
		{
		return karakter3;
		}
		
		//set karakter4
		public void setKarakter4( double kar4 )
		{
		karakter4 = kar4;
		}
		
		//get karakter4
		public double getKarakter4()
		{
		return karakter4;
		}
		
		//set karakter5
		public void setKarakter5( double kar5 )
		{
		karakter5 = kar5;
		}
		
		//get karakter5
		public double getKarakter5()
		{
		return karakter5;
		}
		
		//Gjennomsnitt
		
		//public void snitt(double kar1, double kar2,double kar3,double kar4,double kar5 )
		public void setSnitt()
		{
			gjennomsnitt = (getKarakter1() + getKarakter2() + getKarakter3() + getKarakter4() + getKarakter5())/5;
			System.out.println(gjennomsnitt);
		}
		
		//get Snitt
		public double getSnitt()
		{
			return gjennomsnitt;
		}
}