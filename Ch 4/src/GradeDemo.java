
public class GradeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 30;
		//we set the grade so small
		//anything
		int maxGrade = Integer.MIN_VALUE;
		int minGrade = Integer.MAX_VALUE;
		double totGrade = 0; 
		double aveGrade;
		int i = 0;
		
		for(i = 1; i <= numOfStudents; i++){
			int curStudentGrade = random(50,100);
			//System.out.println(curStudentGrade);
			
			//totGrade = totGrade + curStudentGrade[i];
			//aveGrade[i] = totGrade/i;
			
			if(curStudentGrade > maxGrade){
			maxGrade = curStudentGrade;
			
			if(curStudentGrade < minGrade){
				minGrade = curStudentGrade;
			}
			
		}
			System.out.println("Current Student grade: " +curStudentGrade);
			totGrade += curStudentGrade;
		}
			aveGrade = totGrade / numOfStudents;
			System.out.println("The average student grade is: " + aveGrade);	
		System.out.println("The max student score is: " + maxGrade);
		System.out.println("The min student score is: " + minGrade);
		
			
	}
	public static int random(int min, int max){
		int range = max - min + 1;
		return (int)(range *Math.random())+ min;
	}
}
