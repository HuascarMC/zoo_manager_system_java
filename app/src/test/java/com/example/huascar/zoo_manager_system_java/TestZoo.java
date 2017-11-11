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

    @Test
    public void testRemoveEnclosure() {
        Zoo zoo = new Zoo();
        Enclosure warthogEnclosure = new Enclosure<Warthog>();
        zoo.addEnclosure(warthogEnclosure);
        zoo.removeEnclosure(warthogEnclosure);
        assertEquals(0, zoo.numberOfEnclosures());
    }

    @Test
    public void testTotalNumberOfAnimals() {
        Zoo zoo = new Zoo();
        Enclosure warthogEnclosure = new Enclosure<Warthog>();
        Enclosure lionEnclosure = new Enclosure<Lion>();
        Enclosure jaguarEnclosure = new Enclosure<Jaguar>();
        zoo.addEnclosure(warthogEnclosure);
        zoo.addEnclosure(lionEnclosure);
        zoo.addEnclosure(jaguarEnclosure);
        Lion lion = new Lion(300);
        Jaguar jaguar = new Jaguar(400);
        Warthog warthog = new Warthog(350);
        warthogEnclosure.addAnimal(warthog);
        jaguarEnclosure.addAnimal(jaguar);
        lionEnclosure.addAnimal(lion);
        assertEquals(3, zoo.totalNumberOfAnimals());
    }

//    @Test
//    public void testSellAnimal(){
//        Zoo zoo = new Zoo();
//        Enclosure jaguarEnclosure = new Enclosure<Jaguar>();
//        zoo.addEnclosure(jaguarEnclosure);
//        Jaguar jaguar = new Jaguar(400);
//        jaguarEnclosure.addAnimal(jaguar);
//        zoo.sellAnimal(jaguar);
//        assertEquals(0, zoo.totalNumberOfAnimals());
//    }
}
