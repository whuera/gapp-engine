package com.gaap.mp.rest;

import com.gaap.mp.models.VotePeriods;
import com.gaap.mp.service.VotePeriodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Vote periods rest.
 */
@RestController
@RequestMapping("voteperiods")
public class VotePeriodsRest {
    /**
     * The Vote periods service.
     */
    @Autowired
    VotePeriodsService votePeriodsService;

    /**
     * Create vote periods response entity.
     *
     * @param votePeriods the vote periods
     * @return the response entity
     */
    //@CrossOrigin(origins = "http://localhost:8090")
    @PostMapping
    public ResponseEntity<VotePeriods> createVotePeriods(@RequestBody VotePeriods votePeriods){
        votePeriods = votePeriodsService.createVotePeriods(votePeriods);
        return new ResponseEntity<VotePeriods>(votePeriods, HttpStatus.OK);
    }

    @GetMapping("/period/{id}")
    public VotePeriods getPeriodsById(@PathVariable int id){
        return votePeriodsService.getVotePeriodsForId(id);
    }

    @GetMapping("/allvotes")
    public ResponseEntity<List<VotePeriods>> getAllPeriods() {
        return  new ResponseEntity(votePeriodsService.getVotePeriods(),HttpStatus.OK);
    }
}
