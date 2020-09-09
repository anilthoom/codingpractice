package com.anilt.spring.security.basicauth;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.anilt.spring.security.AppUserPermissions;
import com.anilt.spring.security.AppUserRoles;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class StudentSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final PasswordEncoder passwordEncoder;
	
	@Autowired
	public StudentSecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/","index","css/*", "/js/*").permitAll()
		.antMatchers("/api/**").hasAnyRole(AppUserRoles.STUDENT.name(), AppUserRoles.ADMIN.name(), AppUserRoles.ADMINTRAINEE.name())//all
//		.antMatchers(HttpMethod.DELETE, "/management/api/**").hasAuthority(AppUserPermissions.COURSE_WRITE.getPermission())//anil
//		.antMatchers(HttpMethod.POST, "/management/api/**").hasAuthority(AppUserPermissions.COURSE_WRITE.getPermission())//anil
//		.antMatchers(HttpMethod.PUT, "/management/api/**").hasAuthority(AppUserPermissions.COURSE_WRITE.getPermission())// anil
//		.antMatchers(HttpMethod.GET, "/management/api/**").hasAnyRole(AppUserRoles.ADMIN.name(), AppUserRoles.ADMINTRAINEE.name())// anil, ramya
		.anyRequest()
		.authenticated()
		.and()
//		.httpBasic(); 	
		.formLogin()
		.loginPage("/login").permitAll()
		.defaultSuccessUrl("/courses", true)
		.and()
		.rememberMe();//Default 2 weeks
		
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails anilUser =  User.builder()
		.username("anil")
		.password(passwordEncoder.encode("anil"))
//		.roles(AppUserRoles.ADMIN.name(), AppUserRoles.STUDENT.name())
		.authorities(AppUserRoles.ADMIN.getGrantedAuthorities())
		.build();
		UserDetails ramyaUser =  User.builder()
				.username("ramya")
				.password(passwordEncoder.encode("ramya"))
//				.roles(AppUserRoles.ADMINTRAINEE.name())
				.authorities(AppUserRoles.ADMINTRAINEE.getGrantedAuthorities())
				.build();
		UserDetails shrihanUser =  User.builder()
				.username("shrihan")
				.password(passwordEncoder.encode("shrihan"))
//				.roles(AppUserRoles.STUDENT.name())
				.authorities(AppUserRoles.STUDENT.getGrantedAuthorities())
				.build();
		UserDetails shrithaUser =  User.builder()
				.username("shritha")
				.password(passwordEncoder.encode("shritha"))
//				.roles(AppUserRoles.STUDENT.name())
				.authorities(AppUserRoles.STUDENT.getGrantedAuthorities())
				.build();
		return new InMemoryUserDetailsManager(anilUser, shrihanUser, shrithaUser, ramyaUser);
	}

}
