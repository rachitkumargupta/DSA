public class Abstraction {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang :- ye iss order me call hoga constructor jiss order me class hai 

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // h.changeColor();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal class constructor called");
        // color = "brown";
    }

    void eat() {
        System.out.println("eats ");
    }
    
    abstract void walk() ;
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse class constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs ");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang class constructor called");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken class constructor called");
    }
    void walk() {
        System.out.println("walks on 2 legs ");
    }
}