package com.gaap.mp.service;

import com.gaap.mp.models.Vote;
import com.gaap.mp.repository.VoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class VoteServiceTest {
@Autowired
    VoteRepository voteRepository;
    @Test
    void createVoteForEmployee() {
        Vote vote = new Vote();
        vote.setIdVote(1);
        vote.setCodeEmployee("001");
        vote.setVoteForEmplooyee("002");
        vote.setCommentsForVote("voto de prueba");
        assertTrue(voteRepository.save(vote) != null);

    }

    @Test
    void getVoteForEmployees() {
        assertTrue(voteRepository.findAll().size() == 0);
    }
}