
public class Mountain {
	
	private String name;
	private int height;
	private double latitude;
	private double longitude;
	
	public Mountain(String name, int height){
		setName(name);
		setHeight(height);
		
	}
	
	public String toString(){
		String msg = 
				"Name:%s%nHeight:%s%nLatitude:%s%nLongitude:%s%n";
		
		return String.format(msg, name, height, latitude, longitude);
	}
	
	
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
