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

    @Test
    void changeFromStandardToOtherMessage(){
        //Arrange
        MaintenanceMonitorController maintanenceController = new MaintenanceMonitorController();

        //Act
        String result = maintanenceController.getMessage();

        maintanenceController.setMessage("Nicht mehr die standard Nachricht");
        String changed_result = maintanenceController.getMessage();

        //Assert
        assertNotEquals(changed_result,result);
    }

    @Test
    void setMessage(){
        //Arrange
        MaintenanceMonitorController maintanenceController = new MaintenanceMonitorController();

        //Act
        maintanenceController.setMessage("Wir haben ein Problem!");
        String result = maintanenceController.getMessage();

        //Assert
        assertEquals("Wir haben ein Problem!",result);
    }

    @Test
    void CheckReturnValueOfSetMessage(){
        //Arrange
        MaintenanceMonitorController maintanenceController = new MaintenanceMonitorController();

        //Act
        String result = maintanenceController.setMessage("Wir haben ein Problem!");

        //Assert
        assertEquals("ok",result);
    }


    @Test
    void CheckResetMessage(){
        //Arrange
        MaintenanceMonitorController maintanenceController = new MaintenanceMonitorController();

        //Act
        maintanenceController.setMessage("Wir haben ein Problem!");
        maintanenceController.resetMessage();
        String result = maintanenceController.getMessage();

        //Assert
        assertEquals("Everything works as expected",result);
    }

    @Test
    void CheckReturnValueOfResetMessage(){
        //Arrange
        MaintenanceMonitorController maintanenceController = new MaintenanceMonitorController();

        //Act
        String result = maintanenceController.resetMessage();

        //Assert
        assertEquals("ok",result);
    }

}