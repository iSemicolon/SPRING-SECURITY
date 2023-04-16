package org.kol.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {


    //Authentication:
    @Override
    protected  void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {

        //Set configuration on the authenticationManagerBuilder object

        //Mention what type of memory operation needed

        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("EMP_USER")
                .password("emp")
                .roles("USER")
                .and()// for multiple authentication
                .withUser("CLIENT_ADMIN")
                .password("client")
                .roles("ADMIN");

    }

    //We don't want to store password as a string text format. So we have to make it as encoded
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


    //Authorization:
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests() //type of authorisation
                    .antMatchers("/admin").hasRole("ADMIN") // localhost:8080/admin -> Access by Only ADMIN, not USER
                    .antMatchers("/user").hasAnyRole("USER","ADMIN") // localhost:8080/user -> Access by Both ADMIN, USER
                    .antMatchers("/").permitAll() // access by USER, ADMIN
                    .and().formLogin();

    }

}