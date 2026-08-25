public class Polymorphism {
    public static void main(String args[]){
        // Method Overloading eg 
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.2,(float)2.8));

        // Method Overriding 
        Deer d = new Deer();
        d.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("eats anything ");
    }
}

class Deer {
    void eat() {
        System.out.println("eats grass");
    }
}


// class Calculator {
//     int sum(int a , int b){
//         return a + b;
//     }
     
//     float sum(float a , float b){
//         return a + b;
//     }

//     int sum(int a , int b , int c ){
//         return a+b+c;
//     }
// }
