import java.util.Scanner;

public class rpgTxtBased {
	public static GameSave GS = new GameSave();
	public static Scanner in = new Scanner(System.in);
	public static String question;
	
	public static String name;
	public static String user = "";
	
	public static void main(String[] args) {
		//This is my first attempt at a  text base RPG game 
		
		question = GS.LoadGame();
		name = GS.LoadName();
		// Game Loop
		
		while (true){
			if(user.equalsIgnoreCase("exit")){
				System.out.println("Closing game.");
				System.exit(0);
			}else{
				switch(question){
				case "0":
					System.out.println("Tals Adventure Welcome! What is your name?");
					question = "1";
					break;
					
				case "1":
					user = in.next();
					name = user;
					GS.SaveName(name);
					GS.SaveGame("1A");
					break;
					
				case "1A":
					System.out.println("Are you sure that is your name? \n [1]Yes\n[2]No");
					question = "2";
					break;
					
				case "2":
					switch (user = in.next()){
					case "1":
						question = "2A";
						GS.SaveGame(question);
						break;
					case "2":
						System.out.println("\n\n");
						question = "0";
						break;
					default:
						System.out.println("\nInput not accepted, try again.");
						question = "1A";
						break;
					}
				break;
				
			case "2A":
				System.out.println("Hello, " + name + "\n[1]Hello...\n[2]WHo the hell are you?");
				question = "3";
				break;
			case "3":
				}
		
			}
	
		}
	}
}
