package com.bidding.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="{message.notempty}")
	@Size(min=4, message="{message.size}")
	private String productName;
	
	@NotEmpty(message="{message.notempty}")
	@Size(min=20, message="{message.size}")
	private String productDescription;
	
	@Transient
	private MultipartFile productImage;
	
	@NotEmpty(message="{message.notempty}")
	private Date productStartDate;
	
	@NotEmpty(message="{message.notempty}")
	@Future(message="{message.future}")
	private Date productEndDate;
	
	@NotEmpty(message="{message.notempty}")
	private double productInitialPrice;
	
	@NotEmpty(message="{message.notempty}")
	private boolean productStatus;

	@OneToOne
	private User user;
	
	@OneToMany(mappedBy="product")
	private List<Bid> bids;
	
	public Product(){
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	public Date getProductStartDate() {
		return productStartDate;
	}

	public void setProductStartDate(Date productStartDate) {
		this.productStartDate = productStartDate;
	}

	public Date getProductEndDate() {
		return productEndDate;
	}

	public void setProductEndDate(Date productEndDate) {
		this.productEndDate = productEndDate;
	}

	public double getProductInitialPrice() {
		return productInitialPrice;
	}

	public void setProductInitialPrice(double productInitialPrice) {
		this.productInitialPrice = productInitialPrice;
	}

	public boolean isProductStatus() {
		return productStatus;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public List<Bid> getBids() {
		return bids;
	}



	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}


	
	
	
}
