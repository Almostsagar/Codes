import pkg.demo;
import pkg.pkg1.demo1;

public class Test {
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
        demo1 d1 = new demo1();
        d1.display();
    }
}
// Class can have data members, methods or inner classes 
// outer class can only be public or default
// Inner classes can be public ,private, protected, default
// Two ways of using a class object creation and inheritence i.e. extends keyword
// HasA - if a class makes a object of another class   // nonsubclass
// IsA - if a class extends from another class         // subclass   