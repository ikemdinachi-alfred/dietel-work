package Logistic_management_Application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipmentTest {
    @Test
    public void testShipmentId_isCorrect(){
        Shipment shipment = new Shipment(0011,"Abuja");
        int ids = shipment.getShipmentId();
        assertEquals(0011,ids);
    }
    @Test
    public void testShipmentLocation_isCorrect(){
        Shipment shipment = new Shipment(0011,"Abuja");
        String ids = shipment.getShipmentDestination();
        assertEquals("Abuja",ids);
    }
    @Test
    public void testShipmentDeliveryStatus_when_Yes(){
        Shipment shipment = new Shipment();
        boolean sure = shipment.isDelivered();
         assertFalse(sure);
    }

    @Test
    public void testShipmentDeliveryStatus_when_No(){
        Shipment shipment = new Shipment();
        assertTrue(shipment.markDelivered());
    }

}