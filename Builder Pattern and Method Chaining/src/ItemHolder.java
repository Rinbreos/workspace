import java.util.HashMap;

public class ItemHolder {
	
	private HashMap<String, String> items = new HashMap();
	
	public ItemHolder add(String key, String value){
		items.put(key, value);
		return this;
	}
	
	@Override
	public String toString(){
		// when concatenating large strings, you a StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for(String key : items.keySet()){
			sb.append(key + ": " + items.get(key) + "\n");
		}
		
		return sb.toString();
	}

}
