package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestZoo {

    @Test
    public void testAddEnclosure() {
        Zoo zoo = new Zoo();
        Enclosure warthogEnclosure = new Enclosure<Warthog>();
        zoo.addEnclosure(warthogEnclosure);
        assertEquals(1, zoo.numberOfEnclosures());
    }
}
