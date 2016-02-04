/**
 * @(#)Identity.java			14/01/2016
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

/**
 * Class Identity
 * @version 1.0 14 Jan 2016
 * @author Favio TEJADA
 */
public class Identity {
	
	String 			   displayName;
	String 			   uid;
	String 			   email;
	Map<String,String> attributes;
		
	public Identity() {
		super();
	}
	
	public Identity(String displayName, String uid, String email, Map<String, String> attributes) {
		super();
		this.displayName = displayName;
		this.uid = uid;
		this.email = email;
		this.attributes = attributes;
	}
	
	public Identity(String displayName, String uid, String email, String attributesString) {
		this.displayName = displayName;
		this.uid = uid;
		this.email = email;
		Map<String, String> attributes = new HashMap<String, String>();
		
		try {
			JSONObject attributesJson = new JSONObject(attributesString);
			@SuppressWarnings("unchecked")
			Iterator<String> keys = attributesJson.keys();
			
			while (keys.hasNext()) {
				String key = keys.next();
				attributes.put(key, attributesJson.getString(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.attributes = attributes;
	}
	
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the attributes
	 */
	public Map<String, String> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	
	/**
	 * @return attributes string in json string format.
	 */
	public String getAttributesString() {
		JSONObject json = new JSONObject();
		
		try {
			for (Map.Entry<String, String> entry: attributes.entrySet()) {
				json.put(entry.getKey(), entry.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return json.toString();
	}
	
	@Override
	public String toString() {
		return "Identity [displayName=" + displayName + ", uid=" + uid + ", email=" + email + ", attributes="
				+ attributes + "]";
	}
}
