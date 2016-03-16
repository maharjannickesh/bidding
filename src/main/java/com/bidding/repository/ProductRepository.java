package com.bidding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bidding.domain.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long>{

	Object findByuserId(long userId);

}
