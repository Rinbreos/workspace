package com.example.fileio;
import java.util.ArrayList;
import java.util.Scanner;

public class AppDriver {

public static void main(String[] args) {
		
		// Step 1 - I assume that you have studied Try/Catch blocks, I hope that's correct!
				
		/*
		Discussion about:
 		- Making programs 'persistent' by writing data to files and then reading data from files
		- Input and Output (I/O)
 		- Streams - virtual objects that allow programs to connect to files
 		- Here's a link:  http://www3.ntu.edu.sg/home/ehchua/programming/java/j5b_io.html
		- Different types of streams:
			input streams and output streams
			primitive data types
 			text data
 			objects
 		- Under the hood everything boils down to a byte stream, but
 		   there are 'stream' classes that take our text and convert it to a byte stream
 		   and other 'stream' classes that can take a byte stream and convert it to text.
 		   We often use these stream classes together as 'adapters'
 		- 'Buffers' allow our streams to work more efficiently
 		- The result of using various stream classes and buffers makes for some complicated looking code!
		*/
	
	
	
		// Step 2
		// Create an instance of the API that demos various File IO code
		FileManager fm = new FileManager();
		
		// Step 3
		// Save an array of primitive data to a file (an array of bytes)
		byte[] ba = {1,2, 4,6,8};		
		fm.writeBinary("saved-bytes.dat", ba);
		
		// Step 4
		// Save a text file
		String filePath = "test1.txt";
		fm.saveTextFile(filePath, "Hello There!");
		
		// Step 5
		// Open a text file
		fm.openTextFile(filePath);
		
		// Step 6 
		// Try to open a file that does not exist
		//fm.openTextFile("somefile.txt");
		
		// Step 7 - 'Serializing' objects
		// Save some objects (an array list of Student objects)
		// Then create an ArrayList of students so that we can SERIALIZE them
		Student s1 = new Student("Bob", "Jone", 1001, Department.BUSINESS);	
		Student s2 = new Student("Tim", "Smith", 1002, Department.HISTORY);		
		Student s3 = new Student("Sally", "Doe", 1003, Department.BUSINESS);
		
		ArrayList<Student>list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		fm.saveObject("students.dat", list);
		
		// Step 8 - Deserializing objects
		ArrayList<Student> newList = new ArrayList();
		
		ArrayList<Object> objects = fm.deserializeObjects("students.dat");
		for(Object o: objects) {
			Student s = (Student)o;
			newList.add(s);
		}
		
		for(Student s : newList) {
			System.out.println(s);
		}
		
	
		// Step 9
		// Opening a csv file
		
	
	}
	
}
