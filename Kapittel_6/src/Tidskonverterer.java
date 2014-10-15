
public class Tidskonverterer {

private int antSekund;// lokal variabel radius

public void setAntSekunder(int sekunderInput) 
{
	antSekund = sekunderInput;	
}

//public int getAntSekund()
//{
//  return antSekund;
//}

public String konvertertTid () 
{
	
	int sekundTimer = 3600;
    int sekundMinutter = 60;
    int minutter;
    int timer;
    int sekund;
    
	// Adderer tallene og lagrer summen i variabelen sum:
    timer = antSekund / sekundTimer;
    antSekund = antSekund % sekundTimer ;//modulus her 
    minutter =  antSekund / sekundMinutter;
    antSekund = antSekund % sekundMinutter;
    sekund =  antSekund; 	

	return timer +" timer " + minutter + " minutter " + sekund + " sekund ";
	  }
	}


