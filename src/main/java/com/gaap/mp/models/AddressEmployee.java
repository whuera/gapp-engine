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

    /**
     * Gets street.
     *
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street.
     *
     * @param street the street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets number home.
     *
     * @return the number home
     */
    public String getNumberHome() {
        return numberHome;
    }

    /**
     * Sets number home.
     *
     * @param numberHome the number home
     */
    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    /**
     * Gets reference home.
     *
     * @return the reference home
     */
    public String getReferenceHome() {
        return referenceHome;
    }

    /**
     * Sets reference home.
     *
     * @param referenceHome the reference home
     */
    public void setReferenceHome(String referenceHome) {
        this.referenceHome = referenceHome;
    }

    /**
     * Gets number phone.
     *
     * @return the number phone
     */
    public String getNumberPhone() {
        return numberPhone;
    }

    /**
     * Sets number phone.
     *
     * @param numberPhone the number phone
     */
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    /**
     * Gets geolocalization home.
     *
     * @return the geolocalization home
     */
    public String getGeolocalizationHome() {
        return geolocalizationHome;
    }

    /**
     * Sets geolocalization home.
     *
     * @param geolocalizationHome the geolocalization home
     */
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
