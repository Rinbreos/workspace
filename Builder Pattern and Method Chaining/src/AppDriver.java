
public class AppDriver {

	public static void main(String[] args) {
		
		//Method chaining
		//If you are in Adv Topics, you have probably seen method chaining in JavaScript...
		// 	    document.getElementById("someDiv").appendChild(someElement);
		
		ItemHolder h = new ItemHolder();
		h.add("FirstName", "Ray").add("LastName", "Stevens").add("Password", "HelpMe");
		System.out.println(h);
		
		//Builder pattern
		//A good overview of the Builder Pattern: https://jlordiales.me/2012/12/13/the-builder-pattern-in-practice/
		Notification n = new Notification.Builder()
				.setContentText("This is the text of the notification")
				.setContentTitle("This is the title")
				.setSmallIcon(1111)
				.addAction(222, "some label") //Note that we don't have to create an Action object, the builder does it for us
				.build();
		
		System.out.println(n);
		

	}

}
