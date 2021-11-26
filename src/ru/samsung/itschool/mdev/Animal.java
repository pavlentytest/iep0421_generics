package ru.samsung.itschool.mdev;

public class Animal<T> {
    private T t;

    public Animal(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
