package ru.samsung.itschool.mdev;

public class Car<T> {
    private String name;
    private int year;
    private T desc;

    public Car(String name, int year, T desc) {
        this.name = name;
        this.year = year;
        this.desc = desc;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
