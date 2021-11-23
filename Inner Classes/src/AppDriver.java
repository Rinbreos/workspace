
public class AppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		//Outer.Inner i = new Outer.Inner(); 
		//a non-static inner class must be instantiated in it's outer class
		
		//Outer.Inner i = o.inner; = good code;
		//Outer.PrivateInner; = bad code
		
		Outer.StaticNested sn = new Outer.StaticNested();
		
		Human bob = new Human("Bob");
		String answer = bob.answerQuestion("WHat is jazz!");
		System.out.println(answer);
		
		
		EnchancedBrain b = new EnchancedBrain();
		bob.setBrain(b);
		System.out.println(bob.answerQuestion("What is Blue?"));
		
		bob.setBrain(new EnchancedBrain(){
			@Override 
			String process(String thought){
				return "I'm awesome";
			}
		});
		System.out.println(bob.answerQuestion("What is Blue?"));
	}
	
	static class EnchancedBrain extends Human.Brain{
		@Override
		String process(String thought){
			return super.process(thought) + "I have the answer ... " + thought;
		}
	}

}
