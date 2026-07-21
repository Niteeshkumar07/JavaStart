class Animal{
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barkin....");
    }
}

public class Single2 {
    public static void main(String[] args) {
        
        Animal a = new Dog();
        a.eat();

    }

}
