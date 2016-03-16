package com.bidding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidding.domain.Bid;
import com.bidding.repository.BidRepository;

@Service
public class BidService {
	
	@Autowired
	private BidRepository bidrepository;

	public void save(Bid bid) {
		bidrepository.save(bid);
		
	}

//	public Object getbyuserId(Long uId) {
//		return bidrepository.getbyuserId(uId);
//	}

	

}
