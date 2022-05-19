package com.tns.placement_management.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "college")
//@NamedQueries(@NamedQuery(name = "searchCollege", query = "find(College.class, id)"))


public class College implements Serializable {
	// after implementing serializable,
	// for communication to take place in the form
	// of byte stream,
	// we have to provide some serial number or identifier.
	private static final long serialVersionUID = 1L;
	@Id
	@JoinColumn(name="collegeId")
	private long id;
	
	private String collegeAdmin;
	
	private String collegeName;

	
	private String location;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName + ", location="
				+ location + "]";
	}
}
