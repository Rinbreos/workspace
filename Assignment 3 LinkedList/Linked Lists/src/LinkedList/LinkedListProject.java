package LinkedList;

import java.util.*;

public class LinkedListProject {
	
	public static void main(String[] args) {
		// TODO I am creating a LinkedList
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//populating with a list of string items
		linkedlist.add("Bob");
		linkedlist.add("Sally");
		linkedlist.add("Joe");
		linkedlist.add("Mary");
		
		//Printing out the original list
		System.out.println(linkedlist);
		
		//Adding to the front of the LinkedList
		linkedlist.addFirst("Doug");
		
		//Printing out the new list with Doug
		System.out.println(linkedlist + "\n"+"Index of Doug is: " + linkedlist.indexOf("Doug"));
		
		//Adding to the End of the Linked List
		linkedlist.addLast("Betty");
		
		//Printing out the new list with Betty added
		System.out.println(linkedlist + "\n"+"Index of Betty is: "+ linkedlist.indexOf("Betty"));
		
		//Removing the First person (Doug) from the list and Printing it out
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		
		//Removing the Last person (Betty) from the list and Printing it out
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		
		
		
	}

}
