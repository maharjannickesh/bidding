package com.bidding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bidding.domain.Bid;

@Controller
@RequestMapping(value="/bid")
public class BidController {
	
	@ModelAttribute("bid")
	public Bid construct(){
		return new Bid();
	}
	
	@RequestMapping("/add")
	public String addBid(@ModelAttribute("bid") Bid bid){
		return "bid/addbid";
	}

}
