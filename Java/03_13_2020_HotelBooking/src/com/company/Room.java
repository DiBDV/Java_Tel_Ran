package com.company;

public abstract class Room {
    private String number;
    private int capacity;

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public Room(String number) {
        this.number = number;
        this.capacity = 1;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract void tvEquipment();

    public abstract void kitchen();

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", capacity=" + capacity +'}';
    }
}
