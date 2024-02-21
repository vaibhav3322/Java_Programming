package com.codewithvs.backend.exception;

public class UserNotFoundException extends RuntimeException{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7238445060623421713L;

	public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
