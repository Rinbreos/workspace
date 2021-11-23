
public class WGPA {
	
	 public static void printArray(double[] grade){
     	
	        for(int i = 0; i < grade.length; i++){
	        	int classNumber = i+1;
	        	System.out.println("Class " + classNumber + ": " + grade[i]);
	        	}
	        }
	
	
	 public static void printGradeStats(double[] grade) {
	        
	        //TODO:
	        //First determine the min and max letter grade...
	   
		  	double maxGrade = grade[0];
	    	double minGrade = grade[0];
	    	
	    	for(int i = 0; i < grade.length; i++){
				double curr = grade[i];
				if(curr > maxGrade){
					maxGrade = curr;
				}
				
				if(curr < minGrade){
					minGrade = curr;
				}
			}
	    	 System.out.println("The smallest grade is: " + maxGrade);
	 		 System.out.println("The largest grade is: " + minGrade);
			}
	           
	    
	        
	        //TODO:
	        //convert the min and max grades to a letter grade...
	        //using your convertToLetterGrade(grade) method
	        //For example...
	        //String maxLetterGrade = convertToLetterGrade(maxGrade);
			public static String convertToLetter(double curGrade){
				
				String letterGrade = "F";
		
				if(curGrade >= 4 ){
					letterGrade = "A";
					return letterGrade;
				}else if(curGrade >= 3.5){
					letterGrade = "A/B";
					return letterGrade;
				}else if(curGrade >= 3){
					letterGrade = "B";
					return letterGrade;
				}else if(curGrade >= 2.5){
					letterGrade = "B/C";
					return letterGrade;
				}else if(curGrade >= 2){
					letterGrade = "C";
					return letterGrade;
				}else if(curGrade >= 1){
					letterGrade = "D";
					return letterGrade;
				}else 
					return letterGrade;
			
				
			
			}	    
	        //TODO:
	        //Output them...       
	   
	    
	    //TODO:
	    //Finish this method which will convert
	    //a grade on the 4.0 scale and return a letter grade
	    //Use the following scale...
	    //A = 4.0
	    //4.0 > A/B >= 3.5
	    //3.5 > B >= 3.0
	    //3.0 > B/C >= 2.5
	    //2.5 > C >= 2.0
	    //2.0 > D >= 1.0
	    //F < 1.0
	 public static String convertToLetterGrade(double grade){
	        
	        String letterGrade = "F";
	        
	        return letterGrade;        
	    }
	    
	    //TODO:
	    //Finish this method which will accept an array of grades and credits
	    //and print the cumulative GPA as a letter grade
	 public static void printGPA(double[] grade, int[] credit){
	    
	        //Recall...GPA is just a weighted average...
	        //Cumulative GPA is the sum of all grade points -- grade[i] * credit[i]
	        //divided by the sum of all credits[i]
	        
	        //TODO:
	        //Calculate cumulative GPA
		 double totalGpaPoints = 0;
		 double maxPossibleGpaPoints = 0;
		 double overallGpa;
		 for(int i = 0; i < grade.length; i++){
	    	double classGpa = grade[i] * credit[i];
	    	double maxGpa = 4 * credit[i];
	    	totalGpaPoints += classGpa;
	    	maxPossibleGpaPoints += maxGpa; 
		 } 
		 	overallGpa = (totalGpaPoints/maxPossibleGpaPoints)* 4;
		 	System.out.printf("Overall GPA: %.2f ", overallGpa);
		 	System.out.println("ovverall gpa as lettergrade = " + WGPA.convertToLetter(overallGpa));
	        //TODO:
	        //Output Cumulative GPA as both a number and a grade       
	    }
	}

