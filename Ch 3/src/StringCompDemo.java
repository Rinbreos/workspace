
public class StringCompDemo {

	public static void main(String[] args) {
		//String s1 = "Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1 == s2){
			System.out.println("S1 == S2");
		}else{
			System.out.println("S1 != S2");
		}
		if(s1.equals(s2)){
			System.out.println("S1 == S2");
		}else{
			System.out.println("S1 != S2");
		}
		String s3 = "There can be only one";
		String s4 = "There Can Be Only One";
		
		if(s3.equals(s4)){
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
		
		String name = "Fred";
		String name2 = "Bob";
		
		 name = name2;
		System.out.println(name);
	}
}
