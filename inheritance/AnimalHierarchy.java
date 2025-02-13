package com.bridgelabz.inheritance;


class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animals make sounds.");
    }

    public String getName() {
        return name;
    }
}


class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Bow Bow!");
    }
}


class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}


class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp Chirp!");
    }
}


public class AnimalHierarchy {
    public static void main(String[] args) {

        Animal dog = new Dog("roy", 3);
        Animal cat = new Cat("mew", 2);
        Animal bird = new Bird("birdy", 1);

        // Polymorphism Calls the overridden  method
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
