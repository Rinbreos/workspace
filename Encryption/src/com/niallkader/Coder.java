package com.niallkader;

/**
* <h1>Coder</h1>
* The Coder class can be used to encrypt and decrypt data 
* (although it is not secure and can be easily cracked).
* 
* @author  Niall Kader
* @version 1.0
* @since   2017-2-22
*
* <p>
*/
public class Coder {

	public static void main(String[] args) {
	
		Coder c = new Coder();
		String msg = "hello world";
		String encodedMsg = c.encode(msg);
		System.out.println(encodedMsg);
		
		System.out.println(c.decode(encodedMsg));
	}
	
	private final int CIPHER = 3;
	
	
	private int convertCharToAsciiNumber(char c){
		return (int)c;
	}
	
	private char convertAsciiNumberToChar(int i){
		return (char)i;
	}
	
	private int[] convertStringToAsciiArray(String string){
        
   	 // loop through the characters in the string parameter,
   	 // and call converCharToAsciiNumber() from inside the loop
   	 int[] asciiArray = new int[string.length()];
   	 
   	 for(int i=0; i < string.length(); i++){
   		 char c = string.charAt(i);
   		 asciiArray[i] = convertCharToAsciiNumber(c);
   		 //System.out.println(asciiArray[i]); //comment this out after testing
   	 }
   	 return asciiArray;
   	 
        
    }
    
    
    private String convertAsciiArrayToString(int[] charArray){
        
       String str = "";
       for(int c: charArray){
    	   str += convertAsciiNumberToChar(c);
       }
       
       return str;
        
    }
    
    /**
	* Encrypts a message.
	*
	* @param message 	The message to be encrypted.
	* @return  			Returns the encrypted message.
	*/
    public String encode(String message){
    	
    	// convert the message to an array of ascii numbers
    	int[] asciiNumbers = this.convertStringToAsciiArray(message);
    	
    	// loop through the numbers and apply the key/cipher 
    	for(int x = 0; x < asciiNumbers.length; x++){
    		asciiNumbers[x] += CIPHER;
    	}
   	
    	// convert the array of ascii numbers back to a String
    	String encodedMessage = this.convertAsciiArrayToString(asciiNumbers);
    	
    	return encodedMessage;
    	
    }
    
    
    /**
	* Decrypts a message.
	*
	* @param message 	The encrypted message that will be decrypted.
	* @return  			Returns the decrypted message.
	*/
    public String decode(String message){
    	
    	// convert the encoded message to an array of ascii numbers
    	int[] asciiNumbers = this.convertStringToAsciiArray(message);
    	
    	
    	
    	// loop through the numbers and reverse the effects of the key/cipher
    	for(int x = 0; x < asciiNumbers.length; x++){
    		asciiNumbers[x] = asciiNumbers[x] - CIPHER;
    	}
   	
    	// convert the array of ascii numbers back to a String
    	String decodedMessage = this.convertAsciiArrayToString(asciiNumbers);
    	
    	return decodedMessage;
    	
    }
   

}
