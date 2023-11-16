// EmergencyServiceService.java
package com.imed.eya.rayen.emergency.service;

import com.imed.eya.rayen.emergency.model.EmergencyService;
import com.imed.eya.rayen.emergency.repository.EmergencyServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmergencyServiceService {

    private final EmergencyServiceRepository emergencyServiceRepository;

    public EmergencyServiceService(EmergencyServiceRepository emergencyServiceRepository) {
        this.emergencyServiceRepository = emergencyServiceRepository;
    }

    public List<EmergencyService> getAllServices() {
        return emergencyServiceRepository.findAll();
    }

    public Optional<EmergencyService> getServiceById(Long id) {
        return emergencyServiceRepository.findById(id);
    }

    public EmergencyService createService(EmergencyService emergencyService) {
        return emergencyServiceRepository.save(emergencyService);
    }

    public EmergencyService updateService(Long id, EmergencyService updatedService) {
        // Check if the service with the given ID exists
        Optional<EmergencyService> existingService = emergencyServiceRepository.findById(id);

        if (existingService.isPresent()) {
            // Update the existing service with the new information
            EmergencyService serviceToUpdate = existingService.get();
            serviceToUpdate.setName(updatedService.getName());
            serviceToUpdate.setLocation(updatedService.getLocation());

            // Save the updated service
            return emergencyServiceRepository.save(serviceToUpdate);
        } else {
            // Handle error, service not found
            return null;
        }
    }

    public void deleteService(Long id) {
        emergencyServiceRepository.deleteById(id);
    }
}
