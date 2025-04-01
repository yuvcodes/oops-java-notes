# Inheritance in Java

## Definition
Inheritance allows a class (**subclass/child class**) to inherit properties and behaviors from another class (**superclass/parent class**).

### Benefits:
- **Code Reusability**: Reduces code duplication by allowing subclasses to use common functionality defined in the superclass.
- **Class Hierarchies**: Establishes an "is a" relationship between the subclass and superclass (e.g., a **Salesperson** is an **Employee**).

## Types of Inheritance

1. **Single-Level Inheritance**: One class inherits from another class.
    - Example: `ModArrayList` inherits from `Arraylist`.

2. **Hierarchical Inheritance**: One parent class has multiple subclasses.
    - Example: `Person` has subclasses like `Distinguished Engineer` and `SDE1`.

3. **Multi-Level Inheritance**: A class inherits from another class, which is then inherited by another class.
    - Example: `Vehicle -> Car -> ElectricCar`.

### Java's Inheritance Support
- Java supports **single-level, hierarchical, and multi-level inheritance**.
- Java **does not support multiple or hybrid inheritance** to avoid complexity.

## Designing Better Systems with Inheritance
Understanding these inheritance types helps in designing systems that **reduce code duplication** and **improve maintainability**.

## Implementing Inheritance in Java
### Using `extends` Keyword
The `extends` keyword is used to have a subclass inherit properties and behaviors from a superclass.

### Constructor and `super` Keyword
Use `super` in the subclass constructor to call the superclass constructor, ensuring proper initialization of inherited attributes.

## Inheritance in Java's Standard Library
The `Stack` class in Java inherits from the `Vector` class, demonstrating inheritance.

- **Code Reusability**: The `Stack` class reuses methods from the `Vector` class (`addElement`, `removeElementAt`) instead of redefining them.
- **Flexibility**: This allows `Stack` to add new behaviors while leveraging tested implementations from `Vector`.

## Challenge: Reduce Redundant Code with Inheritance
### Objective:
Create a `ModArrayList` class that extends `ArrayList` to provide a method `getUsingMod` for retrieving items using a modulo operation to handle invalid indices.

### Implementation:
- Use inheritance to leverage the existing functionality of `ArrayList` instead of duplicating code.
- The `getUsingMod` method should:
    - Use the modulo operation to handle indices that are out of bounds.
    - Convert negative indices to positive.
    - Ensure the class retains all functionalities of `ArrayList` while adding the new method.

    


