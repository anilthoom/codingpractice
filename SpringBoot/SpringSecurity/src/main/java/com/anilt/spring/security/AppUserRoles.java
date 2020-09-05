/**
 * 
 */
package com.anilt.spring.security;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	AppUserRoles(Set<AppUserPermissions> permissions) {
		this.permissions = permissions;
	}

	public Set<AppUserPermissions> getPermissions(){
		return permissions;
	}
	public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
		
		Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
		.map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
		.collect(Collectors.toSet());
		
		permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
		return permissions;
	}
}
