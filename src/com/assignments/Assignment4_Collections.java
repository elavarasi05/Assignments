package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<String,Object>> employees = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> employee1 = new HashMap<>();
			
		employee1.put("id", "E001");
		employee1.put("Name","Alice Green");
		employee1.put("Age","30");
		employee1.put("Gender","Female");
		employee1.put("Department","Engineering");
		employee1.put("Position","Software Engineer");
		employee1.put("Salary","75,000");
		employee1.put("Email","alice@example.com");
		employee1.put("Contact Number","9876543213");
		
		Map<String, Object> employee2 = new HashMap<>();
		
		employee2.put("id", "E002");
		employee2.put("Name","Bob Johnson");
		employee2.put("Age","35");
		employee2.put("Gender","Male");
		employee2.put("Department","Marketing");
		employee2.put("Position","Marketing Manager");
		employee2.put("Salary","85,000");
		employee2.put("Email","bob@example.com");
		employee2.put("Contact Number","9876543214");
		
		Map<String, Object> employee3 = new HashMap<>();
		
		employee3.put("id", "E003");
		employee3.put("Name","Carol White");
		employee3.put("Age","28");
		employee3.put("Gender","Female");
		employee3.put("Department","Sales");
		employee3.put("Position","Sales Executive");
		employee3.put("Salary","65,000");
		employee3.put("Email","carol@example.com");
		employee3.put("Contact Number","98765443215");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		System.out.println("Second Employee email Id : " +employees.get(1).get("Email"));
		
		
	}

}
