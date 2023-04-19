package org.kol.security;

//import org.kol.security.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = org.kol.security.repository.UserRepository.class)
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
