package com.tns.placement_management.service;

import com.tns.placement_management.dao.StudentDao;
import com.tns.placement_management.dao.StudentDaoImpl;
import com.tns.placement_management.entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;

	public StudentServiceImpl() 
	{
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) 
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	

	@Override
	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public Student searchStudentById(int id)
	{
	Student student = dao.searchStudentById(id);
	return student;
	}
	
	@Override
	public Student searchStudentByHallTicket(int hallTicketNo)
	{
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	

	@Override
	public int deleteStudentId(int id) {
		//Student student=dao.searchStudentById(id);
		dao.beginTransaction();
		dao.deleteStudentId(id);
		dao.commitTransaction();
		return id;
		// TODO Auto-generated method stub
		
	}
	
	

}
