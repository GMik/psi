package com.neweducation.application.config;

import com.neweducation.application.security.Authenticator;
import com.neweducation.application.security.AuthenticatorImpl;
import com.neweducation.application.security.NotAuthenticatedException;
import com.neweducation.application.security.UserDetails;
import com.neweducation.data.persistence.entities.general.Uzytkownik;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.neweducation.dpws.config.DpwsConfig;

@Configuration
@Import(DpwsConfig.class)
public class AppConfig {

    @Bean
    Authenticator authenticator(){return new AuthenticatorImpl();}
}
