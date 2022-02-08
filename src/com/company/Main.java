package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Animal [] animals = {createObject(Name.Dog),createObject(Name.Cat),createObject(Name.Pet)};
        for (int i = 0; i < animals.length; i++) {
            animals[i].print();

        }


    }

    public static Animal createObject(Name classname) {
        switch (classname) {
            case Dog:
                Dog dog = new Dog("sosunok",12,44);
                return dog;
            case Cat:
                Cat cat = new Cat("dura",10,"white");
                return cat;
            case Pet:
                Pet pet = new Pet("fifa",8,"shmara");
                return pet;
        }


return null;
    }
}
