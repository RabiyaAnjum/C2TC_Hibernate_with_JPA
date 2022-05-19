package com.tns.placement_management.dao;


import com.tns.placement_management.entities.College;

public interface CollegeDao {

	public abstract College findCollegeById(long id);

	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	//public abstract List<College> searchCollege(long id);
	public abstract College searchCollege(long id);

	public abstract void deleteCollege(long id);

	void beginTransaction();

	void commitTransaction();

}
