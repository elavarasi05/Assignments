package com.assignments;

public class Assignment3_EmployeeGroups extends Assignment3_Employees{
	
	public static void main(String[] args) {
		
		// Arrays to store employee names and IDs
	    String[] empNames = new String[3];
	    int[] empIDs = new int[3];	   
	    
	    //get the name and Id from parent
	        Assignment3_Employees emp = new Assignment3_Employees();
	        empNames[0] = emp.empName1;
	        empNames[1] = emp.empName2;
	        empNames[2] = emp.empName3;
	        
	        empIDs[0] = emp.empID1;
	        empIDs[1] = emp.empID2;
	        empIDs[2] = emp.empID3;
	        
	        //Print employees name and their Id's
	        System.out.println("Employee Name: " + empNames[0] + ", Employee ID: " + empIDs[0]);
	        System.out.println("Employee Name: " + empNames[1] + ", Employee ID: " + empIDs[1]);
	        System.out.println("Employee Name: " + empNames[2] + ", Employee ID: " + empIDs[2]);
		
	    
	    }
		
		
	}

