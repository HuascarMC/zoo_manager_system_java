package com.example.huascar.zoo_manager_system_java;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by huascar on 11/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private int price;
    private ArrayList<Visitor> visitors;

    public Zoo() {
        this.enclosures = new ArrayList<>();
        this.price = 30;
        this.visitors = new ArrayList<>();
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

    public int getPrice() {
        return this.price;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public int numberOfVisitors() {
        int actual = visitors.size();
        return actual;
    }

    public int totalValueAnimals() {
        int total = 0;
        for (Enclosure enclosure : enclosures) {
            total += enclosure.enclosureValue();
        }
        return total;
    }
}
