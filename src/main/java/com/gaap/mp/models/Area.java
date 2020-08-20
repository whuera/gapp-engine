package com.gaap.mp.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArea;
    @NotNull
    private String nameArea;
    private String observationArea;

    public Area() {
    }


    public String getNameArea() {
        return nameArea;
    }

    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    public String getObservationArea() {
        return observationArea;
    }

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
