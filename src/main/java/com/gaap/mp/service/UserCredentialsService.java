package com.gaap.mp.service;

import com.gaap.mp.models.UserCredentials;
import com.gaap.mp.repository.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialsService {
    @Autowired
    UserCredentialsRepository userCredentialsRepository;
    public UserCredentials createUserCredentials(UserCredentials userCredentials){
        userCredentials = userCredentialsRepository.save(userCredentials);
        return userCredentials;
    }
}
