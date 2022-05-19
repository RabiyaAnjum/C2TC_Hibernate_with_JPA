
package com.tns.placement_management.service;

import com.tns.placement_management.entities.Student;

public interface StudentService 
{
	public  void addStudent(Student student);
	
	public  void updateStudent(Student student);
	
	public  Student searchStudentById(int id);
	
	public  Student searchStudentByHallTicket(int hallTicketNo);
	
	public  int deleteStudentId(int id);

	
	
}