package com.neweducation.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.neweducation.dpws.config.DpwsConfig;

@Configuration
@Import(DpwsConfig.class)
public class AppConfig {

}
