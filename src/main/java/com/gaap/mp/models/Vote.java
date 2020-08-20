package com.gaap.mp.models;

import lombok.Getter;
import lombok.Setter;

/**
 * <div style="font-siza: 130%;">Class Vote model<div/>
 * <ul>
 * <li>Class model for Vote</li>
 * </ul>
 */

public class Vote {

    private String codeEmployee;

    private int idVote;

    private String voteForEmplooyee;

    private String commentsForVote;
   public Vote() {
   }

    public Vote(String codeEmployee, int idVote, String voteForEmplooyee, String commentsForVote) {
        this.codeEmployee = codeEmployee;
        this.idVote = idVote;
        this.voteForEmplooyee = voteForEmplooyee;
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
