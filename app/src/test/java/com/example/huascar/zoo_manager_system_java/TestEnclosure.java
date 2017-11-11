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

    @Test
    public void testRemoveFromEnclosure() {
        Jaguar jaguar = new Jaguar(30);
        Enclosure enclosure = new Enclosure<Jaguar>();
        enclosure.addAnimal(jaguar);
        enclosure.removeAnimal(jaguar);
        assertEquals(0, enclosure.numberOfAnimals());
    }

    @Test
    public void testContainsAnimal() {
        Jaguar jaguar = new Jaguar(30);
        Enclosure jaguarEnclosure = new Enclosure<Jaguar>();
        jaguarEnclosure.addAnimal(jaguar);
        assertEquals(jaguar, jaguarEnclosure.containsAnimal(jaguar));
    }
}
