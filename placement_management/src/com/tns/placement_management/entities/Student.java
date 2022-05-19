package com.tns.placement_management.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
private int id;
private String name;
public String college;
private int roll;
public String qualification;
public String course;
public int year;
public String certificate;
public int hallTicketNo;



public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}



public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}


public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}




public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}




public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}


public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}



public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
/*public String getCertificate() {
	return certificate;
}
public void setCertificate(String certificate) {
	this.certificate = certificate;
}*/
public long getHallTicketNo() {
	return hallTicketNo;
}
public void setHallTicketNo(int hallTicketNo) {
	this.hallTicketNo = hallTicketNo;
}

@Override
public String toString() {
	return "Student [id =" + id + ",name =" + name + ",college =" + college + ",roll =" + roll + ",qualification =" + qualification + ",course =" + course + ",year =" + year + ",hallTicketNo =" + hallTicketNo + "]";
}
}

			

