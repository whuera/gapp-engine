package com.gaap.mp.service;

import com.gaap.mp.models.Vote;
import com.gaap.mp.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <div style="font-siza: 130%;">Class Vote Service<div/>
 * <ul>
 * <li>Service class for RestController VoteRest</li>
 * </ul>
 */
@Service
public class VoteService {
    /**
     * The Vote repository.
     */
    @Autowired
    VoteRepository voteRepository;
    /**
     * The List vote.
     */
    List<Vote> listVote = new ArrayList<>();

    /**
     * Create vote for employee vote.
     *
     * @param publicVote the public vote
     * @return the vote
     */
    public Vote createVoteForEmployee(Vote publicVote){
        Vote vote = new Vote();
        vote.setCodeEmployee(publicVote.getCodeEmployee());
        vote.setIdVote(publicVote.getIdVote());
        vote.setVoteForEmplooyee(publicVote.getVoteForEmplooyee());
        vote.setCommentsForVote(publicVote.getCommentsForVote());
        listVote.add(vote);
        voteRepository.save(vote);
        return vote;
    }


    /**
     * Get vote for employees list.
     *
     * @return the list
     */
    public List<Vote> getVoteForEmployees(){
        listVote = voteRepository.findAll();
        return listVote;
    }


}
