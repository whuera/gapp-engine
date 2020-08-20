package com.gaap.mp.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Set;

/**
 * The type Vote periods.
 */
@Entity
public class VotePeriods {
    /**
     * Instantiates a new Vote periods.
     */
    public VotePeriods() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVotePeriods;
    private String namePeriod;
    private String dateStart;
    private String dateEnd;
    private int idVote;

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
     * Gets id vote periods.
     *
     * @return the id vote periods
     */
    public int getIdVotePeriods() {
        return idVotePeriods;
    }

    /**
     * Sets id vote periods.
     *
     * @param idVotePeriods the id vote periods
     */
    public void setIdVotePeriods(int idVotePeriods) {
        this.idVotePeriods = idVotePeriods;
    }

    /**
     * Gets name period.
     *
     * @return the name period
     */
    public String getNamePeriod() {
        return namePeriod;
    }

    /**
     * Sets name period.
     *
     * @param namePeriod the name period
     */
    public void setNamePeriod(String namePeriod) {
        this.namePeriod = namePeriod;
    }

    /**
     * Gets date start.
     *
     * @return the date start
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * Sets date start.
     *
     * @param dateStart the date start
     */
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * Gets date end.
     *
     * @return the date end
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets date end.
     *
     * @param dateEnd the date end
     */
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
    //@OneToMany(mappedBy = "Vote")
    //private Set<Vote> votes;

}
