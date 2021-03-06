package module2;

public class SimpleLocation {

	// init declarations
	// aka Member Variables
	private double latitude;
	private double longitude;
	
	// CONSTRUCTORSSS!!
	// --> name is same as class
	
	// constructor default
	public SimpleLocation() 
	{
		this.latitude = 42; // "this" refers to class
		this.longitude = -72;
	}
	// constructor with args (overlorded!)
	public SimpleLocation(double lat, double lon)
	{
		this.latitude = lat; // "this" refers to class
		this.longitude = lon;
	}
	
	// Getters and Setters!
	public double getLatitude() // getter!
	{
		return this.latitude;
	}
	public void setLatitude(double lat) // setter!
	{
		if ( lat < -180 || lat > 180 ){ // border control
			System.out.println("You can swim around the world but you'll need a lot of helium in your floaties for this one, Rudolph!");
		} 
		else {
			this.latitude = lat;
		}
	}
	
	
	// calculate rudimentary distance
	private double getDist(double x1, double y1, double x2, double y2)
	{
		// find hypotenuse => pythagoras
		double tooBig = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
		double justRightDegrees = Math.sqrt(tooBig);
		double justRightMiles = justRightDegrees * 69; // close enough
		return justRightMiles; 
	}
	
	// 
	public double distance(double anotherLat, double anotherLon)
	{ 
		return getDist(this.latitude, this.longitude, anotherLat, anotherLon);	
	}
	// overlorded!
	public double distance(SimpleLocation somewhereElse)
	{ 
		return getDist(this.latitude, this.longitude, somewhereElse.latitude, somewhereElse.longitude);	
	}

	
}
