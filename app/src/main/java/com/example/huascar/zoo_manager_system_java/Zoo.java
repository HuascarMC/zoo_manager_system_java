package com.example.huascar.zoo_manager_system_java;

import java.util.ArrayList;

/**
 * Created by huascar on 11/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private int price = 30;

    public Zoo() {
        this.enclosures = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosureName) {
        enclosures.add(enclosureName);
    }

    public int numberOfEnclosures() {
        int actual = enclosures.size();
        return actual;
    }

    public void removeEnclosure(Enclosure enclosureName) {
        enclosures.remove(enclosureName);
    }

    public int totalNumberOfAnimals() {
        int animals = 0;
        for(Enclosure enclosure : enclosures) {
            animals += enclosure.numberOfAnimals();
        }
        return animals;
    }

    public int sellAnimal(Animal animalName) {
        int money = 0;
        for (Enclosure enclosure : enclosures) {
           if (enclosure.containsAnimal(animalName) == animalName);
                money += animalName.cash;
                enclosure.removeAnimal(animalName);
        }
        return money;
    }
}
