package com.horizon.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserContextServiceImpl implements UserContextService
{

	private static final SecureRandom RANDOM;
	
	static {
	        try        {
	        	RANDOM = SecureRandom.getInstance("SHA1PRNG");
	        } catch(NoSuchAlgorithmException e){
	            throw new IllegalStateException(e);
	        }
	    }
	  
	  private static final int HASHING_ROUNDS = 10;
	
	  
	  
	  private static final Logger logger = LogManager.getLogger();

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException 
	{
		return null;
	}

}
