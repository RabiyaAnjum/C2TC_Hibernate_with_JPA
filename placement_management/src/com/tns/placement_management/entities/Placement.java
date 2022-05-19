package com.tns.placement_management.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentplacementmanagement")

public class Placement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long idLong;
	
	private String name;
	
	private String college;
	
	private String date;
	
	private String qualification;
	
	private Long year;
	
	public Long getid() {
		
		return idLong;
		
	}
	public void setidLong(Long idLong) {
		
		this.idLong = idLong;
		
	}
	public String getname() {
		
		return name;
	}
	public void setname(String name) {
		
		this.name = name;
	}

	public String getdate() {
		
		return date;
	}

	public void setdate(String date) {
		
		this.date = date;
	}

	public String getqualification() {
		
		return qualification;
	}

	public void setqualification(String qualification) {
		
		this.qualification = qualification;
	}

	public Long getyear() {
		
		return year;
	}

	public void setyear(Long year) {
		
		this.year = year;
	}

	public String getcollege() {
		
		return college;
	}

	public void setcollege(String college) {
		
		this.college= college;
	}


	@Override
	public String toString() {
		
		return "Placement [id=" + idLong + ", Name=" + name + ", Date=" + date + ", qualification=" + qualification
				+ ", year=" + year + ", collegeName=" +"]";
	}
	

}