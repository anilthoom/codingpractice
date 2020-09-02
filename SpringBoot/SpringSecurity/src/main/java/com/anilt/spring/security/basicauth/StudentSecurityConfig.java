package com.anilt.spring.security.basicauth;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.anilt.spring.security.AppUserRoles;

@Configuration
@EnableWebSecurity
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
		.antMatchers("/api/**").hasRole(AppUserRoles.STUDENT.name())
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails anilUser =  User.builder()
		.username("anil")
		.password(passwordEncoder.encode("anil"))
		.roles(AppUserRoles.ADMIN.name(), AppUserRoles.STUDENT.name())
		.build();
		UserDetails ramyaUser =  User.builder()
				.username("ramya")
				.password(passwordEncoder.encode("ramya"))
				.roles(AppUserRoles.ADMINTRAINEE.name())
				.build();
		UserDetails shrihanUser =  User.builder()
				.username("shrihan")
				.password(passwordEncoder.encode("shrihan"))
				.roles(AppUserRoles.STUDENT.name())
				.build();
		UserDetails shrithaUser =  User.builder()
				.username("shritha")
				.password(passwordEncoder.encode("shritha"))
				.roles(AppUserRoles.STUDENT.name())
				.build();
		return new InMemoryUserDetailsManager(anilUser, shrihanUser, shrithaUser, ramyaUser);
	}

}
