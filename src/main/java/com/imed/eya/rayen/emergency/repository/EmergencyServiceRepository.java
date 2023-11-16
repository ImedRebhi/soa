// EmergencyServiceRepository.java
package com.imed.eya.rayen.emergency.repository;

import com.imed.eya.rayen.emergency.model.EmergencyService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmergencyServiceRepository extends JpaRepository<EmergencyService, Long> {
    // You can add custom query methods here if needed

    // Example of a custom query to find services by name
    List<EmergencyService> findByName(String name);
}
