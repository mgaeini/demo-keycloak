package com.example.demokeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableOAuth2Sso
public class DemoKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoKeycloakApplication.class, args);
	}

}
