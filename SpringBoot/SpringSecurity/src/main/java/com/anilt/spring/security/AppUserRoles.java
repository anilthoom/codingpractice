/**
 * 
 */
package com.anilt.spring.security;

import java.util.Set;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.Sets;

/**
 * @author anilt
 *
 */
public enum AppUserRoles {

	STUDENT(Sets.newHashSet(AppUserPermissions.COURSE_READ, AppUserPermissions.STUDENT_READ, AppUserPermissions.STUDENT_WRITE)),
	ADMIN(Sets.newHashSet(AppUserPermissions.COURSE_READ, AppUserPermissions.COURSE_WRITE, AppUserPermissions.STUDENT_READ, AppUserPermissions.STUDENT_WRITE)),
	ADMINTRAINEE(Sets.newHashSet(AppUserPermissions.COURSE_READ, AppUserPermissions.STUDENT_READ)),
	ZEROACCESS(Sets.newHashSet());
	
	private final Set<AppUserPermissions> permissions;

	/**
	 * @param permissions
	 */
	private AppUserRoles(Set<AppUserPermissions> permissions) {
		this.permissions = permissions;
	}
	
	public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
		
		return null;
	}
	
}
