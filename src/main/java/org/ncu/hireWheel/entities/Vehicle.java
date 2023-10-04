package org.ncu.hireWheel.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;
	
	@Column(nullable = false, unique = false)
	private String vehicleModel;
	
	@Column(nullable = false, unique = true)
	private String vehicleNumber;
	
	@Column(nullable = true, unique = false)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "vehicleSubcategoryId")
	private String vehicleSubcategoryId;
	
	@Column(nullable = false, unique = false)
	private String color;
	
	@Column(nullable = false, unique = false)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "locationId")
	private String locationId;
	
	@Column(nullable = false, unique = false)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "fuelTypeId")
	private String fuelTypeId;
	
	@Column(nullable = false, unique = false)
	private String availabilityStatus;
	
	@Column(nullable = false, unique = false)
	private String vehicleImageUrl;
}
