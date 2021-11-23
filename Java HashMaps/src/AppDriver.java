import java.util.HashMap;

public class AppDriver {
	
	public static final String EMAIL_EXTRA = "email";
	public static final String AGE_EXTRA = "age";
	
	public static void main(String[] args) {
		
		HashMap<String, String> myMap = new HashMap<String, String>();
		myMap.put("MN", "Minnesota");
		myMap.put("IA", "Iowa");
		myMap.put("WI", "Wisconsin");
		
		//change a value
		myMap.put("IA", "Iwo Jima");
		
		//get a value 
		String wi = myMap.get("WI");
		
		//loop through a hashmap
		for(String myKey : myMap.keySet()){
			System.out.println(myKey + " is " + myMap.get(myKey));
		}
		
		//map of terms and definitions 
		HashMap<String, String> terms = new HashMap();
		terms.put("Java", "a programming language");
		terms.put("Intent", "Used to launch new Activites in Android");
		
		
		// Simulate creating an Intent
		Intent i = new Intent();
		i.putExtra(EMAIL_EXTRA, "bob@bob.com");
		i.putExtra(AGE_EXTRA, 7);
		Intent i2 = Intent.createChooser(i, "Choose an Activity to handle this intent...");
		//startActivity(i2);
		
		// Pretend this is code in the Activity that handles this Intent
		//We could put this code in the onCreate method of the Activity
		// Intent i = getIntent();
		String email = i.getStringExtra(AppDriver.EMAIL_EXTRA);
		int age = i.getIntExtra(AppDriver.AGE_EXTRA);
		
		
		
	}

}
