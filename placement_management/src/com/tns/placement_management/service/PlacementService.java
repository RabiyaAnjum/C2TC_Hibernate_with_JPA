package com.tns.placement_management.service;

import com.tns.placement_management.entities.Placement;

public interface PlacementService {

    public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacement(long id);
	
	public abstract void cancelPlacement(long id);
}

