import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList();
		shoppingList.add("Doritos");
		shoppingList.add("Pizza");
		
		
		for(int i = 0; i < shoppingList.size(); i++){
			String nextItem = shoppingList.get(i);
			System.out.println(nextItem);
		}

		if(shoppingList.contains("Pizza")){
			System.out.println("yum");
		}
		
		shoppingList.remove("Doritos");
		System.out.println(shoppingList.size());
	}

}
