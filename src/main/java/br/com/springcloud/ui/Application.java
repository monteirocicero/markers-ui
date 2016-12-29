package br.com.springcloud.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableWebSecurity
public class Application {

	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
		return new WebSecurityConfigurerAdapter() {
			protected void configure(HttpSecurity http) throws Exception {
				http.httpBasic().disable();
				http.authorizeRequests().antMatchers("/**").anonymous();

			}

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
