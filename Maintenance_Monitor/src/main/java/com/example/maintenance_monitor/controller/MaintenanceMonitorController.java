package com.example.maintenance_monitor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    String message = "Everything works as expected";
    @RequestMapping("/api/message")
    public String getMessage() {
        return message;
    }


    @RequestMapping("/api/message/set")
    public String setMessage(@RequestParam String m) {
        this.message = m;
        return "ok";
    }

    @RequestMapping("/api/message/reset")
    public String resetMessage(){
        this.message =  "Everything works as expected";
        return "ok";
    }


}
