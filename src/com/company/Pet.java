package com.company;

public class Pet extends Animal {
    private String poroda;


    public Pet(String name, int age,String poroda) {
        super(name, age);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }

    @Override
    public void print() {
        System.out.println("\nimia " + getName() + "\nvozrast " + getAge() +"\nporoda " + getPoroda() );
    }
}
