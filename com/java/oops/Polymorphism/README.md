# Polymorphism in Java

##  Definition
Polymorphism is the ability for an object or function to take many forms, making your code more flexible and reducing complexity.

##  Types of Polymorphism
Java supports two types of polymorphism:
1. **Runtime Polymorphism** (Method Overriding)
2. **Compile-Time Polymorphism** (Method Overloading)

##  Benefits of Polymorphism
- Reduces code complexity
- Enhances reusability
- Improves maintainability
- Provides flexibility in programming

##  Implementation
### **Method Overriding (Runtime Polymorphism)**
Polymorphism in Java can be implemented by overriding methods from a superclass and using the `@Override` annotation.
```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Runtime Polymorphism
        obj.show(); // Calls Child's show() method
    }
}
```

### **Usage of `super` Keyword**
The `super` keyword allows access to the original implementation of the superclass methods.
```java
class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls Parent's display method
        System.out.println("Child display method");
    }
}
```

## Types of Polymorphism
### **1. Runtime Polymorphism (Method Overriding)**
This allows objects to take different forms at runtime, enabling more flexible and reusable code.
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```
## Example 2: Payment -> How It Works
1. **Parent Class (`PaymentProcessor`)** defines a `processPayment()` method.
2. **Child Classes** (`CreditCardPayment`, `UpiPayment`) override the method to provide custom implementations.
3. **`PaymentService`** uses **constructor-based dependency injection** to allow flexible payment handling.
4. **Runtime Polymorphism in Action**:
    - The `ECommerceApp` dynamically assigns different objects (`CreditCardPayment`, `UpiPayment`) to a parent class reference, showcasing **dynamic method dispatch**.


### **2. Compile-Time Polymorphism (Method Overloading)**
Method Overloading allows multiple methods with the same name but different parameters, enhancing flexibility and reusability.
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

##  Conclusion
Polymorphism is a key feature of Object-Oriented Programming that enhances code efficiency, readability, and reusability. By understanding and implementing both **method overloading** and **method overriding**, developers can write more flexible and maintainable Java applications.

---

