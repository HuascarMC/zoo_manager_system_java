package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestVisitor {

    @Test
    public void buyTicket() {
        Zoo zoo = new Zoo();
        Visitor visitor = new Visitor(50);
        visitor.buyTicket(zoo);
        assertEquals(20, visitor.getWallet());
    }
}
