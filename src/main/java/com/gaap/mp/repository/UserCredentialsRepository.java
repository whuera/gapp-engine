package com.gaap.mp.repository;

import com.gaap.mp.models.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Integer> {
}
