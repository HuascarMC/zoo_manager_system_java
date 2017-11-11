package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestLion {

    @Test
    public void testCash(){
        Lion lion = new Lion(50);
        assertEquals(50, lion.getCash());
    }
}
