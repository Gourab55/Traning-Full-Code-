package com.Author.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Author.Model.AuthorDetail;

@Service
public class AuthorService {
	
	@Autowired
	IAuthorRepo iauthRepo;
	
	public Integer SaveAuthor(AuthorDetail auth) {
		AuthorDetail a1= iauthRepo.save(auth);
		return a1.getAid();
	} 
	
	public List<AuthorDetail> getAllAuthors(){
		return iauthRepo.findAll();
	}
	
    public Optional<AuthorDetail> getAuthorById(Integer aid){
    	return iauthRepo.findById(aid);
    }
    
   public AuthorDetail GetAuthorByname(String username){
    	
   	return iauthRepo.findByName(username);  	
   }
	
	
	

}
