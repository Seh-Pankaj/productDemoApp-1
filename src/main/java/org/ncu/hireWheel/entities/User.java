package org.ncu.hireWheel.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(nullable = false, unique = false)
	private String firstName;
	
	@Column(nullable = true, unique = false)
	private String lastName;
	
	@Size(min=5)
	@Column(nullable = false, unique = false)
	private String password;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = false)
	private String mobile;
	
	@Column(nullable = false, unique = true)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "roleId")
	private String roleId;
	
	@Column(nullable = false, unique = false)
	@Value("${default.walletmoney}")
	private String walletMoney;
}
