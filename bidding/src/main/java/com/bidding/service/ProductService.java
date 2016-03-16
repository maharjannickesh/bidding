package com.bidding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidding.domain.Product;
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

	public Object findByUserId(long userId) {
		return productRepository.findByuserId(userId);
	}

	public Object findOne(int id) {
		return productRepository.findOne((long) id);
	}
	
	
}
