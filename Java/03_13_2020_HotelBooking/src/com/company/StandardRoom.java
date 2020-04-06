package com.company;

public class StandardRoom extends Room {
    public StandardRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public void tvEquipment() {
        System.out.println("The room has a TV");
    }

    @Override
    public void kitchen() {
        System.out.println("There is no kitchen in the room");
    }
}
