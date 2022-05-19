package com.tns.placement_management.client;

//package com.tns.placement_management;
import com.tns.placement_management.entities.Placement;
import com.tns.placement_management.service.*;

public class PlacementClient {

	public static void main(String[] args) {
		
		PlacementService service = new PlacementServiceImpl();
		Placement placement = new Placement();

		//create Operation 
		try {
			placement.setidLong(201l);
			placement.setname("mahi");
			placement.setcollege("KBN COLLEGE");
			placement.setdate("1st Feb");
			placement.setqualification("BE");
			placement.setyear(2022l);
			service.addPlacement(placement);
		}
		catch(Exception e) {
			System.out.println("ID already registered...");
		}
		
		/* Retrieve Operation
		try{
			placement = service.searchPlacement(205);
			System.out.print("ID:"+ placement.getid());
			System.out.println("Name:"+placement.getname());
			System.out.println("College Name :" + placement.getcollege());
			System.out.println("Date : " + placement.getdate());
			System.out.println("Qualification : " + placement.getqualification());
			System.out.println("Year : " + placement.getyear());
			service.searchPlacement(205);
			System.out.println("One Record Retrieved......");
		
		}
		catch(Exception e) {
			System.out.println("ID not found...");
			
		}*/
		
		
		// Update Operation
		/*placement = service.searchPlacementByid(205);
		placement.setidLong(506l);
        placement.setname("Rudra");
        placement.setcollege("SSVPM");
        placement.setdate("28 August");
        placement.setqualification("BSC");
        placement.setyear(2018l);
        service.updatePlacement(placement);*/
        
      /*at this breakpoint, we have updated record added in first section
        placement = service.searchPlacement(205);
      	System.out.print("ID:"+placement.getid());
      	System.out.println("Name:"+placement.getname());
      	System.out.println("College Name :" + placement.getcollege());
		System.out.println("Date : " + placement.getdate());
		System.out.println("Qualification : " + placement.getqualification());
		System.out.println("Year : " + placement.getyear());
      	
		/*Delete Operation
		placement = service.searchPlacement(205);
		service.cancelPlacement(205);
		System.out.println("Done.....");*/
		
	System.out.println("Task ended");

	}

}
