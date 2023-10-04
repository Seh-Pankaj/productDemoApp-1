package org.ncu.hireWheel.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Role {
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	
	@Column(nullable = false, unique = true)
	private String roleName;

}
