package com.bidding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bidding.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User getUserByuserName(String user);
}
