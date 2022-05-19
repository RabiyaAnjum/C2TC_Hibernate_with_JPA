package com.tns.placement_management.dao;

import com.tns.placement_management.entities.Placement;

public interface PlacementDao {

	public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacement(long id);

	public abstract void beginTrancsaction();

	public abstract void cancelPlacement(long id);

	public abstract void commitTransaction();
}
