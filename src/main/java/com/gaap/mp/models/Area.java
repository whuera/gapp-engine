package com.gaap.mp.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The type Area.
 */
@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArea;
    @NotNull
    private String nameArea;
    private String observationArea;

    /**
     * Instantiates a new Area.
     */
    public Area() {
    }


    /**
     * Gets name area.
     *
     * @return the name area
     */
    public String getNameArea() {
        return nameArea;
    }

    /**
     * Sets name area.
     *
     * @param nameArea the name area
     */
    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    /**
     * Gets observation area.
     *
     * @return the observation area
     */
    public String getObservationArea() {
        return observationArea;
    }

    /**
     * Sets observation area.
     *
     * @param observationArea the observation area
     */
    public void setObservationArea(String observationArea) {
        this.observationArea = observationArea;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nameArea='" + nameArea + '\'' +
                ", observationArea='" + observationArea + '\'' +
                '}';
    }
}
