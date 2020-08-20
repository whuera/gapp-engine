package com.gaap.mp.repository;

import com.gaap.mp.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Vote repository.
 */
@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> { }
