package com.gaap.mp.service;

import com.gaap.mp.models.VotePeriods;
import com.gaap.mp.repository.VotePeriodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The type Vote periods service.
 */
@Service
public class VotePeriodsService {
    /**
     * The Vote periods repository.
     */
    @Autowired
    VotePeriodsRepository votePeriodsRepository;

    /**
     * Create vote periods vote periods.
     *
     * @param votePeriods the vote periods
     * @return the vote periods
     */
    public VotePeriods createVotePeriods(VotePeriods votePeriods){
        return votePeriodsRepository.save(votePeriods);
    }

    /**
     * The Vote periods.
     */
    List<VotePeriods> votePeriods = new ArrayList<>();

    /**
     * Get vote periods list.
     *
     * @return the list
     */
    public List<VotePeriods> getVotePeriods(){
        votePeriods = votePeriodsRepository.findAll();
        return votePeriods;
    }

    /**
     * Get vote periods for id vote periods.
     *
     * @param id the id
     * @return the vote periods
     */
    public VotePeriods getVotePeriodsForId(int id){
        return votePeriodsRepository.findByIdVote(id);
    }
}
