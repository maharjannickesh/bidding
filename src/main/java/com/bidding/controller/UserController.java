package com.bidding.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bidding.domain.User;
import com.bidding.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User construct(){
		return new User();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addUser(@ModelAttribute("user") User user){
		return "user/adduser";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult result, RedirectAttributes redirectAttributes ){
		
		
		if (result.hasErrors()){
			return "user/adduser";
		}
		userService.save(user);
		redirectAttributes.addFlashAttribute("save", "User Added Sucessfully");
		return "redirect:/user/add";
	}
	
	@RequestMapping(value=" ", method = RequestMethod.GET)
	public String allUser(Model model){
		model.addAttribute("users", userService.findAll());
		return "user/allUser";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable int id ){
		userService.deleteUser(id);
		return "redirect:/user?delete=1";
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public @ResponseBody String validate(String username) {
		return "" + userService.isExisted(username);
	}
	
	
	
	
	
}
