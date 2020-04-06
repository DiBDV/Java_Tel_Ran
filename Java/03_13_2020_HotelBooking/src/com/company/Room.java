package com.company;

public abstract class Room {
    private String number;
    private int capacity;

    protected abstract Room(String number, int capacity) {
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

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", capacity=" + capacity +'}';
    }
}
