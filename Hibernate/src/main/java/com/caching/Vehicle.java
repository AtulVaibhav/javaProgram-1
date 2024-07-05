package com.caching;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY)
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int vehicleId;
    private String vehicleName;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
    
}
