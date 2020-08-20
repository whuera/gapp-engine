package com.gaap.mp.service;

import com.gaap.mp.models.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    public Vote createVoteForEmployee(Vote publicVote){
        Vote vote = new Vote();
        vote.setCodeEmployee(publicVote.getCodeEmployee());
        vote.setIdVote(publicVote.getIdVote());
        vote.setCommentsForVote(publicVote.getCommentsForVote());
        return vote;
    }

    public List<Vote> getVoteForEmployees(){
        return null;
    }


}
