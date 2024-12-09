package Polymorphsim;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}
