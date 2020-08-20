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
    @Autowired
    VoteRepository voteRepository;
    List<Vote> listVote = new ArrayList<>();
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


    public List<Vote> getVoteForEmployees(){
        listVote = voteRepository.findAll();
        return listVote;
    }


}
