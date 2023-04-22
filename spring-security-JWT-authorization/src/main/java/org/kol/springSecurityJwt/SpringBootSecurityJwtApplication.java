package org.kol.springSecurityJwt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}


	/*

	JWT stands for "JSON WEB TOKEN" for authorization

Jwt: is a way of communication between client & server securely without remember sessionId.

When Needed?
server authenticated you.
but for further interaction jwt came into picture.


PURPOSE TO COMMUNICATE WITH TWO PARTIES SEPARATELY

Authorization strategics
using token
1. session token(reference token)
2. json web token(valued token)


concept::
normally, if we want a page send url get page. if it is dynamics then  problem came

suppose if we LogIn internet bank application and, wants to access balance.
we don't need to remember user  on that session.

*static application have to remember

session token =session id+ cookies.

suppose call customer care, problem not solve. customer care give token to client,
client call next day, give token id. customer care will understand the problem no need explain again.

how to do. using cookies??

problem::
now days, application is deployed multiple server, loadbalancer through they are connected.

here 1st req goes to  server-1, same req next ges to server-2 , server might not remember server 1 session id.

solution:: shared cache called "redis". but redis down means all cached down,
another solution load balancer need to remember cache.

process:: customer sign a paper and give to client, client point  his problem,
came next day.

*sign is token here or jwt




jwt parts::
1. header
2. payload
3. signature


process::
1. client userid/psw
2. server- authentication --> 3.jwt
4. jwt sent t client
5  client :: hold or saved token on local storage or cookie
6. client to server:: next interaction pass token on "jwt in http header with cookie"
   for every req client put "authorization::Bearer jwt" put on header
7. server examine and valued the token

oAuth for secure:: its helps people don't steal jwt


 */

}
