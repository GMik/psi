package com.neweducation.application.security;

import dtos.UserTo;
import org.springframework.stereotype.Component;

@Component
public interface Authenticator {
    public UserTo authenticateUser(String authToken) throws NotAuthenticatedException;
}
