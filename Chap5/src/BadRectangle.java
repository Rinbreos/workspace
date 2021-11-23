
public class BadRectangle {
	private int width;
	private int height;
	private int area;
	
	public static void main(String[] args){
		BadRectangle bad = new BadRectangle();
		bad.setDimensions(5,5);
	}
	
	public void setDimensions(int width, int height){
		this.width = width;
		this.height = height;
		
		area = width * height;
	}
	public int getArea(){
		return area;
	}
	
}
