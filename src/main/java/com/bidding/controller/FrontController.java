package com.bidding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bidding.domain.Bid;
import com.bidding.service.ProductService;

@Controller
public class FrontController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/")
	public String frontPage(Model model){
		model.addAttribute("product", productService.findAll());
		return "frontend/index";
	}
	
	@RequestMapping(value="/bid/details/{id}")
	public String productDetails(Model model, @PathVariable int id, @ModelAttribute("bid") Bid bid){
		model.addAttribute("product", productService.findOne(id));
		return "frontend/productdetails";
	}
}
