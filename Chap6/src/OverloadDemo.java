
public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		double a = getAverage(40.0, 50.0);
		a = getAverage(1.0, 2.0, 3.0);
		char m = getAverage('a', 'z');
		System.out.println(m);
		}
	public static int getAverage(int x, int y){
		return (int)getAverage((double)x, (double)y);
	}
		public static double getAverage(double first, double second){
			return (first + second)/ 2;
		}
		public static double getAverage(double first, double second, double third){
			return (first + second + third)/ 2;
		}
		public static char getAverage(char a, char b){
			return (char)(((int)a + (int)b)/ 2);
		}
}
