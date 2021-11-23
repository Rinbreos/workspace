
public class GPATester {

	public static void main(String[] args) {
		 double[] grade = new double[6];
	        
	        grade[0] = 4.00; // A
	        grade[1] = 3.50; //A/B
	        grade[2] = 3.00; //B
	        grade[3] = 2.50; // B/C
	        grade[4] = 2.00; // C
	        grade[5] = 1.00; // D
	        
	        //System.out.println(grade[0]);
	        
	        
	        int[] credit = new int[6];
	        credit[0] = 3;
	        credit[1] = 3;
	        credit[2] = 3;
	        credit[3] = 3;  
	        credit[4] = 3;
	        credit[5] = 3;
	        
	       WGPA g = new WGPA();
	        g.printArray(grade);
	        g.printGradeStats(grade);
	       System.out.println( g.convertToLetter(grade[2]));
	       g.printGPA(grade, credit);

	}

}
