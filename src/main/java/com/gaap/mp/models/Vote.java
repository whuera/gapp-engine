package com.gaap.mp.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
   public Vote() {
   }

    public Vote(int idVote, String codeEmployee, String voteForEmplooyee, String commentsForVote) {
       super();
        this.codeEmployee = codeEmployee;
        this.voteForEmplooyee = voteForEmplooyee;
        this.idVote = idVote;
        this.commentsForVote = commentsForVote;
    }

    public String getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public int getIdVote() {
        return idVote;
    }

    public void setIdVote(int idVote) {
        this.idVote = idVote;
    }

    public String getVoteForEmplooyee() {
        return voteForEmplooyee;
    }

    public void setVoteForEmplooyee(String voteForEmplooyee) {
        this.voteForEmplooyee = voteForEmplooyee;
    }

    public String getCommentsForVote() {
        return commentsForVote;
    }

    public void setCommentsForVote(String commentsForVote) {
        this.commentsForVote = commentsForVote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "codeEmployee='" + codeEmployee + '\'' +
                ", idVote=" + idVote +
                ", voteForEmplooyee='" + voteForEmplooyee + '\'' +
                '}';
    }
}
