
package com.tns.placement_management.client;

import com.tns.placement_management.entities.College;
import com.tns.placement_management.service.CollegeService;
import com.tns.placement_management.service.CollegeServiceImp;


public class collegeClient 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		College college=new College();
		
		CollegeService service = new CollegeServiceImp();
		
		// Create Operation
		
   college.setId(400);
    college.setCollegeAdmin("sir");
    college.setCollegeName(" KBN");
	service.addCollege(college);
	
	
		
		
        
	// Retrieve Operation
		//service.findStudentById(100);
		//System.out.println("ID is: "+student.getId());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
		//student  =service.searchStudentById(100);
	   // student.setName("rabiya aaa ");
	   // service.updateStudent(student);
	  //  System.out.println("successfully end");
		
		
	/*	service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());*/
		
		// Delete Operation
		//student=service.searchStudentById(100);
		//service.removeStudent(student);
		//System.out.println("Row removed");
	    
		
	}

}
