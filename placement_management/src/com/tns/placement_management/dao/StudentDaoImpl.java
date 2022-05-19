
package com.tns.placement_management.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tns.placement_management.entities.Student;

public class StudentDaoImpl implements StudentDao 
{
	private EntityManager entityManager;

	public StudentDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
		
	}
	@Override
	public Student addStudent(Student student)
	{
		entityManager.persist(student);
		return student;//no sql queries
	}
	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public Student searchStudentById(int id) {
		Student student=entityManager.find(Student.class,id);
		return student;
				// TODO Auto-generated method stub
	}
	@Override
	public Student searchStudentByHallTicket(int ticketNo) {
		// TODO Auto-generated method stub
		Student student=entityManager.find(Student.class,ticketNo);
		return student;
	}
	@Override
	public int deleteStudentId(int id) {
		Student student=entityManager.find(Student.class,id);
		return id;
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	/*@Override
	public void updateStudent(Student student)
	{
		entityManager.merge(student);
	}
	
	
	@Override
	public Student searchStudentById(int id)
	{
	 Student student =entityManager.find(Student.class,id);
		return student;
	}
	@Override
	public String searchStudentByHallTicket(int ticketNo) {
		String queryString = "select s.name from Student s where s.hallTicketNo=:hall";
		TypedQuery<String> query = entityManager.createQuery(queryString,String.class);
		query.setParameter("hall",ticketNo);
		String hallInfo = query.getSingleResult();
		return  hallInfo;
	}
	
	@Override
	public void deleteStudentId(int id)
	{
		entityManager.remove(id);
	}
	
	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}

	
		
	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	
*/
}
