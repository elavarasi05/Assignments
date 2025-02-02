package com.assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1
		String [][][] semester = {
			{
				
				{"Mathematics I","78"},
				{"Physics" , "85"},
				{"Chemistry" , "91"},
				{"Computer Programming" , "74"},
				{"Engineering Drawing" , "88"},
				{"Basic Electrical Engg" , "79"}
			},
			
			{
				{"Mathematics II", "82"}, 
				{"Mechanics", "77"}, 
				{"Environmental Sci.", "93"},
	            {"Basic Electronics", "69"}, 
	            {"Engineering Physics", "84"}, 
	            {"Engineering Graphics", "90"}
			},
			{
			
				{"Data Structures", "88"}, 
				{"Discrete Mathematics", "81"}, 
				{"Digital Electronics", "76"},
				{"Operating Systems", "92"}, 
				{"Signals and Systems", "85"}, 
				{"Object-Oriented Prog.", "78"}
			
			},
			
			{
				{"Algorithms", "91"}, 
				{"Computer Networks", "73"}, 
				{"Database Systems", "89"},
	            {"Microprocessors", "80"}, 
	            {"Communication Eng.", "76"}, 
	            {"Software Engineering", "87"}
			},
			
			{
				{"Probability & Stats", "86"},
				{"Machine Learning", "88"}, 
				{"Compiler Design", "84"},
	            {"Theory of Computation", "95"},
	            {"Embedded Systems", "73"}, 
	            {"Computer Graphics", "90"}
			}
			
		};
		
		  //Print Semester 3 - Subject 4 and Subject 5 names
		System.out.println("Semester 3 - subject 4 Name:" +semester[2][3][0]);
		System.out.println("Semester 3 - subject 5 Name:" +semester[2][4][0]);
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println("Semester 5 - subject 3 Mark:" +semester[4][2][1]);
		System.out.println("Semester 5 - subject 6 Mark:" +semester[4][5][1]);
		
		
		// Alternate Method
        String[][][] sem = new String[5][6][2];
        
        sem[0] = new String[][] {
            {"Mathematics I", "78"},
            {"Physics", "85"},
            {"Chemistry", "91"},
            {"Computer Programming", "74"},
            {"Engineering Drawing", "88"},
            {"Basic Electrical Eng.", "79"}
        };

        sem[1] = new String[][] {
            {"Mathematics II", "82"},
            {"Mechanics", "77"},
            {"Environmental Sci.", "93"},
            {"Basic Electronics", "69"},
            {"Engineering Physics", "84"},
            {"Engineering Graphics", "90"}
        };

        sem[2] = new String[][] {
            {"Data Structures", "88"},
            {"Discrete Mathematics", "81"},
            {"Digital Electronics", "76"},
            {"Operating Systems", "92"},
            {"Signals and Systems", "85"},
            {"Object-Oriented Prog.", "78"}
        };

        sem[3] = new String[][] {
            {"Algorithms", "91"},
            {"Computer Networks", "73"},
            {"Database Systems", "89"},
            {"Microprocessors", "80"},
            {"Communication Eng.", "76"},
            {"Software Engineering", "87"}
        };

        sem[4] = new String[][] {
            {"Probability & Stats", "86"},
            {"Machine Learning", "88"},
            {"Compiler Design", "84"},
            {"Theory of Computation", "95"},
            {"Embedded Systems", "73"},
            {"Computer Graphics", "90"}
        };
      //Print Semester 3 - Subject 4 and Subject 5 names
      		System.out.println("Semester 3 - subject 4 Name:" +sem[2][3][0]);
      		System.out.println("Semester 3 - subject 5 Name:" +sem[2][4][0]);
      		
      		//Print Semester 5 - Subject 3 and Subject 6 marks
      		System.out.println("Semester 5 - subject 3: " +sem[4][2][0] + " and Mark = " +sem[4][2][1]);
      		System.out.println("Semester 5 - subject 6: " +sem[4][5][0] + " and Mark = " +sem[4][5][1]);
	}
}
