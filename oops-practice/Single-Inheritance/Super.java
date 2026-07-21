// 1. super() (Constructor Call)

// This must be the first statement inside a child constructor.

// class Animal {
//     Animal() {
//         System.out.println("Animal Constructor");
//     }
// }

// class Dog extends Animal {

//     Dog() {
//         super();    // Calls Animal constructor
//         System.out.println("Dog Constructor");
//     }
// }



// 2. super.method()

// You can call the parent's method from a child method.

// class Animal {

//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {

//     void eat() {
//         System.out.println("Dog is eating");
//     }

//     void display() {
//         super.eat();    // Calls Animal's eat()
//         eat();          // Calls Dog's eat()
//     }
// }


// 3. super.variable

// You can access the parent's variable if the child has a variable with the same name.

// class Animal {
//     int age = 5;
// }

// class Dog extends Animal {

//     int age = 10;

//     void show() {
//         System.out.println(super.age);
//         System.out.println(age);
//     }
// }

// public class Super {
    
// }
