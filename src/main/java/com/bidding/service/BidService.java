package com.bidding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidding.domain.Bid;
import com.bidding.domain.Product;
import com.bidding.domain.User;
import com.bidding.repository.BidRepository;

@Service
public class BidService {
	
	@Autowired
	private BidRepository bidrepository;
	
	@Autowired
	private UserService userService;

	public void save(Bid bid) {
		bidrepository.save(bid);
		
	}

	public List<Bid> getbyuserId(Long uId) {
		
		
		return bidrepository.getByUser( userService.getUser(uId));
	}

	public List<Bid> getPrevioudBids(User user, Product product) {
		return bidrepository.getPreviousBids(user, product);
		
	}

	

}
