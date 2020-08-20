package com.gaap.mp.repository;

import com.gaap.mp.models.VotePeriods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotePeriodsRepository extends JpaRepository<VotePeriods, Integer> {
    VotePeriods findByIdVote(int id);
}

