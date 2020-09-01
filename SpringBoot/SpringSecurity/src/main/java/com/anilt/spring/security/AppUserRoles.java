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

	STUDENT(Sets.newHashSet()),
	TEACHER(Sets.newHashSet());
	
	private final Set<AppUserPermissions> permissios;

	/**
	 * @param permissios
	 */
	private AppUserRoles(Set<AppUserPermissions> permissios) {
		this.permissios = permissios;
	}
	
}
