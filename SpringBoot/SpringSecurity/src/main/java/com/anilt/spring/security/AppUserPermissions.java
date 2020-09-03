/**
 * 
 */
package com.anilt.spring.security;

/**
 * @author anilt
 *
 */
public enum AppUserPermissions {
	STUDENT_READ("student:read"), 
	STUDENT_WRITE("student:write"), 
	COURSE_READ("course:read"), 
	COURSE_WRITE("course:write");
	
	private final String permission;
	
	AppUserPermissions(String permission) {
		this.permission = permission;
	}
	
	public String getPermission() {
		return permission;
	}
}
