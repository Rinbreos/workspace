
public class Human {
	private String name;
	private Brain brain;

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	public Human(String name) {
		this.name = name;
		this.brain = new Brain();
	}
	
	public String answerQuestion(String question){
		String response = this.brain.process(question);
		return response;
	}
	
	public static class Brain{
		
		String process(String thought){
			return "I am not sure about " + thought;
		}
		
	}

}
