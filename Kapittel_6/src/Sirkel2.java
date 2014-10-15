//import static java.lang.System.*;

public class Sirkel2 {

	private double radius;
	
	public Sirkel(double radiusKonv) {
		radius = radiusKonv;
		if (radius <= 0.0) {
			radius = 0.0;
		}
	}

	public void setRadius(double radiusKonv)
	{
		radius = radiusKonv;
		
	}
	
	  public double getRadius()
	  {
	    return radius;
	  }
		
	public double diameter(double radius)
	  {
		return 2 * radius; //Beregner og returnerer sirkelens diameter.
	  }

	  public double omkrets(double radius)
	  {
	    return ((2 * Math.PI) * radius); //< Beregner og returnerer sirkelens omkrets.
	  }

	  public double areal(double radius)
	  {
	    return ((Math.PI * radius) * radius); // Beregner og returnerer sirkelens areal.
	  }

	

	

	
	
	
}
