class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Bhau");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow");
    }
}

class Pikachu extends Animal {
    void speak() {
        System.out.println("Pika Pika");
    }
}

class Human extends Animal {
    void speak() {
        System.out.println("Hello");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Parent reference but child objects
        Animal a;

        a = new Dog();
        a.speak();   // Output: Bhau

        a = new Cat();
        a.speak();   // Output: Meow

        a = new Pikachu();
        a.speak();   // Output: Pika Pika

        a = new Human();
        a.speak();   // Output: Hello
    }
}
