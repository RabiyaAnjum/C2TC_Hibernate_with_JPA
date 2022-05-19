package com.tns.placement_management.dao;



import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tns.placement_management.entities.College;

/*+addCollege(College college) : College
+updateCollege(College college) : College
+searchCollege(long id): College
+deleteCollege(long id):Boolean
*/

public class CollegeDaoImplementation implements CollegeDao {
	private EntityManager entityManager;

	public CollegeDaoImplementation() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addCollege(College college) {
		// for insertion persist();
		entityManager.persist(college);
	}

	@Override
	public void updateCollege(College college) {
		// for update operation
		entityManager.merge(college);
	}

	@Override
//	public List<College> searchCollege(long id) {
	public College searchCollege(long id) {

		String tstr = "SELECT college FROM College college WHERE college.id = :pid";
		TypedQuery<College> query = entityManager.createQuery(tstr, College.class);
		query.setParameter("pid", id);
		College var_id = query.getSingleResult();
		return var_id;

//		Query query = (Query) entityManager.createNamedQuery("searchCollege");
//		@SuppressWarnings("unchecked")
//		List<College> collegeList = query.getResultList();
//		return collegeList;
	}

	@Override
	public void deleteCollege(long id) {
		// for delete operation
		College var1 = findCollegeById(id);
		entityManager.remove(var1);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public College findCollegeById(long id) {
		College collegefind = entityManager.find(College.class, id);
		return collegefind;
	}

	
}
