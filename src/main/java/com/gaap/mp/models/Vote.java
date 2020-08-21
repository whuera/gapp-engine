package com.gaap.mp.models;


import javax.persistence.*;

/**
 * <div style="font-siza: 130%;">Class Vote model<div/>
 * <ul>
 * <li>Class model for Vote</li>
 * </ul>
 */
@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVote;

    private String codeEmployee;

    private String voteForEmplooyee;

    private String commentsForVote;

    /**
     * Instantiates a new Vote.
     */
    public Vote() {
   }

    /**
     * Instantiates a new Vote.
     *
     * @param idVote           the id vote
     * @param codeEmployee     the code employee
     * @param voteForEmplooyee the vote for emplooyee
     * @param commentsForVote  the comments for vote
     */
    public Vote(int idVote, String codeEmployee, String voteForEmplooyee, String commentsForVote) {
       super();
        this.codeEmployee = codeEmployee;
        this.voteForEmplooyee = voteForEmplooyee;
        this.idVote = idVote;
        this.commentsForVote = commentsForVote;
    }

    /**
     * Gets code employee.
     *
     * @return the code employee
     */
    public String getCodeEmployee() {
        return codeEmployee;
    }

    /**
     * Sets code employee.
     *
     * @param codeEmployee the code employee
     */
    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    /**
     * Gets id vote.
     *
     * @return the id vote
     */
    public int getIdVote() {
        return idVote;
    }

    /**
     * Sets id vote.
     *
     * @param idVote the id vote
     */
    public void setIdVote(int idVote) {
        this.idVote = idVote;
    }

    /**
     * Gets vote for emplooyee.
     *
     * @return the vote for emplooyee
     */
    public String getVoteForEmplooyee() {
        return voteForEmplooyee;
    }

    /**
     * Sets vote for emplooyee.
     *
     * @param voteForEmplooyee the vote for emplooyee
     */
    public void setVoteForEmplooyee(String voteForEmplooyee) {
        this.voteForEmplooyee = voteForEmplooyee;
    }

    /**
     * Gets comments for vote.
     *
     * @return the comments for vote
     */
    public String getCommentsForVote() {
        return commentsForVote;
    }

    /**
     * Sets comments for vote.
     *
     * @param commentsForVote the comments for vote
     */
    public void setCommentsForVote(String commentsForVote) {
        this.commentsForVote = commentsForVote;
    }

   // @ManyToOne
   // @JoinColumn(name="idVotePeriods", nullable = false)

    @Override
    public String toString() {
        return "Vote{" +
                "codeEmployee='" + codeEmployee + '\'' +
                ", idVote=" + idVote +
                ", voteForEmplooyee='" + voteForEmplooyee + '\'' +
                '}';
    }
}
