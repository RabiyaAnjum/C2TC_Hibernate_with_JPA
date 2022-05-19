package com.tns.placement_management.service;

import com.tns.placement_management.dao.CollegeDao;
import com.tns.placement_management.dao.CollegeDaoImplementation;
import com.tns.placement_management.entities.College;

public class CollegeServiceImp implements CollegeService {

	private CollegeDao dao;

	public CollegeServiceImp() {
		dao = new CollegeDaoImplementation();
	}

	@Override
	public void addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
	}

	@Override
	public void updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
	}

	@Override
	public College searchCollege(long id) {
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public void deleteCollege(long id) {
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTransaction();
	}

	@Override
	public College findCollegeById(long id) {
		return dao.findCollegeById(id);
	}

	

}
