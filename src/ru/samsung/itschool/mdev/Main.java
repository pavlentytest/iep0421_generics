package ru.samsung.itschool.mdev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("Test");
        arrayList.add(new Object());

        int b = (int) arrayList.get(1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("100");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",1992));

        Car<String> toyota = new Car<>("Toyota",1999,"Camry");

        ArrayList<Animal<String>> animals = new ArrayList<>();
        animals.add(new Animal<>("Cat"));
        animals.add(new Animal<>("Dog"));


        ArrayList<School<String,Integer>> schools = new ArrayList<>();
        schools.add(new School<>("Moscow",1329));

        int number = schools.get(0).getV();

    }

}
