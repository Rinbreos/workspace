
public class WesternArrayList {

	private int[] values;
	private int capacity;
	private int size;
	
	public static void main(String[] args){
		WesternArrayList arr = new WesternArrayList(5);
		arr.add(5);
		arr.add(8);
		arr.add(9);
		//arr.add(3);
		//arr.add(6);
		//arr.add(9);
		//System.out.println(arr.toString());
		
	}
	
	public WesternArrayList(int capacity){
		this.capacity = capacity;
		this.size = 0;
		values = new int[capacity];
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	
	public void add(int value){
		values[size] = value;
		size++;
		
	}
	private void resize(){
		//make a bigger array
		capacity = capacity * 2;
		int[]tmp = new int[capacity];
		//copy values over
		for(int i = 0; i < size; i++){
			tmp[i] = values[i];
			
		}
		values = tmp;
	}
	private void setCapacity(int capacity) {
		if(size == capacity){
			resize();
		}
		this.capacity = capacity;
	}
	public int getSize() {
		return size;
	}
	private void setSize(int size) {
		this.size = size;
	}
	
	public String toString(){
		String msg = "";
		for(int i = 0; i < size; i++){
			msg += "values[" + i + "] = " + values[i] + "\n";
		}
		
		return msg;
	}
	
		
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

