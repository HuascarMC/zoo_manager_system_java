package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestJaguar {

    @Test
    public void testCash() {
        Jaguar jaguar = new Jaguar(30);
        assertEquals(30, jaguar.getCash());
    }
}
