package com.gaap.mp.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Set;

@Entity
public class VotePeriods {
    public VotePeriods() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVotePeriods;
    private String namePeriod;
    private String dateStart;
    private String dateEnd;
    private int idVote;

    public int getIdVote() {
        return idVote;
    }

    public void setIdVote(int idVote) {
        this.idVote = idVote;
    }

    public int getIdVotePeriods() {
        return idVotePeriods;
    }

    public void setIdVotePeriods(int idVotePeriods) {
        this.idVotePeriods = idVotePeriods;
    }

    public String getNamePeriod() {
        return namePeriod;
    }

    public void setNamePeriod(String namePeriod) {
        this.namePeriod = namePeriod;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
    //@OneToMany(mappedBy = "Vote")
    //private Set<Vote> votes;

}
