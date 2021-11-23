package com.acme.educationapps;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {
	
/*
 NOTES ON FILE IO...
 
 Here's a good link on file streams with good visuals:
 http://www3.ntu.edu.sg/home/ehchua/programming/java/j5b_io.html
 
 I/O means Input and Output
 We can read data INTO our programs (INPUT).
 We can write data OUT of our programs (OUTPUT).
 (we are usually reading data from and writing data to some sort of a file)
 

Why would we want to be able to read and write data from files on the file system?
 
 In order to read data into our program, or write data out of our program,
 we need a 'stream' to connect the program to the source of the data

There are lots of classes in the Java API that represent streams. This is because there are
 many different sources for our data, and our data can take many different forms.
 
 Check out this chart of 'stream' classes in Java
 	http://flylib.com/books/1/89/1/html/2/images/12fig01.gif
 	
 	- the data source might be a file on the local file system
 	- the data source might be a file on some other computer
 	- the data source might be the keyboard (System.in is an input stream)
 	- the data source might be some other peripheral device, such as a scanner
 	
 	- the data might be a binary file
 	- the data might be a text file
 	- the data might be Java objects, such as an ArrayList of Dog objects, or a HashMap

AND on top of all these variations, there are different ways of reading the
data into or out of our program. For example you can use a 'buffer' to optimize
the performance of your reads and writes. Without a buffer, your data will be
read one byte at a time. But if you use a buffered stream, you can read a whole
chunk of bytes into RAM, and then from RAM into your program all at once. 
It's sort of like when you need to get 3 things from the store, do you want to make
3 separate trips, or do you want to get all three things at once?

Here are some of the 'stream' classes...

InputStream and OutputStream - for working with binary data
InputStreamReader and OutputStreamWriter - for working with text files
DataInputStream and DataOutputStream - for working with primitive data types
ObjectInputStream and ObjectOutPutStream - for serializing and deserializing objects
BufferedInputStream and BufferedOutputStream - uses a buffer to optimize I/O
PrintWriter and PrintReader - Classes that 'simplify' working with text files


Stream classes are often combined together to work as adapters:

InputStream inStream = new FileInputStream("test.txt");
InputStreamReader inStreamReader = new InputStreamReader(inStream, Charset.forName("UTF-8"));
BufferedReader buffer = new BufferedReader(inStreamReader);

inStream - gives us a connection to the file (remember that all files are binary)
inStreamReader - allows us to read the contents of the file as characters (text)
buffer - allows us to optimize reading by storing the contents of the file into a buffer
		 rather than accessesing each character one at a time.

BY THE WAY - System.in is a stream, we have been using it all semester long as the parameter
to the Scanner constructor

We need to use try/catch blocks when reading or writing files. What are some
potential exceptions/problems that could occur when working with files.
 	
*/
	
	/**
	 * Save an array of bytes to a file (by using the DataOutputStream)
	 * @param filePath	The path of the file to save
	 * @param bytes		The data to save in the file
	 */
	public void writeBinary(String filePath, byte[] bytes){
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			DataOutputStream os = new DataOutputStream(fos);
			os.write(bytes);
			os.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Creates a text file and puts some text in it
	 * @param filePath - The path to the file to save
	 * @param fileData - The data to save
	 */
	public void saveTextFile(String filePath, String fileData){
		try{
			 
			 PrintWriter output = new PrintWriter(filePath); // refresh your project in the package explorer to see the file
			 output.println(fileData);
			 output.close();
			 
		 }catch(Exception e){
			 System.out.println("Error: " + e.getMessage());
		 }
	}
	
	/**
	 * Opens a text file and reads it's contents to the console
	 * @param filePath
	 */
    public void openTextFile(String filePath){
    	
    	System.out.println("Opening " + filePath + "...");
    	
        try {
            // constructor may throw FileNotFoundException
            FileReader reader = new FileReader(filePath);
            int i=0;
            while(i != -1){
                i = reader.read();
                System.out.print((char) i );
            }
            reader.close();
            System.out.println("--- End of " + filePath + "---");
            
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    /**
     * Serializes an object that is living in our app. So that we can restore it later
     * @param filePath	The path to the file in which our object will be saved
     * @param obj		The object to serialize
     */
    public void saveObject(String filePath, Object obj){
    	
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
    
    /**
     * Deserializes an ArrayList of objects.
     * @param filePath	The path to the file that is storing the serialized ArrayList
     * @return			Returns an ArrayList<Object>
     */
    public ArrayList<Object> deserializeObjects(String filePath){
    	
    	ArrayList<Object> objects = new ArrayList();
    	
    	try{
		    FileInputStream fis=new FileInputStream(filePath);
		    ObjectInputStream ois=new ObjectInputStream(fis);
		    objects = (ArrayList<Object>)ois.readObject();
		    ois.close();
		    fis.close();
    	 }catch(Exception e){ 
    		 System.out.println(e);
		}
    	
    	return objects;
    }
    
   
}
