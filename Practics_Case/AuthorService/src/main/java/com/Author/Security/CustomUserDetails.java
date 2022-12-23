package com.Author.Security;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.Author.Model.AuthorDetail;

public class  CustomUserDetails implements UserDetails{

	@Autowired
	AuthorDetail authorDetail;
	
	
	
	public CustomUserDetails(AuthorDetail authorDetail) {
		super();
		this.authorDetail = authorDetail;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		SimpleGrantedAuthority smpl=new SimpleGrantedAuthority(authorDetail.getAuthorEmail());
		return List.of(smpl);
		
	}

	@Override
	public String getPassword() {
 
		return authorDetail.getPassword();
	}

	@Override
	public String getUsername() {
	
		return authorDetail.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {

		return false;
	}

}
