import java.util.Scanner;
public class EggBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfBaskets, eggsPerBasket, totalEggs;
		Scanner s = new Scanner(System.in);
		System.out.println("How many eggs per basket?");
		eggsPerBasket = s.nextInt();
		System.out.println("How man baskets");
		numberOfBaskets = s.nextInt();
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("Total eggs: " + totalEggs);
		
		

	}

}
