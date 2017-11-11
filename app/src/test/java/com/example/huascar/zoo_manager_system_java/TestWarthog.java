package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestWarthog {

    @Test
    public void testCash() {
        Warthog warthog = new Warthog(40);
        assertEquals(40, warthog.getCash());
    }
}
