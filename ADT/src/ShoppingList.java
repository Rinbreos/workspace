import java.util.Scanner;

public class ShoppingList {
	private String[] itemList;
	private int size;
	
	public static void main(String[] args) {
			
		ShoppingList list = new ShoppingList(5);
		
		list.addItemsToList();
		list.printList();
		

	}
	
	public ShoppingList(int capacity){
		itemList = new String[capacity];
		size = 0;
		
	}
	
	public void addItemsToList(){
		Scanner s = new Scanner(System.in);
		addItemsToList(s, "Y");
		
	}
	
	public void addItemsToList(Scanner s, String response){
		if(!response.equalsIgnoreCase("Y")){
			return;
			
			
		}
		if(size >= itemList.length){
			resizeArray();
		}
		
		System.out.println("Enter the next item to add to the list.");
		String item = s.nextLine();
		itemList[size++] = item;
		
		System.out.println("Add another item to the List (Y/N)?");
		response = s.nextLine();
		addItemsToList(s, response);
	}
	
	private void resizeArray(){
		String[] tmpArr = new String[itemList.length * 2];
		for(int i = 0; i < size; i++){
			tmpArr[i] = itemList[i];
		}
		itemList = tmpArr;
	}
	public void printList(){
		System.out.println("your shopping list is: ");
		for(int i = 0; i < size; i++){
			String msg = "Shopping List item %d: %s%n";
			String formatted = String.format(msg, i, itemList[i]);
			System.out.println(formatted);
		}
	}
}
