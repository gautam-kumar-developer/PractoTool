package com.Practo.Tool.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {
    @GetMapping("/health")
    public ResponseEntity<String> getHealth(){
        return new ResponseEntity<>("💕Server is running properly.",HttpStatus.OK);
    }
}
