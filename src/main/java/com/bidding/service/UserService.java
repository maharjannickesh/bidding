package com.bidding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bidding.domain.User;
import com.bidding.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setUserPassword(encoder.encode(user.getUserPassword()));
		userRepository.save(user);
	}

	public Object findAll() {
		return userRepository.findAll();
	}

	public void deleteUser(int id) {
		userRepository.delete((long) id);
		
	}

	public User getUser(Long uId) {
		return userRepository.findOne(uId);
	}

	public User getUserByUsername(String name) {
		return userRepository.getUserByuserName(name);
	}

}
