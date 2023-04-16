package org.kol.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	/*
	1/5 Authentication concept:: who is user
	Authentication::
	 a)It is done by  extends "WebSecurityConfigurerAdapter" class

	 b)override configure method which takes "AuthenticationManagerBuilder" as parameter
	   ex: configure(AuthenticationManagerBuilder authenticationManagerBuilder){}

	 c)Then mention what type of authentication like inMemoryAuthentication, or Jdbc or ldap

	 d)set userId, password, roles

	 e)multiple userId, psw, roles (optional step)


 */

}
