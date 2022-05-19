package com.tns.placement_management.service;
import com.tns.placement_management.entities.College;

/*+addCollege(College college) : College
+updateCollege(College college) : College
+searchCollege(long id): College
+deleteCollege(long id):Boolean
+schedulePlacement(Placement placement): boolean
*/
public interface CollegeService {

	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public abstract College searchCollege(long id);

	public abstract void deleteCollege(long id);
	
	public abstract College findCollegeById(long id);

	//public abstract Boolean schedulePlacement(Placement placement);
}
