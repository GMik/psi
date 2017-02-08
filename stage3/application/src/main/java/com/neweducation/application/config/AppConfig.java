package com.neweducation.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.neweducation.application.security.Authenticator;
import com.neweducation.application.security.AuthenticatorImpl;
import com.neweducation.dpws.config.DpwsConfig;

@Configuration
@Import(DpwsConfig.class)
public class AppConfig {

	@Bean
	Authenticator authenticator() {
		return new AuthenticatorImpl();
	}
}
