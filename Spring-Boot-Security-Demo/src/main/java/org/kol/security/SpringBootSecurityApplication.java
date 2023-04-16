package org.kol.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	/*
	5 concept::
	a)authentication,
	b)authorisation,
	c)principal,
	d)granted authority,
	e)roles

	Authentication: who is user
	knowledge based:  secret question, username password
	possessive based authentic: card swipe & enter
	multifactor:

	Authorisation::
	manager have all access but employee have certain access


	principal:: currently logged-in user or account

	gRAnted authority:: provide only these access not others

	roles:: group of authorise. new membership give them access to access provider




----Spring Security Default Behaviour---

1. Adds mandatory authentication for url
2.Adds login form
3.Handles login error
4.creates user and default password.

	default username: user
	default psw: 54182eca-ee46-4046-aded-a9dd9eea1ea2(check on console)

-- custom user-name ,password

	spring.security.user.name=ADMIN
	spring.security.user.password=root


 */

}
