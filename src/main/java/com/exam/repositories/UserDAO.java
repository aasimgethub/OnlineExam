package com.exam.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, String>, CrudRepository<User, String> {

	@Query("SELECT u FROM user_details_trials u WHERE u.userName LIKE %?1%")
	User findByUsername(@Param("userName") String userName);

	@Modifying
	@Query("DELETE user_details_trials c WHERE c.userName= ?1")
	void deleteByName(@Param("userName") String userName);

	@Query("SELECT u FROM user_details_trials u WHERE u.userEmail =?1")
	Boolean findByUserEmail(@Param("userEmail") String userEmail);

	User findByUserId(String userId);

}
