package com.gaap.mp.models;

/**
 * <div style="font-siza: 130%;">Employee model<div/>
 * <ul>
 * <li>Class model for AddressEmployee</li>
 * <li>feactures for address</li>
 * </ul>
 */
public class AddressEmployee {
    private String street;
    private String numberHome;
    private String referenceHome;
    private String numberPhone;
    private String geolocalizationHome;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    public String getReferenceHome() {
        return referenceHome;
    }

    public void setReferenceHome(String referenceHome) {
        this.referenceHome = referenceHome;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGeolocalizationHome() {
        return geolocalizationHome;
    }

    public void setGeolocalizationHome(String geolocalizationHome) {
        this.geolocalizationHome = geolocalizationHome;
    }

    @Override
    public String toString() {
        return "AddressEmployee{" +
                "street='" + street + '\'' +
                ", numberHome='" + numberHome + '\'' +
                ", referenceHome='" + referenceHome + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", geolocalizationHome='" + geolocalizationHome + '\'' +
                '}';
    }
}
