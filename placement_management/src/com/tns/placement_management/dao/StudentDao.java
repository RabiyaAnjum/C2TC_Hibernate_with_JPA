package com.tns.placement_management.dao;

import com.tns.placement_management.entities.Student;

public interface StudentDao 
{
	// CRUD Operation
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student  searchStudentById(int id);
	
	public Student searchStudentByHallTicket(int ticketNo);
	
	public int deleteStudentId(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();
}
