package com.example.huascar.zoo_manager_system_java;

import java.util.ArrayList;

/**
 * Created by huascar on 11/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosureName) {
        enclosures.add(enclosureName);
    }
}
