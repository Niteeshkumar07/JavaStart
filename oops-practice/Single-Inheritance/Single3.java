// class Numbers{
//     public int a = 20;
//     public int b = 30;
// }

// class add extends Numbers{
//     void show(){
//         System.out.println("sum " + (a+b));
//     }
// }

class Numbers { 
    // Changed to protected so the subclass can access them if needed
    protected int a = 20; 
    protected int b = 30; 

    Numbers(int a, int b) { 
        this.a = a; 
        this.b = b; 
    } 
} 

class Add extends Numbers { 
    // Proper constructor forwarding arguments to the parent
    Add(int a, int b) {
        super(a, b); 
    }

    void show() { 
        System.out.println("Values: " + a + " and " + b);
    } 
} 

public class Single3 { 
    public static void main(String[] args) { 
        // Pass arguments to the constructor during instantiation
        Add obj = new Add(10, 20); 
        obj.show(); 
        System.out.println("Sum: " + (obj.a + obj.b)); 
    } 
}
