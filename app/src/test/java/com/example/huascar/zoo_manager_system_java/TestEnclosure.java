package com.example.huascar.zoo_manager_system_java;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 11/11/2017.
 */

public class TestEnclosure {

    @Test
    public void testAddToEnclosure() {
        Lion lion = new Lion(50);
        Enclosure enclosure = new Enclosure<Lion>();
        enclosure.addAnimal(lion);
        assertEquals(1, enclosure.numberOfAnimals());
    }
}
