package com.example.maintenance_monitor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    String message = "Everything works as expected";
    @RequestMapping("/api/message")
    public String getMessage() {
        return message;
    }

}
