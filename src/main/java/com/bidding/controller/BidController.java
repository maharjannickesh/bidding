package com.bidding.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bidding.domain.Bid;
import com.bidding.domain.Product;
import com.bidding.domain.User;
import com.bidding.service.BidService;
import com.bidding.service.ProductService;
import com.bidding.service.UserService;

@Controller
@RequestMapping(value="/bid")
public class BidController {
	
	@Autowired
	private BidService bidService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@ModelAttribute("bid")
	public Bid construct(){
		return new Bid();
	}
	
	@RequestMapping("/add")
	public String addBid(@ModelAttribute("bid") Bid bid){
		return "bid/addbid";
	}
	
	
	
//	@RequestMapping(value="/mybid", method = RequestMethod.GET)
//	public String myBid(Model model, HttpServletRequest request){
//		Object userId = request.getSession().getAttribute("userId");
//		Long uId = (Long) userId;
//		model.addAttribute("bids", bidService.getbyuserId(uId));
//		return "bid/mybid";
//	}

}
