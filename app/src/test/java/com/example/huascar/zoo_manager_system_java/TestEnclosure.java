package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestEnclosure {

    @Test
    public void testAddToEnclosure() {
        Lion lion = new Lion(50);
        Enclosure enclosure = new Enclosure<Lion>;
        enclosure.add(lion);
        assertEquals(1, enclosure.numberOfAnimals());
    }
}
