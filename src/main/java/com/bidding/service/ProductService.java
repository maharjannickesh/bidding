package com.bidding.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidding.domain.Product;
import com.bidding.domain.User;
import com.bidding.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void save(Product product) {
		productRepository.save(product);
		
	}

	public Object findAll() {
		return productRepository.findAll();
	}

	public List<Product> findByUserId(long userId) {
		return productRepository.findByuserId(userId);
	}

	public Object findOne(int id) {
		return productRepository.findOne((long) id);
	}

	public Product getProduct(int id) {
		return productRepository.findOne((long) id);
	}

	public List<Product> findValid() {
		return productRepository.findByProductEndDateAfter(new Date());
	}

	
	
	
}
