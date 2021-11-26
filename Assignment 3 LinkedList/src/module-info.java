import java.util.*;
public main class linkedList {
	
	private linkListNode head;
	
	public String linkedList() {
		head = null;
	}
	
	//printing out the linked list
	public void display() {
		linkListNode position = head;
		if(head == null) {
			System.out.println("The linked list is empty!");
			return;
		}
		while (position != null) {
			System.out.println(position.getData());
			position = position.getLink();
		}
		System.out.println();
	}
	
	//adds to the front of the list 
	public void addFront(String addData) {
		head = new linkListNode(addData, head);
	}
	
	//adds to the end of the list
	public void addEnd(String addData) {
		linkedListNode newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	//deletes from the front of the linked list
	public void removeFront() {
		if(head != null) {
			head = head.getLink();
		}else {
			System.out.println("You are deleting from an empty list!");
			System.exit(0);
		}
	}
	
	//deletes from the end of the linked list
	public void removeEnd() {
		if(head != null) {
			head = null;
		}
		if(head.next == null) {
			return null;
		}
		//finding the next to last node
		Node nextToLast = head;
		while(nextToLast.next.next !=null) {
			nextToLast = nextToLast.next;
			
			//remove of the last
			nextToLast.next = null;
			return head;
		}
	}
	
	//getting the index of linked list items
	public int getAtindex() {

		for(int i=0; i<linkList.size(); i++) {
			System.out.println("The element is at index " +i+ "is: " +linkList.get(i));
		}
	}
	
}