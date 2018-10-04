package com.mpt.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/api/tickets/**").hasAnyRole("USER","ADMIN").and().formLogin();
		http.csrf().disable().authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("ADMIN").and().formLogin();
	}
	
	@Autowired
	public void configureGlobalBuilder(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Jeet").password("{noop}123").roles("USER");
		auth.inMemoryAuthentication().withUser("Jitu").password("{noop}1234").roles("USER","ADMIN");
	}
}
