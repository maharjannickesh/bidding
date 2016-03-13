package com.bidding.domain;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class BidDetail {
	
	private Long bidId;
	
	private double bidAmount;
	
	private Date bidDate;
	
	private String bidStatus;
	
	private User userId;
	
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
