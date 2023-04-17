package org.kol.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	/*
	2/5 Authorization concept:: Who can access which part
	Authorization Steps::
	 a)It is done by  extends "WebSecurityConfigurerAdapter" class

	 b)override configure method which takes "HttpSecurity" as parameter
	   ex:  protected void configure(HttpSecurity httpSecurity){}

	 c)Then mention what type of authentication like authorizeRequests

	 d)then configure as per request


 */

}
