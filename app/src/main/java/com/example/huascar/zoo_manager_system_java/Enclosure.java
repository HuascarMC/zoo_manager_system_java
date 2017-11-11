package com.example.huascar.zoo_manager_system_java;

import java.util.ArrayList;

/**
 * Created by huascar on 11/11/2017.
 */

public class Enclosure<T extends Animal> {

    private ArrayList<T> enclosure;

    public Enclosure() {
        this.enclosure = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        enclosure.add(animal);
    }

    public int numberOfAnimals() {
        int actual = enclosure.size();
        return actual;
    }

    public void removeAnimal(T animal) {
        enclosure.remove(animal);
    }

    public boolean containsAnimal(T animal) {
        return enclosure.contains(animal);
    }
}
