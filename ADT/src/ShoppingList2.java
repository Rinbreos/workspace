import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList2 {
	private ArrayList itemList;
	
	
	public static void main(String[] args) {
			
		ShoppingList2 list = new ShoppingList2();
		
		list.addItemsToList();
		list.printList();
		

	}
	public ShoppingList2(){
		itemList = new ArrayList();
	}
		
	
	
	public void addItemsToList(){
		Scanner s = new Scanner(System.in);
		addItemsToList(s, "Y");
		
	}
	
	public void addItemsToList(Scanner s, String response){
		if(!response.equalsIgnoreCase("Y")){
			return;
			
			
		}
	
		System.out.println("Enter the next item to add to the list.");
		String item = s.nextLine();
		itemList.add(item);
		
		System.out.println("Add another item to the List (Y/N)?");
		response = s.nextLine();
		addItemsToList(s, response);
	}
	

	public void printList(){
		System.out.println("your shopping list is: ");
		for(int i = 0; i < itemList.size(); i++){
			String msg = "Shopping List item %d: %s%n";
			String formatted = String.format(msg, i, (String)itemList.get(i));
			System.out.println(formatted);
		}
	}
}
