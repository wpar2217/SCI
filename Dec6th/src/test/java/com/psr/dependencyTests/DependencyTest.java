package com.psr.dependencyTests;

import org.testng.annotations.Test;

public class DependencyTest {
	static String trackingNumber = null;
	@Test(priority=0)
	public void CreateShipment() {
		System.out.println("Create Shipment");
		trackingNumber = "ABCDEF";
	}
	@Test(priority=1, dependsOnMethods = {"CreateShipment"}, alwaysRun = true)
	public void TrackShipment() throws Exception {
		if(trackingNumber !=null)
		    System.out.println("Track Shipment");
		else
			throw new Exception("inavalid tracking number");
	}
	@Test(priority=2, dependsOnMethods = {"CreateShipment"})
	public void CancelShipment() throws Exception {
		if(trackingNumber !=null)
		    System.out.println("Cancel Shipment");
		else
			throw new Exception("invalid tracking number");
		
	}
	

}
