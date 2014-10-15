//import static java.lang.System.*;

public class Sirkel {

	private double radius;// lokal variabel radius
	
	public void setRadius(double radiusKonv) 
	{
		radius = radiusKonv;
		if (radius <= 0.0) {
			radius = 0.0;
		}
	}
	
	  public double getRadius()
	  {
	    return radius;
	  }
		
	public double diameter()
	  {
		return 2 * radius; //Beregner og returnerer sirkelens diameter.
	  }

	  public double omkrets()
	  {
	    return ((2 * Math.PI) * radius); //< Beregner og returnerer sirkelens omkrets.
	  }

	  public double areal()
	  {
	    return ((Math.PI * radius) * radius); // Beregner og returnerer sirkelens areal.
	  }

	

	

	
	
	
}
