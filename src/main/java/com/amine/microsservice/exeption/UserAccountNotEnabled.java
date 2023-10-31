package com.amine.microsservice.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserAccountNotEnabled extends AuthenticationException {
    public UserAccountNotEnabled(String msg) {
        super(msg);
    }
}

