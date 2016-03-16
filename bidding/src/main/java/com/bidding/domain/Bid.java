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

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="bid")
public class Bid {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bidId;
	
	@NotEmpty(message="{message.notempty}")
	private double bidAmount;
	
	@NotEmpty(message="{message.notempty}")
	private Date bidDate;
	
	@NotEmpty(message="{message.notempty}")
	private String bidStatus;
	
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


	public String getBidStatus() {
		return bidStatus;
	}


	public void setBidStatus(String bidStatus) {
		this.bidStatus = bidStatus;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}




//	public Product getProductId() {
//		return productId;
//	}
//
//
//	public void setProductId(Product productId) {
//		this.productId = productId;
//	}
	
	


}
