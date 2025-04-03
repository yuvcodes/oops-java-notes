
## **What is Abstraction?**
**Abstraction** is the process of hiding implementation details while exposing only the necessary functionality. It allows users to interact with a system **without knowing its internal workings**.

### **Analogy: Coffee Machine**
A **coffee machine** is a great example of abstraction:
- Users only need to **press a button** and provide **water & coffee pods**.
- They don’t need to understand the **internal mechanisms** that brew coffee.
- Similarly, in Java, abstraction hides complex logic while exposing a simple interface.

---

## **How is Abstraction Implemented in Java?**
Java provides two key ways to achieve abstraction:
1. **Abstract Classes**
2. **Interfaces**

### **Abstract Classes**
An **abstract class** acts as a **template** that defines some behavior while leaving other parts for subclasses to implement.
- **It cannot be instantiated directly.**
- **It may contain both abstract (unimplemented) and concrete (implemented) methods.**

**Example:**
```java
// Abstract class defining a generic vehicle
abstract class Vehicle {
    abstract void start(); // Abstract method (no implementation)
    
    void stop() { // Concrete method (has implementation)
        System.out.println("Vehicle stopped.");
    }
}

// Subclass providing implementation for the abstract method
class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls the overridden method
        myCar.stop();  // Calls the inherited method
    }
}
```

---

### **Interfaces**
An **interface** defines a contract that classes must follow, ensuring consistency without enforcing how the methods should be implemented.
- **All methods in an interface are abstract by default.**
- **A class implements an interface using the `implements` keyword.**

**Example:**
```java
// Defining an interface
interface Engine {
    void start(); // Abstract method
}

// Implementing the interface
class Bike implements Engine {
    public void start() {
        System.out.println("Bike is starting with a button.");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine myBike = new Bike();
        myBike.start(); // Calls the implemented method
    }
}
```

---

## **Abstract Classes vs Interfaces**
| Feature             | Abstract Class | Interface |
|---------------------|---------------|-----------|
| **Method Types**   | Can have both abstract & concrete methods | Only abstract methods (until Java 8) |
| **Multiple Inheritance** | Not supported (single inheritance only) | Supported (multiple interfaces can be implemented) |
| **Usage**          | Used when classes share common behavior | Used when unrelated classes should follow the same contract |

---
## **NOTE**
- **1)** A class can implement multiple interfaces (class A implements X, Y {}), allowing multiple behaviors.
- **2)** A class cannot extend multiple abstract classes (class A extends X, Y {} ) because Java doesn’t support multiple inheritance for classes.
- **3)** Workaround: Extend one abstract class and implement multiple interfaces (class A extends X implements Y, Z {}).
## **Summary**
✔ **Abstraction** simplifies software development by hiding unnecessary details.  
✔ **Abstract classes** provide a base template for related classes.  
✔ **Interfaces** define rules that multiple classes can implement.


