package com.gaap.mp.repository;

import com.gaap.mp.models.VotePeriods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Vote periods repository.
 */
public interface VotePeriodsRepository extends JpaRepository<VotePeriods, Integer> {
    /**
     * Find by id vote vote periods.
     *
     * @param id the id
     * @return the vote periods
     */
    VotePeriods findByIdVote(int id);
}

