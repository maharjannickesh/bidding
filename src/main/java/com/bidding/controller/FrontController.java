package com.bidding.controller;

import java.util.Date;

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
public class FrontController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BidService bidService;
	

	@RequestMapping(value = "/")
	public String frontPage(Model model) {
		model.addAttribute("product", productService.findAll());
		return "frontend/index";
	}
	
	@RequestMapping(value = "/bid/details/{id}", method = RequestMethod.GET)
	public String productDetails(Model model, @PathVariable int id, @ModelAttribute("bid") Bid bid) {
		model.addAttribute("product", productService.findOne(id));
		return "frontend/productdetails";
	}

	@RequestMapping(value = "/bid/details/{id}", method = RequestMethod.POST)
	public  String add(@ModelAttribute("bid") Bid bid, HttpServletRequest request, @PathVariable int id) {
		Object userId = request.getSession().getAttribute("userId");
		Long uId = (Long) userId;
		System.out.println(uId);
		User user = userService.getUser(uId);
		bid.setUser(user);
		
		Product product = productService.getProduct(id);
		bid.setProduct(product);
		
		bid.setBidStatus(true);
		
		bid.setBidDate(new Date());
		
		bidService.save(bid);
		
		
		
		return "redirect:/";
	}

	

}
