package com.company;

public class Dog extends Animal {

    private int ves;


    public Dog(String name, int age, int ves) {
        super(name, age);
        this.ves = ves;
    }

    public int getVes() {
        return ves;
    }

    @Override
    public void print() {
        System.out.println("\nimia " + getName() +
                "\nvozrast " + getAge() +
                "\nves " + getVes() );
    }
}
