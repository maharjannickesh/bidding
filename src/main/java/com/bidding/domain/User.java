package com.bidding.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="{message.notempty}")
	@Size(min=4, message="{message.size}")
	private String userName;
	
	@NotEmpty(message="{message.notempty}")
	@Size(min=6, message="{message.size}")
	private String userPassword;
	
	@NotEmpty(message="{message.notempty}")
	@Email(message="message.email")
	private String userEmail;
	
	@NotEmpty(message="{message.notempty}")
	private String userRole;
	

//	@NotEmpty(message="{message.notempty}")
//	private Phone userPhone;
//	
//	@NotEmpty(message="{message.notempty}")
//	private Address userAddress;
	
	@OneToMany(mappedBy="user") 
	private List<Product> products;
	
	
	@OneToMany(mappedBy="user")
	private List<Bid> bidDetails;
	
	
	public List<Product> getProducts() {
		return products;
	}

	public List<Bid> getBidDetails() {
		return bidDetails;
	}

	public void setBidDetails(List<Bid> bidDetails) {
		this.bidDetails = bidDetails;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public User(){
		
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

//	public Phone getUserPhone() {
//		return userPhone;
//	}
//
//	public void setUserPhone(Phone userPhone) {
//		this.userPhone = userPhone;
//	}
//
//	public Address getUserAddress() {
//		return userAddress;
//	}
//
//	public void setUserAddress(Address userAddress) {
//		this.userAddress = userAddress;
//	}
	
	

}
