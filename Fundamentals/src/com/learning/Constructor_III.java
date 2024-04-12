package com.learning;

class Vehicle{
	int vehicleId;
	String vehicleType;
	String vehicleName;
	
	Vehicle(int id,String type,String name){
		vehicleId = id;
		vehicleType = type;
		vehicleName = name;
	}
	
	Vehicle(Vehicle v2){
		vehicleId =v2.vehicleId;
		vehicleType = v2.vehicleType;
		vehicleName = v2.vehicleName;
	}
	
	
	public void showDetails(){
		System.out.println("VehicleId:"+vehicleId);
		System.out.println("VehicleType:"+vehicleType);
		System.out.println("VehicleName:"+vehicleName);
		System.out.println("__________________________");
	}
	
}

public class Constructor_III {

	public static void main(String[] args) {
		Vehicle vehicle =new Vehicle(101, "fourWheeler", "Audi");
		vehicle.showDetails();
		
		Vehicle v2 = new Vehicle(vehicle);
		v2.showDetails();

	}

}
