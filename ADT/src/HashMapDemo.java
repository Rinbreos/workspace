import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Mountain> mMap = new HashMap();
		
		Mountain everest = new Mountain("Everest", 29029);
		mMap.put(everest.getName(), everest);
		mMap.put("K2",new Mountain("K2", 28251));
		mMap.put("Denali", new Mountain("Denali", 20335));
		
		//does the mountain exist
		System.out.println("Denali in the map?" + mMap.containsKey("Denali"));
		if(mMap.containsKey("Denali")){
			System.out.println(mMap.get("Denali").toString());
		}
		
//		Set<String> keys = mMap.keySet();
//		Iterator<String> keysIterator = keys.iterator();
//		while(keys.iterator().hasNext()){
//			String nextKey = keysIterator.next();
//			Mountain nextMountain = mMap.get(nextKey);
//			System.out.println(nextMountain);
//			System.out.println();
//			
//		}
		for(String mtnName : mMap.keySet()){
			Mountain nextMountain =mMap.get(mtnName);
			System.out.println(nextMountain);
			System.out.println();
		}
		

	}

}
