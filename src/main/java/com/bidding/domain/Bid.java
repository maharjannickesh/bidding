package com.bidding.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="bid")
public class Bid {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bidId;
	
	@NotNull
	private double bidAmount;
	
	
	private Date bidDate;
	
	
	private Boolean bidStatus;
	
	@OneToOne
	private User user;
	

	@OneToOne
	private Product product;
	
	
	public Bid(){
		
	}


	public Long getBidId() {
		return bidId;
	}


	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}


	public double getBidAmount() {
		return bidAmount;
	}


	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}


	public Date getBidDate() {
		return bidDate;
	}


	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}


	public Boolean getBidStatus() {
		return bidStatus;
	}


	public void setBidStatus(Boolean bidStatus) {
		this.bidStatus = bidStatus;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}





	
	


}
