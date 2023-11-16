// EmergencyService.java
package com.imed.eya.rayen.emergency.model;

import javax.persistence.*;

@Entity
public class EmergencyService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private UserLocation location;

    public EmergencyService() {
        // Default constructor required by JPA
    }

    public EmergencyService(String name, UserLocation location) {
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserLocation getLocation() {
        return location;
    }

    public void setLocation(UserLocation location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Other constructors, getters, and setters as needed
}
