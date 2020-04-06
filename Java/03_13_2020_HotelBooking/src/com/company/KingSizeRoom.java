package com.company;

public class KingSizeRoom extends Room {
    public KingSizeRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public void tvEquipment() {
        System.out.println("The room has extra large TV");
    }

    @Override
    public void kitchen() {
        System.out.println("There is a kitchen in the room");
    }
}
