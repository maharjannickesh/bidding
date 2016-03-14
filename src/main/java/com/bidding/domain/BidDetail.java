package com.bidding.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class BidDetail {
	
	
	@Id
	@GeneratedValue
	private Long bidId;
	
	@NotEmpty(message="{message.notempty}")
	private double bidAmount;
	
	@NotEmpty(message="{message.notempty}")
	private Date bidDate;
	
	@NotEmpty(message="{message.notempty}")
	private String bidStatus;
	
	@ManyToMany
	private User userId;
	
	@ManyToOne
	private Product productId;
	
	
	public BidDetail(){
		
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


	public User getUserId() {
		return userId;
	}


	public void setUserId(User userId) {
		this.userId = userId;
	}


	public Product getProductId() {
		return productId;
	}


	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	


}
