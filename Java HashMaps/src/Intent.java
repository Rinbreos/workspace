import java.util.HashMap;

// This class sort of simulates the Intent class in Android
// It demonstrates how the 'extra' data that can be added to an intent is encapsulated

public class Intent {
    
    private HashMap<String, String> stringExtras = new HashMap<String, String>();
    private HashMap<String, Integer> intExtras = new HashMap<String, Integer>();

    
    public void putExtra(String key, String value){
        stringExtras.put(key, value);
    }
    
    // overload the putExtra() method so that it can take integer values
    public void putExtra(String key, int value){
        intExtras.put(key, value);
    }
    
    public String getStringExtra(String key){
        String output = null;
        if(stringExtras.containsKey(key)){
            output = stringExtras.get(key);
        }
        return output;
    }
    
    public Integer getIntExtra(String key){
        Integer output = null;
        if(intExtras.containsKey(key)){
            output = intExtras.get(key);
        }
        return output;
    }
    
    public static Intent createChooser(Intent i, String title){
        System.out.println("This method wraps your intent in another intent that will result in the Chooser appearing so that you can choose the Activity that handles the intent");
        return i;
    }
}