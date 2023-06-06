package com.example.maintenance_monitor.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorControllerTest {
    @Test
    void getStandardMessage(){
        //Arrange
        MaintenanceMonitorController maintanenceController = new MaintenanceMonitorController();

        //Act
        String result = maintanenceController.getMessage();

        //Assert
        assertEquals("Everything works as expected",result);
    }
}