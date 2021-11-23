


public class WesternGPACalulator {
   
    public static void main(String[] args) {
        
        //TODO:
        //declare an array to hold the grades you earned in your classes
        //feel free to use fake values
        //declare at least 4 grades
        //use a 0.0 - 4.0 scale...
        //4.0 = A, 3.5 = A/B
        //3.0 = B, 2.5 = B/C 
        //2.0 = C
        //1.0 = D
        //0.0 = F
        //for example...
        //double[] grade = new double[4];
        //grade[0] = 4.00; // A
        //grade[1] = 2.50; // B/C
        //grade[2] = 2.00; // C
        //grade[3] = 1.00; // D
        
        
        //TODO:
        //use a method to print the min and max grades as letter grades
        //printGradeStats(grade);
        
        
        //TODO:
        //declare an array to hold the credits each class was worth
        //the indices must match the grade[i] indices for the class
        //for example...
        //int[] credit = new int[4];
        //credit[0] = 3;
        //credit[1] = 3;
        //credit[2] = 3;
        //credit[3] = 3;        
        
        //TODO:
        //use a method to calculate and print the GPA as both
        //a number and a letter grade
        //pass both the credit and grade arrays to the method
        //printGPA(grade, credit);
    }
    
    //TODO:
    //Finish this method which will accept an array of grades
    //and print the min and max letter grade
    private static void printGradeStats(double[] grade){
        
        //TODO:
        //First determine the min and max letter grade...
        
        
        //TODO:
        //convert the min and max grades to a letter grade...
        //using your convertToLetterGrade(grade) method
        //For example...
        //String maxLetterGrade = convertToLetterGrade(maxGrade);
                
        //TODO:
        //Output them...       
    }
    
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
    private static String convertToLetterGrade(double grade){
        
        String letterGrade = "F";
        
        return letterGrade;        
    }
    
    //TODO:
    //Finish this method which will accept an array of grades and credits
    //and print the cumulative GPA as a letter grade
    private static void printGPA(double[] grade, int[] credit){
    
        //Recall...GPA is just a weighted average...
        //Cumulative GPA is the sum of all grade points -- grade[i] * credit[i]
        //divided by the sum of all credits[i]
        
        //TODO:
        //Calculate cumulative GPA
               
        //TODO:
        //Output Cumulative GPA as both a number and a grade       
    }
}
