package com.gaap.mp.service;

import com.gaap.mp.models.Vote;
import com.gaap.mp.repository.VoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Vote service test.
 */
@SpringBootTest
class VoteServiceTest {
    /**
     * The Vote repository.
     */
    @Autowired
    VoteRepository voteRepository;

    /**
     * Create vote for employee.
     */
    @Test
    void createVoteForEmployee() {
        Vote vote = new Vote();
        vote.setIdVote(1);
        vote.setCodeEmployee("001");
        vote.setVoteForEmplooyee("002");
        vote.setCommentsForVote("voto de prueba");
        assertTrue(voteRepository.save(vote) != null);

    }

    /**
     * Gets vote for employees.
     */
    @Test
    void getVoteForEmployees() {
        assertTrue(voteRepository.findAll().size() == 0);
    }

    @Test
    void getCodeEmployee() {
    }

    @Test
    void setCodeEmployee() {
    }

    @Test
    void getIdVote() {
    }

    @Test
    void setIdVote() {
    }

    @Test
    void getVoteForEmplooyee() {
    }

    @Test
    void setVoteForEmplooyee() {
    }

    @Test
    void getCommentsForVote() {
    }

    @Test
    void setCommentsForVote() {
    }

    @Test
    void testToString() {
    }
}