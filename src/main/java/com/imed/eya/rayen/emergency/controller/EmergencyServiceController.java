// EmergencyServiceController.java
package com.imed.eya.rayen.emergency.controller;

import com.imed.eya.rayen.emergency.model.EmergencyService;
import com.imed.eya.rayen.emergency.service.EmergencyServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emergency-services")
public class EmergencyServiceController {

    private final EmergencyServiceService emergencyServiceService;

    public EmergencyServiceController(EmergencyServiceService emergencyServiceService) {
        this.emergencyServiceService = emergencyServiceService;
    }

    @GetMapping
    public List<EmergencyService> getAllServices() {
        return emergencyServiceService.getAllServices();
    }

    @GetMapping("/{id}")
    public EmergencyService getServiceById(@PathVariable Long id) {
        return emergencyServiceService.getServiceById(id).orElse(null);
    }

    @PostMapping
    public EmergencyService createService(@RequestBody EmergencyService emergencyService) {
        return emergencyServiceService.createService(emergencyService);
    }

    @PutMapping("/{id}")
    public EmergencyService updateService(@PathVariable Long id, @RequestBody EmergencyService updatedService) {
        return emergencyServiceService.updateService(id, updatedService);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        emergencyServiceService.deleteService(id);
    }
}
