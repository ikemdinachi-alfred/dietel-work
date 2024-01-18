package Logistic_management_Application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    Warehouse warehouse;
@BeforeEach
    public void doThisFirst() {
    int id = 0001;
     warehouse = new Warehouse(id);
}
@Test
    public void testWareHouseId(){
    int id = warehouse.getWarehouseId();
    assertEquals(0001,id);
}



}