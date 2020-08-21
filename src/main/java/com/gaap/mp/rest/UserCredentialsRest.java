package com.gaap.mp.rest;

import com.gaap.mp.models.UserCredentials;
import com.gaap.mp.service.UserCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usercredentials")
public class UserCredentialsRest {
    @Autowired
    UserCredentialsService userCredentialsService;

@PostMapping
    public ResponseEntity<UserCredentials> createUserCredentials(@RequestBody UserCredentials userCredentials){
    userCredentials = userCredentialsService.createUserCredentials(userCredentials);
    return new ResponseEntity<UserCredentials>(userCredentials, HttpStatus.OK);
}

}
