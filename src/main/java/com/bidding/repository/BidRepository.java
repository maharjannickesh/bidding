package com.bidding.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bidding.domain.Bid;

@Repository
public interface BidRepository  extends JpaRepository<Bid, Long>{

//	@Query("SELECT b FROM bid where user_id = :userId")
//	Object getbyuserId(@Param("userId") Long uId );

	

}
