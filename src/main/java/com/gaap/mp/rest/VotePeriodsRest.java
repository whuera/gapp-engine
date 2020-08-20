package com.gaap.mp.rest;

import com.gaap.mp.models.VotePeriods;
import com.gaap.mp.service.VotePeriodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("voteperiods")
public class VotePeriodsRest {
    @Autowired
    VotePeriodsService votePeriodsService;
    @PostMapping
    public ResponseEntity<VotePeriods> createVotePeriods(@RequestBody VotePeriods votePeriods){
        votePeriods = votePeriodsService.createVotePeriods(votePeriods);
        return new ResponseEntity<VotePeriods>(votePeriods, HttpStatus.OK);
    }
}
