package HanoiTowers;
import java.util.*;


public class HanoiTower {
	public class HanoiTowers{
		 public static void main(String[] args) {
			 	int disks = 3;
			 	hanoiTowers(disks, 'Z', 'G', 'Y');
				
		 }
		
		private static void hanoiTowers(int disk, char from, char inter, char to) {
			if(disk == 1) {
				System.out.println("Currently moving disk 1 from the pole " + from + " to the pole " + to);
				return;
			}
			hanoiTowers(disk -1, from, inter, to);
			System.out.println("Moving current disk " + disk + " from  pole " + from + " toPole " + to);
			hanoiTowers(disk -1, inter, to, from); 	
		}
			
	}

}
