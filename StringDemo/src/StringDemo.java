
public class StringDemo {
	
	public static void main(String[] args){
		
		System.out.println("HAL 9000");
		
		String hello = "Hello Dave";
		
		System.out.println(hello);
		
		String greeting;
		greeting = "Just what do you think" + " you are doing?" ;
		String name = "Dave";
		
		greeting = greeting += " " + name;
		
		System.out.println(greeting);
		
		String greeting2 ="Hello Dave";
		int length = greeting2.length();
		System.out.println(length);
		
		int posH = greeting2.indexOf("H");
		System.out.println(posH);
		
		int posD = greeting2.indexOf("D");
		System.out.println(posD);
		
		String dave = greeting2.substring(6,10);
		System.out.println(dave);
		
		
	}

}
