package com.company;

public class Cat extends Animal {
    private String color;


    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color ;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("\nimia " + getName() +
                "\nvozrast " + getAge() +
                "\nsvet " + getColor()  );

    }
}
