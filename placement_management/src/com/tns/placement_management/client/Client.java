package com.tns.placement_management.client;

import com.tns.placement_management.entities.Student;
import com.tns.placement_management.service.StudentService;
import com.tns.placement_management.service.StudentServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
    student.setId(400);
	student.setName("raju ");
	student.setQualification("BE");
	service.addStudent(student);
	
	
		
		
    // Retrieve Operation
		
		//student=service.searchStudentById(230);
		//System.out.println("ID is: "+student.getId());
		//System.out.println("Name is: "+student.getName());
		
		

       //Update Operation
		//student=service.searchStudentById(100);
	    //student.setName("rabi ");
	    //service.updateStudent(student);
		
		
	    //student=service.searchStudentById(100);
		//System.out.println("ID is: "+student.getId());
		//System.out.println("Name is: "+student.getName());
		
		// Delete Operation
		//student=service.deleteStudentId(100);
		//service.deleteStudentId(100);
		//student = service.searchStudentById(100);
		//service.deleteStudentId(100);
		//System.out.println("Row removed");
	    //System.out.println("sucessfully end");
	    
		
	}

}
