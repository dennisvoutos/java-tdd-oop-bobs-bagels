package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    @Test
    public void testShowPrice(){
        Inventory inventory = new Inventory();
        inventory.showFillings();
        Assertions.assertEquals(inventory.showPrice(new Item("BGLO",0.49,"Bagel","Onion")),0.49);
        Assertions.assertEquals(inventory.showPrice(new Item("BGLP",0.39,"Bagel","Plain")),0.39);
        Assertions.assertEquals(inventory.showPrice(new Item("BGLh",0.59,"Bagel","Plain")),-1.0);
    }
}
