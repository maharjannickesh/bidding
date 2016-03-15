package com.bidding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bidding.domain.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	@ModelAttribute("product")
	public Product construct(){
		return new Product();
	}
	
	@RequestMapping(value="/add")
	public String addProduct(@ModelAttribute("product") Product product){
		return "product/addproduct";
	}
	
	
	
}
