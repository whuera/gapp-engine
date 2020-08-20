package com.gaap.mp.rest;

import com.gaap.mp.models.Vote;
import com.gaap.mp.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("votes")
public class VoteRest {

    @Autowired
    VoteService voteService;
    @GetMapping("listVotesForEmployee")
    public ResponseEntity<List<Vote>> getPublicVotes(){
        return new ResponseEntity(voteService.getVoteForEmployees(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Vote> createVotePublic(@RequestBody Vote vote){
        vote = voteService.createVoteForEmployee(vote);
        return new ResponseEntity<Vote>(vote, HttpStatus.OK);
    }

}
