package com.gaap.mp.service;

import com.gaap.mp.models.VotePeriods;
import com.gaap.mp.repository.VotePeriodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VotePeriodsService {
    @Autowired
    VotePeriodsRepository votePeriodsRepository;
    public VotePeriods createVotePeriods(VotePeriods votePeriods){
        return votePeriodsRepository.save(votePeriods);
    }
    List<VotePeriods> votePeriods = new ArrayList<>();
    public List<VotePeriods> getVotePeriods(){
        votePeriods = votePeriodsRepository.findAll();
        return votePeriods;
    }

    public VotePeriods getVotePeriodsForId(int id){
        return votePeriodsRepository.findByIdVote(id);
    }
}
