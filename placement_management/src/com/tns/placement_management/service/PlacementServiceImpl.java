package com.tns.placement_management.service;

import com.tns.placement_management.entities.Placement;
import com.tns.placement_management.dao.PlacementDao;
import com.tns.placement_management.dao.PlacementDaoImpl;

public class PlacementServiceImpl implements PlacementService{

    private PlacementDao dao;
	
	public PlacementServiceImpl() {
		dao = new PlacementDaoImpl();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public void cancelPlacement(long id) {
	  dao.beginTrancsaction();
	  dao.cancelPlacement(id);
	  dao.commitTransaction();
	}
		
}
