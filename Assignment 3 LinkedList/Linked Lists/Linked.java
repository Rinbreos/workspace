import java.util.LinkedList;




public class Linked {
	Object Node = head;
	private Linked next;

	
	//add to the front of the linked list 
	public void addFront(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	// add to the end of the linked list
	public void addEnd(int data) {
		if(Linked.head == null) {
			this.head = new Node(data);
		}else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = new Node(data);
		}
		
	}
	
	//remove from the first node
	public Linked removeFirst(Linked head) {
		if(head == null) {
			return head;
		}
			Linked temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
	
	//remove from the end of the linked list
	public Linked removeEnd(Linked head) {
		if(head == null) {
			head = null;
		}
		if(head.next == null) {
			return null;
		}
		Linked nextToLast = head;
		while(nextToLast.next.next != null) {
			nextToLast = nextToLast.next;
			nextToLast.next = null;
		}
		
		return head;
	}
	
	//getting the index of linked list items
	public static int getAtIndex(int index) {
		Node current = head;
		int count = 0;
		
		while(current != null){
			if(count == index) 
				return current.data;				
				count++;
				current = current.next;			
		}
		assert(false);
		return 0;		
		
	}
	
	//display the indexes of the current item
	public void display() {
		Node current = Linked.head;
		
		if(Linked.head == null) {
			System.out.println("Your linked list is empty!");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Linked = new LinkedList<Integer>();
		
		Linked.add(1);
		Linked.add(2);
		Linked.add(3);
		Linked.add(4);

		System.out.println(Linked);
		
	
	}
}
