package com.Author.Security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.Author.Model.AuthorDetail;
import com.Author.Service.IAuthorRepo;

public class UserDetailServiceImpl implements UserDetailsService    
   {

	@Autowired
	private IAuthorRepo authorRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// fetching user from data base
		
		AuthorDetail auth= authorRepo.findByName(username);		
		
		if(auth == null) {
			throw new UsernameNotFoundException("could not found user");
			
			
			}
		CustomUserDetails customdetails=new CustomUserDetails(auth);
		
		return customdetails;
		
		
	}

}
