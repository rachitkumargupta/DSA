public class Inheritance {
    public static void main(String[] args) {

        // single wale ka eg tha 
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();

        // multi level ka eg tha 
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // hierarchial ka eg 
        // Bird Chidia = new Bird();
        // Chidia.eat();

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

// class Dog extends Mammals {
//     String Breed;
// }


// Derived class / Subclass

class Fish extends Animal {
    // int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Birds fly");
    }
}


