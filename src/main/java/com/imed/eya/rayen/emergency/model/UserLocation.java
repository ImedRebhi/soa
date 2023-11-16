package com.imed.eya.rayen.emergency.model;

public class UserLocation {

    private double latitude;
    private double longitude;

    public UserLocation() {
        // Default constructor
    }

    public UserLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Other constructors, if needed

    // Other utility methods, if needed
}
