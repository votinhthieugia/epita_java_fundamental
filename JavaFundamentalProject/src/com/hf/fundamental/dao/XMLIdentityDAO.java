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


package com.hf.fundamental.dao;

import java.util.List;

import com.hf.fundamental.datamodel.Identity;

/**
 * Class XMLIdentityDAO
 * Implements IdentityDAOInterface
 * @author Favio
 * @version 1.0
 */
public class XMLIdentityDAO implements IdentityDAO {

	/* Implemented method */
	
	@Override
	public void create(Identity identity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Identity> readAll() {
		return null;
	}

	@Override
	public List<Identity> search(Identity identity) {
		return null;
	}

	@Override
	public void modify(Identity identity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Identity identity) {
		// TODO Auto-generated method stub	
	}
}