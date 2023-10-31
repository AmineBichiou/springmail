package com.amine.microsservice.exeption;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class Enable {
    @ExceptionHandler(UserAccountNotEnabled.class)
    @ResponseBody
    public ResponseEntity<String> handleUserAccountNotEnabledException(UserAccountNotEnabled ex) {
        return ResponseEntity.status(403).body(ex.getMessage()); // You can customize the HTTP status code and response message here.
    }
}
