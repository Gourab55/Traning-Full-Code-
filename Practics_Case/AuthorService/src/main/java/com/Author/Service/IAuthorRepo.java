package com.Author.Service;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Author.Model.AuthorDetail;

@Repository
public interface IAuthorRepo extends JpaRepository<AuthorDetail, Integer>{
	
 @Query("select u from AuthorDetails u where u.usename= :username")
 public AuthorDetail findByName(@Param("username") String username);
//
}
