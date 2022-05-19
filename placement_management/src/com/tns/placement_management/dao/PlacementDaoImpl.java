package com.tns.placement_management.dao;
import javax.persistence.EntityManager;

import com.tns.placement_management.entities.Placement;


public class PlacementDaoImpl implements PlacementDao {
	
	private EntityManager entityManager;

	public PlacementDaoImpl() {
		
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public void addPlacement(Placement placement) {
	
		entityManager.persist(placement);
	}

	@Override
	public void updatePlacement(Placement placement) {
		
		entityManager.merge(placement);
		
	}
	@Override
	public Placement searchPlacement(long id) {
		
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}
	
	@Override
	public void cancelPlacement(long id)
	{
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);
	}
	
	@Override
	public void beginTrancsaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	
}