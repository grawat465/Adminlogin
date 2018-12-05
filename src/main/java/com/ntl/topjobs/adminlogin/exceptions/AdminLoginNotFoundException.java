/**File name=AdminLogin
 * Author=Govind Singh
 * Date=27/12/2018
 */


package com.ntl.topjobs.adminlogin.exceptions;

public class AdminLoginNotFoundException extends RuntimeException {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public AdminLoginNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return "AdminLoginNotFound";
	}

}



