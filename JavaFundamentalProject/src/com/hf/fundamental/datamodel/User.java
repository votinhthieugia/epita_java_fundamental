/**
 * @(#)User.java			14/01/2016
 * 
 * Copyright (c) 2016 EPITA.
 * 14/16 Rue Voltaire, 94276 Kremlin Bic�tre Cedex, France
 * 
 * Adapted with permission from JAVA CODE CONVENTIONS. Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. http://java.sun.com/docs/codeconv/
 *
 * This software is part of an academic project of EPITA  
 */


package com.hf.fundamental.datamodel;

/**
 * Class User
 * Inherits from Identity
 * @version 1.0
 * @author Favio
 *
 */
public class User extends Identity{
	
	String password;
	//Date access;

	public User(String password) {
		super();
		this.password = password;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [password=" + password + ", displayName=" + displayName + ", uid=" + uid + ", email=" + email
				+ ", attributes=" + attributes + "]";
	}
}
