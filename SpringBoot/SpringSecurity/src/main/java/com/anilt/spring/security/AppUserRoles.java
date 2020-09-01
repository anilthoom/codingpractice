/**
 * 
 */
package com.anilt.spring.security;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * @author anilt
 *
 */
public enum AppUserRoles {

	STUDENT(Sets.newHashSet(AppUserPermissions.COURSE_READ, AppUserPermissions.STUDENT_READ, AppUserPermissions.STUDENT_WRITE)),
	TEACHER(Sets.newHashSet(AppUserPermissions.COURSE_READ, AppUserPermissions.COURSE_WRITE, AppUserPermissions.STUDENT_READ, AppUserPermissions.STUDENT_WRITE));
	
	private final Set<AppUserPermissions> permissions;

	/**
	 * @param permissions
	 */
	private AppUserRoles(Set<AppUserPermissions> permissions) {
		this.permissions = permissions;
	}
	
}
