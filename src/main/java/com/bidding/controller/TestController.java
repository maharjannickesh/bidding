package com.bidding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * This is an test controller
 * @author nick
 *
 */
@Controller
public class TestController {

	@RequestMapping("/")
	public String test() {
		return "test";
	}
	
	/**
	 * 
	 * @return test message
	 */
	@RequestMapping("/testSecurity")
	public String testSecurity() {
		return "test";
	}
}
