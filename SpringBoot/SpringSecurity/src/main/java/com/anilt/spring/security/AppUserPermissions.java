/**
 * 
 */
package com.anilt.spring.security;

/**
 * @author anilt
 *
 */
enum AppUserPermissions {
	STUDENT_READ, STUDENT_WRITE, COURSE_READ, COURSE_WRITE;
	
	private final String permission;
	

	private AppUserPermissions() {
	}

	AppUserPermissions(String permission) {
		this.permission = permission;
	}
	
	public String getPermission() {
		return permission;
	}
}
